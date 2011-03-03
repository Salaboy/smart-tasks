/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SimpleTaskList.java
 *
 * Created on Feb 25, 2011, 3:51:25 PM
 */
package com.wordpress.salaboy.smarttasks.client.swing;

import com.wordpress.salaboy.api.HumanTaskServiceOperations;
import com.wordpress.salaboy.smarttasks.metamodel.MetaTaskDecoratorBase;
import com.wordpress.salaboy.smarttasks.metamodel.MetaTaskDecoratorService;
import com.wordpress.salaboy.smarttasks.uihelper.api.ConnectionData;
import com.wordpress.salaboy.smarttasks.uihelper.api.SmartTaskUIHelper;
import com.wordpress.salaboy.smarttasks.uihelper.api.TaskListDataSet;
import com.wordpress.salaboy.smarttasks.uihelper.api.TaskListUIHelper;
import com.wordpress.salaboy.smarttasks.uihelper.configuration.UIHelperConfiguration;
import com.wordpress.salaboy.smarttasks.uihelper.configuration.UIHelperConfigurationProvider;
import com.wordpress.salaboy.smarttasks.uihelper.configuration.mock.MockConfigurationHandler;
import com.wordpress.salaboy.smarttasks.uihelper.configuration.mock.MockHumanTaskClientConfiguration;
import com.wordpress.salaboy.smarttasks.uihelper.configuration.mock.MockHumanTaskServiceOperations;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.example.ws_ht.api.TStatus;
import org.example.ws_ht.api.TTaskAbstract;
import org.example.ws_ht.api.wsdl.IllegalArgumentFault;
import org.example.ws_ht.api.wsdl.IllegalStateFault;

/**
 *
 * @author salaboy
 */
public class SimpleTaskList extends javax.swing.JDialog {

    /** Creates new form SimpleTaskList */
    public SimpleTaskList(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taskListjTextArea = new javax.swing.JTextArea();
        orgEntityjComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        profilejComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taskListjTextArea.setColumns(20);
        taskListjTextArea.setRows(5);
        jScrollPane1.setViewportView(taskListjTextArea);

        orgEntityjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Some_User", "Esteban", "SalaboyMeta" }));

        jButton1.setText("Get Task List!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        profilejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "taskList1", "taskList2", "taskList3" }));

        jLabel1.setText("OrgEntity:");

        jLabel2.setText("Profile");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 289, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(orgEntityjComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(41, 41, 41)
                        .add(jLabel2)
                        .add(11, 11, 11)))
                .add(profilejComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .add(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(profilejComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(jLabel2)
                    .add(orgEntityjComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton1)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MetaTaskDecoratorService.getInstance().registerDecorator("base", new MetaTaskDecoratorBase());
        File root = new File(Thread.currentThread().getContextClassLoader().getResource(("TaskListUIHelperTest/testProfiles")).getFile());
        UIHelperConfigurationProvider uIHelperConfigurationProvider = new UIHelperConfigurationProvider(root);
        uIHelperConfigurationProvider.addUIHelperConfigurationUriHandler(new MockConfigurationHandler(new MyHardcodedHumanTaskClientConfigurationMock()));
        UIHelperConfiguration configuration = uIHelperConfigurationProvider.createConfiguration(); 
        
        SmartTaskUIHelper helper = new SmartTaskUIHelper(configuration);

        //Connection
        ConnectionData connectionData = new ConnectionData();
        connectionData.setEntityId((String)orgEntityjComboBox.getItemAt(orgEntityjComboBox.getSelectedIndex()));
        helper.connect(connectionData);

        //taskList1 should take "Default" profile: 2 columns
        TaskListUIHelper taskListHelper = helper.getTaskListHelper((String)profilejComboBox.getItemAt(profilejComboBox.getSelectedIndex()), null);


        String[] columnHeaders = taskListHelper.getColumnHeaders();
        String headers = "";
        for(String header : columnHeaders){
            headers += "\t" + header + "|";
        }
        headers+="\n";
        TaskListDataSet dataSet = taskListHelper.getDataSet(0, 2);
        String[][] data = dataSet.getData();
        String content = "\n";
        for(String[] row : data){
            String currentRow = "";
            for(String column : row){
              currentRow += "\t" + column + "|";   
            }
            currentRow +="\n";
            content += currentRow;
        }
        
        taskListjTextArea.setText(headers + "----------------------------\n" + content);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                SimpleTaskList dialog = new SimpleTaskList(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgEntityjComboBox;
    private javax.swing.JComboBox profilejComboBox;
    private javax.swing.JTextArea taskListjTextArea;
    // End of variables declaration//GEN-END:variables
}
class MyHardcodedHumanTaskClientConfigurationMock extends MockHumanTaskClientConfiguration {

    @Override
    public HumanTaskServiceOperations getServiceOperationsImplementation() {
        return new MockHumanTaskServiceOperations() {

            @Override
            public void initializeService() {
            }

            @Override
            public void cleanUpService() {
            }

            @Override
            public List<TTaskAbstract> getMyTaskAbstracts(String taskType, String genericHumanRole, String workQueue, List<TStatus> status, String whereClause, String orderByClause, String createdOnClause, Integer maxTasks, Integer fromTaskNumber) throws IllegalArgumentFault, IllegalStateFault {
                List<TTaskAbstract> tasks = new ArrayList<TTaskAbstract>();

                //4 mock tasks
                for (int i = 0; i < 4; i++) {
                    TTaskAbstract taskAbstract = new TTaskAbstract();
                    taskAbstract.setId("" + i);
                    taskAbstract.setName(new QName("Task " + i));
                    tasks.add(taskAbstract);
                }

                if (fromTaskNumber == null) {
                    return tasks;
                } else {
                    return tasks.subList(fromTaskNumber, fromTaskNumber + maxTasks);
                }
            }
        };
    }
}