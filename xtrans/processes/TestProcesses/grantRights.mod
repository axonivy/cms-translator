[Ivy]
[>Created: Tue May 17 12:53:29 CEST 2011]
12FE32E813BD3045 3.17 #module
>Proto >Proto Collection #zClass
gs0 grantRights Big #zClass
gs0 B #cInfo
gs0 #process
gs0 @TextInP .resExport .resExport #zField
gs0 @TextInP .type .type #zField
gs0 @TextInP .processKind .processKind #zField
gs0 @AnnotationInP-0n ai ai #zField
gs0 @TextInP .xml .xml #zField
gs0 @TextInP .responsibility .responsibility #zField
gs0 @StartRequest f0 '' #zField
gs0 @EndTask f1 '' #zField
gs0 @GridStep f2 '' #zField
gs0 @PushWFArc f3 '' #zField
gs0 @PushWFArc f4 '' #zField
>Proto gs0 gs0 grantRights #zField
gs0 f0 outLink grantRights.ivp #txt
gs0 f0 type xtrans.Data #txt
gs0 f0 inParamDecl '<> param;' #txt
gs0 f0 actionDecl 'xtrans.Data out;
' #txt
gs0 f0 guid 12FE320B3CBEC4E1 #txt
gs0 f0 requestEnabled true #txt
gs0 f0 triggerEnabled false #txt
gs0 f0 callSignature grantRights() #txt
gs0 f0 persist false #txt
gs0 f0 startName grantRights #txt
gs0 f0 taskData '#
#Thu May 12 09:35:21 CEST 2011
TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody
' #txt
gs0 f0 caseData '#
#Thu May 12 09:35:21 CEST 2011
businessCreator.user=
businessMilestone.timestamp=
businessObject.code=
businessObject.docDb.code=
businessObject.folder.id=
businessObject.name=
businessPriority=
businessStart.timestamp=
case.description=
case.name=
correspondent.id=
mainContact.docDb.code=
mainContact.folder.id=
mainContact.id=
mainContact.name=
mainContact.type=
process.code=
process.name=
processCategory.code=
processCategory.name=
subType.code=
subType.name=
type.code=
type.name=
' #txt
gs0 f0 showInStartList 1 #txt
gs0 f0 taskAndCaseSetupAction 'import ch.ivyteam.ivy.workflow.TaskUpdateDefinition;
ch.ivyteam.ivy.workflow.TaskUpdateDefinition taskUpdDef = new ch.ivyteam.ivy.workflow.TaskUpdateDefinition();taskUpdDef.setPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
taskUpdDef.setExpiryActivator("Everybody");
taskUpdDef.setExpiryPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
engine.updateCurrentTask(taskUpdDef);
' #txt
gs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>grantRights</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
gs0 f0 @C|.responsibility Everybody #txt
gs0 f0 67 51 26 26 14 0 #rect
gs0 f0 @|StartRequestIcon #fIcon
gs0 f1 type xtrans.Data #txt
gs0 f1 67 187 26 26 14 0 #rect
gs0 f1 @|EndIcon #fIcon
gs0 f2 actionDecl 'xtrans.Data out;
' #txt
gs0 f2 actionTable 'out=in;
' #txt
gs0 f2 actionCode 'ivy.session.loginSessionUser("Developer","Developer");
ivy.wf.getApplication().getSecurityDescriptor().grantPermissions(
                ivy.wf.getApplication().getSecurityDescriptor().getSecurityDescriptorType().getRootPermissionGroup(),
                ivy.session.getSecurityContext().findRole("Everybody")
);
ivy.session.logoutSessionUser(ivy.task.getIdentifier());


' #txt
gs0 f2 type xtrans.Data #txt
gs0 f2 62 116 36 24 20 -2 #rect
gs0 f2 @|StepIcon #fIcon
gs0 f3 expr out #txt
gs0 f3 80 77 80 116 #arcP
gs0 f4 expr out #txt
gs0 f4 80 140 80 187 #arcP
>Proto gs0 .type xtrans.Data #txt
>Proto gs0 .processKind NORMAL #txt
>Proto gs0 0 0 32 24 18 0 #rect
>Proto gs0 @|BIcon #fIcon
gs0 f0 mainOut f3 tail #connect
gs0 f3 head f2 mainIn #connect
gs0 f2 mainOut f4 tail #connect
gs0 f4 head f1 mainIn #connect
