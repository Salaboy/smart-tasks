/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.smarttasks.jbpm5wrapper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import org.example.ws_ht.TOrganizationalEntity;
import org.example.ws_ht.api.TAttachment;
import org.example.ws_ht.api.TAttachmentInfo;
import org.example.ws_ht.api.TComment;
import org.example.ws_ht.api.TStatus;
import org.example.ws_ht.api.TTask;
import org.example.ws_ht.api.TTaskAbstract;
import org.example.ws_ht.api.TTaskQueryResultSet;
import org.example.ws_ht.api.wsdl.IllegalAccessFault;
import org.example.ws_ht.api.wsdl.IllegalArgumentFault;
import org.example.ws_ht.api.wsdl.IllegalOperationFault;
import org.example.ws_ht.api.wsdl.IllegalStateFault;
import org.example.ws_ht.api.wsdl.RecipientNotAllowed;
import org.example.ws_ht.api.wsdl.TaskOperations;
import org.example.ws_ht.api.xsd.TTime;
import org.jbpm.task.Attachment;
import org.jbpm.task.Task;
import org.jbpm.task.query.TaskSummary;
import org.jbpm.task.service.ContentData;
import org.jbpm.task.service.TaskClient;
import org.jbpm.task.service.responsehandlers.BlockingGetContentResponseHandler;
import org.jbpm.task.service.responsehandlers.BlockingGetTaskResponseHandler;
import org.jbpm.task.service.responsehandlers.BlockingTaskOperationResponseHandler;
import org.jbpm.task.service.responsehandlers.BlockingTaskSummaryResponseHandler;

/**
 *
 * @author salaboy
 */
public class JBPM5QueryClientWrapper implements TaskOperations {

    public TaskClient client;

    public JBPM5QueryClientWrapper(TaskClient client) {
        this.client = client;
    }

    public void nominate(String identifier, TOrganizationalEntity organizationalEntity) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void getFault(String identifier, Holder<String> faultName, Holder<Object> faultData) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void forward(String identifier, TOrganizationalEntity organizationalEntity) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteOutput(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<QName> getRenderingTypes(Object identifier) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<TComment> getComments(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addAttachment(String identifier, String name, String accessType, Object attachment) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void activate(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setOutput(String identifier, String part, Object taskData) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void start(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        Long taskId = Long.parseLong(identifier);
        
        //jBPM needs a user to start a task. Because the standard doesn't need
        //it, I will get the first potential owner of the task. PLEASE @FIXME
        BlockingGetTaskResponseHandler blockingGetTaskResponseHandler = new BlockingGetTaskResponseHandler();
        client.getTask(taskId, blockingGetTaskResponseHandler);
        Task task = blockingGetTaskResponseHandler.getTask();
        
        String userId =  task.getPeopleAssignments().getPotentialOwners().get(0).getId();
        
        client.start(taskId, userId , new BlockingTaskOperationResponseHandler());
    }

    public TTaskQueryResultSet query(String selectClause, String whereClause, String orderByClause, Integer maxTasks, Integer taskIndexOffset) throws IllegalArgumentFault, IllegalStateFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteAttachments(String identifier, String attachmentName) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<TTaskAbstract> getMyTaskAbstracts(String taskType, String genericHumanRole, String workQueue, List<TStatus> status, String whereClause, String orderByClause, String createdOnClause, Integer maxTasks, Integer fromTaskNumber) throws IllegalArgumentFault, IllegalStateFault {
        BlockingTaskSummaryResponseHandler handler  = new BlockingTaskSummaryResponseHandler();
        client.getTasksAssignedAsPotentialOwner(genericHumanRole, "en-UK", handler);
        List<TaskSummary> results = handler.getResults();
        return JBPM5TTaskAbstractAdapter.getInstance().adaptCollection(results);
    }

    public void skip(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<TAttachment> getAttachments(String identifier, String attachmentName) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        Long taskId = Long.parseLong(identifier);
        BlockingGetTaskResponseHandler blockingGetTaskResponseHandler = new BlockingGetTaskResponseHandler();
        client.getTask(taskId, blockingGetTaskResponseHandler);
        
        List<TAttachment> tAttachments = new ArrayList<TAttachment>();
        for (Attachment attachment : blockingGetTaskResponseHandler.getTask().getTaskData().getAttachments()) {
            if (attachment.getName().equals(attachmentName)){
                TAttachment tAttachment = new TAttachment();
                tAttachment.setAttachmentInfo(new JBPM5TAttachmentInfoAdapter().adapt(attachment));
                //@FIXME: is this the way to get the attachment content?
                BlockingGetContentResponseHandler blockingGetContentResponseHandler = new BlockingGetContentResponseHandler();
                client.getContent(attachment.getAttachmentContentId(), blockingGetContentResponseHandler);
                tAttachment.setValue(blockingGetContentResponseHandler.getContent());
                tAttachments.add(tAttachment);
            }
        }
        
        return tAttachments;
    }

    public String getTaskDescription(String identifier, String contentType) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void release(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public TTask getTaskInfo(String identifier) throws IllegalArgumentFault {
        Long taskId = Long.parseLong(identifier);
        BlockingGetTaskResponseHandler blockingGetTaskResponseHandler = new BlockingGetTaskResponseHandler();
        client.getTask(taskId, blockingGetTaskResponseHandler);
        
        return JBPM5TTaskAdapter.getInstance().adapt(blockingGetTaskResponseHandler.getTask());
    }

    public void remove(String identifier) throws IllegalArgumentFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void suspend(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<TTask> getMyTasks(String taskType, String genericHumanRole, String workQueue, List<TStatus> status, String whereClause, String orderByClause, String createdOnClause, Integer maxTasks, Integer fromTaskNumber) throws IllegalArgumentFault, IllegalStateFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setGenericHumanRole(String identifier, String genericHumanRole, TOrganizationalEntity organizationalEntity) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getInput(String identifier, String part) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getRendering(String identifier, QName renderingType) throws IllegalArgumentFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFault(String identifier, String faultName, Object faultData) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delegate(String identifier, TOrganizationalEntity organizationalEntity) throws RecipientNotAllowed, IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void stop(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getOutput(String identifier, String part) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<TAttachmentInfo> getAttachmentInfos(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        Long taskId = Long.parseLong(identifier);
        BlockingGetTaskResponseHandler blockingGetTaskResponseHandler = new BlockingGetTaskResponseHandler();
        client.getTask(taskId, blockingGetTaskResponseHandler);
        
        return new JBPM5TAttachmentInfoAdapter().adaptCollection(blockingGetTaskResponseHandler.getTask().getTaskData().getAttachments());
    }

    public void suspendUntil(String identifier, TTime time) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addComment(String identifier, String text) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void complete(String identifier, Object taskData) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        long taskId = Long.parseLong(identifier);
        
        //jBPM needs a user to start a task. Because the standard doesn't need
        //it, I will get the first potential owner of the task. PLEASE @FIXME
        BlockingGetTaskResponseHandler blockingGetTaskResponseHandler = new BlockingGetTaskResponseHandler();
        client.getTask(taskId, blockingGetTaskResponseHandler);
        Task task = blockingGetTaskResponseHandler.getTask();
        String userId =  task.getPeopleAssignments().getPotentialOwners().get(0).getId();
        
        client.complete(taskId, userId, (ContentData) taskData, null);
    }

    public void setPriority(String identifier, BigInteger priority) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void resume(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void claim(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void fail(String identifier, String faultName, Object faultData) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteFault(String identifier) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
