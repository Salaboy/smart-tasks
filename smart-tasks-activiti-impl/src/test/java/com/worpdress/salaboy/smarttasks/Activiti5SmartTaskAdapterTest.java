/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.worpdress.salaboy.smarttasks;

import org.activiti.engine.FormService;
import org.example.ws_ht.api.TTaskAbstract;
import org.activiti.engine.task.Task;
import com.wordpress.salaboy.api.HumanTaskClientRegistry;
import com.wordpress.salaboy.smarttasks.activiti5wrapper.Activiti5HumanTaskServiceOperations;
import java.util.List;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.example.ws_ht.api.wsdl.IllegalArgumentFault;
import org.example.ws_ht.api.wsdl.IllegalStateFault;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salaboy
 */
public class Activiti5SmartTaskAdapterTest {
    private TaskService taskService;
    private FormService formService;

    public Activiti5SmartTaskAdapterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        assertNotNull(processEngine);
        taskService = processEngine.getTaskService();
        formService = processEngine.getFormService();
        assertNotNull(taskService);
        initSampleTask();
        HumanTaskClientRegistry.getInstance().addQueryClient("Activiti5Query", new Activiti5HumanTaskServiceOperations(taskService, formService));
        
    }

    @After
    public void tearDown() {
    }

   
     @Test
     public void hello() throws IllegalArgumentFault, IllegalStateFault {
      
        
        List<TTaskAbstract> tasks = HumanTaskClientRegistry.getInstance().getQueryClient("Activiti5Query").getMyTaskAbstracts("","salaboy","",null,"","","",0,0);
        assertEquals(1, tasks.size());
     }

    private void initSampleTask() {
        Task task = taskService.newTask();
        task.setName("First Task");
        task.setDescription("This is the first Task");
        task.setPriority(10);
        taskService.saveTask(task);
        taskService.setAssignee(task.getId(), "salaboy");
    }

}