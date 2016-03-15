[Ivy]
[>Created: Fri Jul 01 11:44:43 CEST 2011]
130B26548B9CA377 3.17 #module
>Proto >Proto Collection #zClass
st0 start Big #zClass
st0 B #cInfo
st0 #process
st0 @TextInP .resExport .resExport #zField
st0 @TextInP .type .type #zField
st0 @TextInP .processKind .processKind #zField
st0 @AnnotationInP-0n ai ai #zField
st0 @TextInP .xml .xml #zField
st0 @TextInP .responsibility .responsibility #zField
st0 @StartRequest f0 '' #zField
st0 @EndTask f1 '' #zField
st0 @RichDialog f2 '' #zField
st0 @PushWFArc f3 '' #zField
st0 @PushWFArc f4 '' #zField
>Proto st0 st0 start #zField
st0 f0 outLink start_application.ivp #txt
st0 f0 type xtrans.Data #txt
st0 f0 inParamDecl '<> param;' #txt
st0 f0 actionDecl 'xtrans.Data out;
' #txt
st0 f0 guid 130B265708247E5D #txt
st0 f0 requestEnabled true #txt
st0 f0 triggerEnabled false #txt
st0 f0 callSignature start_application() #txt
st0 f0 persist false #txt
st0 f0 startName 'Start the cmsTranslator' #txt
st0 f0 taskData '#
#Fri Jul 01 08:17:40 CEST 2011
TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody
' #txt
st0 f0 caseData '#
#Fri Jul 01 08:17:40 CEST 2011
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
st0 f0 showInStartList 1 #txt
st0 f0 taskAndCaseSetupAction 'import ch.ivyteam.ivy.workflow.TaskUpdateDefinition;
ch.ivyteam.ivy.workflow.TaskUpdateDefinition taskUpdDef = new ch.ivyteam.ivy.workflow.TaskUpdateDefinition();taskUpdDef.setPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
taskUpdDef.setExpiryActivator("Everybody");
taskUpdDef.setExpiryPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
engine.updateCurrentTask(taskUpdDef);
' #txt
st0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start_app.ivp</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
st0 f0 @C|.responsibility Everybody #txt
st0 f0 187 67 26 26 14 0 #rect
st0 f0 @|StartRequestIcon #fIcon
st0 f1 type xtrans.Data #txt
st0 f1 187 251 26 26 14 0 #rect
st0 f1 @|EndIcon #fIcon
st0 f2 targetWindow NEW:card: #txt
st0 f2 targetDisplay TOP #txt
st0 f2 richDialogId ch.xpertline.xtrans.cmsTool #txt
st0 f2 startMethod start() #txt
st0 f2 type xtrans.Data #txt
st0 f2 requestActionDecl '<> param;' #txt
st0 f2 responseActionDecl 'xtrans.Data out;
' #txt
st0 f2 responseMappingAction 'out=in;
' #txt
st0 f2 windowConfiguration '{/title "cmsTranslator"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
st0 f2 isAsynch false #txt
st0 f2 isInnerRd false #txt
st0 f2 userContext '* ' #txt
st0 f2 182 164 36 24 20 -2 #rect
st0 f2 @|RichDialogIcon #fIcon
st0 f3 expr out #txt
st0 f3 200 93 200 164 #arcP
st0 f4 expr out #txt
st0 f4 200 188 200 251 #arcP
>Proto st0 .type xtrans.Data #txt
>Proto st0 .processKind NORMAL #txt
>Proto st0 0 0 32 24 18 0 #rect
>Proto st0 @|BIcon #fIcon
st0 f0 mainOut f3 tail #connect
st0 f3 head f2 mainIn #connect
st0 f2 mainOut f4 tail #connect
st0 f4 head f1 mainIn #connect
