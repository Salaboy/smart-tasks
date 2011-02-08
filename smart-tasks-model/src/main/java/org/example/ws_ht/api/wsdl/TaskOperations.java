package org.example.ws_ht.api.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.9
 * Mon Feb 07 20:30:48 ART 2011
 * Generated source version: 2.2.9
 * 
 */
 
@WebService(targetNamespace = "http://www.example.org/WS-HT/api/wsdl", name = "taskOperations")
@XmlSeeAlso({org.example.ws_ht.api.xsd.ObjectFactory.class, org.example.ws_ht.api.ObjectFactory.class, org.example.ws_ht.ObjectFactory.class})
public interface TaskOperations {

    @RequestWrapper(localName = "nominate", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Nominate")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/nominate")
    @ResponseWrapper(localName = "nominateResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.NominateResponse")
    public void nominate(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "organizationalEntity", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        org.example.ws_ht.TOrganizationalEntity organizationalEntity
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "getFault", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetFault")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getFault")
    @ResponseWrapper(localName = "getFaultResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetFaultResponse")
    public void getFault(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(mode = WebParam.Mode.INOUT, name = "faultName", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        javax.xml.ws.Holder<java.lang.String> faultName,
        @WebParam(mode = WebParam.Mode.OUT, name = "faultData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        javax.xml.ws.Holder<java.lang.Object> faultData
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault;

    @RequestWrapper(localName = "forward", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Forward")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/forward")
    @ResponseWrapper(localName = "forwardResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.ForwardResponse")
    public void forward(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "organizationalEntity", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        org.example.ws_ht.TOrganizationalEntity organizationalEntity
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "deleteOutput", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DeleteOutput")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/deleteOutput")
    @ResponseWrapper(localName = "deleteOutputResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DeleteOutputResponse")
    public void deleteOutput(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "renderingType", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getRenderingTypes", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetRenderingTypes")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getRenderingTypes")
    @ResponseWrapper(localName = "getRenderingTypesResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetRenderingTypesResponse")
    public java.util.List<javax.xml.namespace.QName> getRenderingTypes(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Object identifier
    ) throws IllegalArgumentFault;

    @WebResult(name = "comment", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getComments", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetComments")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getComments")
    @ResponseWrapper(localName = "getCommentsResposne", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetCommentsResposne")
    public java.util.List<org.example.ws_ht.api.TComment> getComments(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "addAttachment", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.AddAttachment")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/addAttachment")
    @ResponseWrapper(localName = "addAttachmentResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.AddAttachmentResponse")
    public void addAttachment(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "name", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String name,
        @WebParam(name = "accessType", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String accessType,
        @WebParam(name = "attachment", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Object attachment
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "activate", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Activate")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/activate")
    @ResponseWrapper(localName = "activateResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.ActivateResponse")
    public void activate(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "setOutput", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetOutput")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/setOutput")
    @ResponseWrapper(localName = "setOutputResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetOutputResponse")
    public void setOutput(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "part", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String part,
        @WebParam(name = "taskData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Object taskData
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "start", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Start")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/start")
    @ResponseWrapper(localName = "startResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.StartResponse")
    public void start(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "query", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "query", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Query")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/query")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.QueryResponse")
    public org.example.ws_ht.api.TTaskQueryResultSet query(
        @WebParam(name = "selectClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String selectClause,
        @WebParam(name = "whereClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String whereClause,
        @WebParam(name = "orderByClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String orderByClause,
        @WebParam(name = "maxTasks", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Integer maxTasks,
        @WebParam(name = "taskIndexOffset", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Integer taskIndexOffset
    ) throws IllegalArgumentFault, IllegalStateFault;

    @RequestWrapper(localName = "deleteAttachments", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DeleteAttachments")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/deleteAttachments")
    @ResponseWrapper(localName = "deleteAttachmentsResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DeleteAttachmentsResponse")
    public void deleteAttachments(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "attachmentName", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String attachmentName
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "taskAbstract", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getMyTaskAbstracts", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetMyTaskAbstracts")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getMyTaskAbstracts")
    @ResponseWrapper(localName = "getMyTaskAbstractsResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetMyTaskAbstractsResponse")
    public java.util.List<org.example.ws_ht.api.TTaskAbstract> getMyTaskAbstracts(
        @WebParam(name = "taskType", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String taskType,
        @WebParam(name = "genericHumanRole", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String genericHumanRole,
        @WebParam(name = "workQueue", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String workQueue,
        @WebParam(name = "status", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.util.List<org.example.ws_ht.api.TStatus> status,
        @WebParam(name = "whereClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String whereClause,
        @WebParam(name = "orderByClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String orderByClause,
        @WebParam(name = "createdOnClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String createdOnClause,
        @WebParam(name = "maxTasks", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Integer maxTasks,
        @WebParam(name = "fromTaskNumber", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Integer fromTaskNumber
    ) throws IllegalArgumentFault, IllegalStateFault;

    @RequestWrapper(localName = "skip", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Skip")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/skip")
    @ResponseWrapper(localName = "skipResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SkipResponse")
    public void skip(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault;

    @WebResult(name = "attachment", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getAttachments", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetAttachments")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getAttachments")
    @ResponseWrapper(localName = "getAttachmentsResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetAttachmentsResponse")
    public java.util.List<org.example.ws_ht.api.TAttachment> getAttachments(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "attachmentName", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String attachmentName
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "description", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getTaskDescription", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetTaskDescription")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getTaskDescription")
    @ResponseWrapper(localName = "getTaskDescriptionResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetTaskDescriptionResponse")
    public java.lang.String getTaskDescription(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "contentType", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String contentType
    ) throws IllegalArgumentFault;

    @RequestWrapper(localName = "release", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Release")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/release")
    @ResponseWrapper(localName = "releaseResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.ReleaseResponse")
    public void release(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "task", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getTaskInfo", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetTaskInfo")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getTaskInfo")
    @ResponseWrapper(localName = "getTaskInfoResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetTaskInfoResponse")
    public org.example.ws_ht.api.TTask getTaskInfo(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault;

    @RequestWrapper(localName = "remove", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Remove")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/remove")
    @ResponseWrapper(localName = "removeResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.RemoveResponse")
    public void remove(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalAccessFault;

    @RequestWrapper(localName = "suspend", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Suspend")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/suspend")
    @ResponseWrapper(localName = "suspendResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SuspendResponse")
    public void suspend(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "taskAbstract", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getMyTasks", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetMyTasks")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getMyTasks")
    @ResponseWrapper(localName = "getMyTasksResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetMyTasksResponse")
    public java.util.List<org.example.ws_ht.api.TTask> getMyTasks(
        @WebParam(name = "taskType", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String taskType,
        @WebParam(name = "genericHumanRole", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String genericHumanRole,
        @WebParam(name = "workQueue", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String workQueue,
        @WebParam(name = "status", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.util.List<org.example.ws_ht.api.TStatus> status,
        @WebParam(name = "whereClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String whereClause,
        @WebParam(name = "orderByClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String orderByClause,
        @WebParam(name = "createdOnClause", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String createdOnClause,
        @WebParam(name = "maxTasks", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Integer maxTasks,
        @WebParam(name = "fromTaskNumber", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Integer fromTaskNumber
    ) throws IllegalArgumentFault, IllegalStateFault;

    @RequestWrapper(localName = "setGenericHumanRole", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetGenericHumanRole")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/setGenericHumanRole")
    @ResponseWrapper(localName = "setGenericHumanRoleResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetGenericHumanRoleResponse")
    public void setGenericHumanRole(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "genericHumanRole", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String genericHumanRole,
        @WebParam(name = "organizationalEntity", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        org.example.ws_ht.TOrganizationalEntity organizationalEntity
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "taskData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getInput", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetInput")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getInput")
    @ResponseWrapper(localName = "getInputResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetInputResponse")
    public java.lang.Object getInput(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "part", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String part
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "rendering", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getRendering", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetRendering")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getRendering")
    @ResponseWrapper(localName = "getRenderingResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetRenderingResponse")
    public java.lang.Object getRendering(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "renderingType", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        javax.xml.namespace.QName renderingType
    ) throws IllegalArgumentFault;

    @RequestWrapper(localName = "setFault", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetFault")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/setFault")
    @ResponseWrapper(localName = "setFaultResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetFaultResponse")
    public void setFault(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "faultName", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String faultName,
        @WebParam(name = "faultData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Object faultData
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault;

    @RequestWrapper(localName = "delegate", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Delegate")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/delegate")
    @ResponseWrapper(localName = "delegateResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DelegateResponse")
    public void delegate(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "organizationalEntity", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        org.example.ws_ht.TOrganizationalEntity organizationalEntity
    ) throws RecipientNotAllowed, IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "stop", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Stop")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/stop")
    @ResponseWrapper(localName = "stopResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.StopResponse")
    public void stop(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "taskData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getOutput", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetOutput")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getOutput")
    @ResponseWrapper(localName = "getOutputResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetOutputResponse")
    public java.lang.Object getOutput(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "part", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String part
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @WebResult(name = "info", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
    @RequestWrapper(localName = "getAttachmentInfos", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetAttachmentInfos")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/getAttachmentInfos")
    @ResponseWrapper(localName = "getAttachmentInfosResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.GetAttachmentInfosResponse")
    public java.util.List<org.example.ws_ht.api.TAttachmentInfo> getAttachmentInfos(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "suspendUntil", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SuspendUntil")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/suspendUntil")
    @ResponseWrapper(localName = "suspendUntilResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SuspendUntilResponse")
    public void suspendUntil(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "time", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        org.example.ws_ht.api.xsd.TTime time
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "addComment", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.AddComment")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/addComment")
    @ResponseWrapper(localName = "addCommentResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.AddCommentResponse")
    public void addComment(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "text", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String text
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "complete", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Complete")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/complete")
    @ResponseWrapper(localName = "completeResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.CompleteResponse")
    public void complete(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "taskData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Object taskData
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "setPriority", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetPriority")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/setPriority")
    @ResponseWrapper(localName = "setPriorityResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.SetPriorityResponse")
    public void setPriority(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "priority", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.math.BigInteger priority
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "resume", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Resume")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/resume")
    @ResponseWrapper(localName = "resumeResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.ResumeResponse")
    public void resume(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "claim", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Claim")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/claim")
    @ResponseWrapper(localName = "claimResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.ClaimResponse")
    public void claim(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;

    @RequestWrapper(localName = "fail", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.Fail")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/fail")
    @ResponseWrapper(localName = "failResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.FailResponse")
    public void fail(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier,
        @WebParam(name = "faultName", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String faultName,
        @WebParam(name = "faultData", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.Object faultData
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalOperationFault, IllegalAccessFault;

    @RequestWrapper(localName = "deleteFault", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DeleteFault")
    @WebMethod(action = "http://www.example.org/WS-HT/api/wsdl/deleteFault")
    @ResponseWrapper(localName = "deleteFaultResponse", targetNamespace = "http://www.example.org/WS-HT/api/xsd", className = "org.example.ws_ht.api.xsd.DeleteFaultResponse")
    public void deleteFault(
        @WebParam(name = "identifier", targetNamespace = "http://www.example.org/WS-HT/api/xsd")
        java.lang.String identifier
    ) throws IllegalArgumentFault, IllegalStateFault, IllegalAccessFault;
}