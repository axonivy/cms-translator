[Ivy]
[>Created: Fri Jul 01 07:26:33 CEST 2011]
12FE32EBC1CDB105 3.17 #module
>Proto >Proto Collection #zClass
tt0 test Big #zClass
tt0 B #cInfo
tt0 #process
tt0 @TextInP .resExport .resExport #zField
tt0 @TextInP .type .type #zField
tt0 @TextInP .processKind .processKind #zField
tt0 @AnnotationInP-0n ai ai #zField
tt0 @TextInP .xml .xml #zField
tt0 @TextInP .responsibility .responsibility #zField
tt0 @StartRequest f3 '' #zField
tt0 @EndTask f5 '' #zField
tt0 @RichDialog f6 '' #zField
tt0 @PushWFArc f8 '' #zField
tt0 @PushWFArc f9 '' #zField
>Proto tt0 tt0 test #zField
tt0 f3 outLink start_beta.ivp #txt
tt0 f3 type xtrans.Data #txt
tt0 f3 inParamDecl '<> param;' #txt
tt0 f3 actionDecl 'xtrans.Data out;
' #txt
tt0 f3 guid 12FE44C4232E8FCD #txt
tt0 f3 requestEnabled true #txt
tt0 f3 triggerEnabled false #txt
tt0 f3 callSignature start_beta() #txt
tt0 f3 persist false #txt
tt0 f3 startName 'Start NOW the incredible new CMSTranslati0n Tool.beta' #txt
tt0 f3 startDescription 'Démarrer MAINTENANT l''incroyable nouvelle CMSTranslati0n Tool
Starten Sie nun das unglaubliche neue CMSTranslati0n Tool
Започни сега на невероятни нови CMSTranslati0n Tool
Filloni TANI pabesueshme të reja CMSTranslati0n Tool
Başlangıç ​​YAPIN inanılmaz yeni CMSTranslati0n Tool
Začít už teď neuvěřitelný nové CMSTranslati0n Tool
Starte nu den fantastiske nye CMSTranslati0n Tool
Bắt đầu ngay bây giờ mới lạ CMSTranslati0n Tool
' #txt
tt0 f3 taskData '#
#Fri Jul 01 07:26:30 CEST 2011
TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody
' #txt
tt0 f3 caseData '#
#Fri Jul 01 07:26:30 CEST 2011
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
tt0 f3 showInStartList 0 #txt
tt0 f3 taskAndCaseSetupAction 'import ch.ivyteam.ivy.workflow.TaskUpdateDefinition;
ch.ivyteam.ivy.workflow.TaskUpdateDefinition taskUpdDef = new ch.ivyteam.ivy.workflow.TaskUpdateDefinition();taskUpdDef.setPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
taskUpdDef.setExpiryActivator("Everybody");
taskUpdDef.setExpiryPriority(ch.ivyteam.ivy.workflow.WorkflowPriority.valueOf(2));
engine.updateCurrentTask(taskUpdDef);
' #txt
tt0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start_beta.ivp</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tt0 f3 @C|.responsibility Everybody #txt
tt0 f3 187 59 26 26 14 0 #rect
tt0 f3 @|StartRequestIcon #fIcon
tt0 f5 type xtrans.Data #txt
tt0 f5 155 331 26 26 14 0 #rect
tt0 f5 @|EndIcon #fIcon
tt0 f6 targetWindow NEW:card: #txt
tt0 f6 targetDisplay TOP #txt
tt0 f6 richDialogId ch.xpertline.xtrans.cmsTool #txt
tt0 f6 startMethod start() #txt
tt0 f6 type xtrans.Data #txt
tt0 f6 requestActionDecl '<> param;' #txt
tt0 f6 responseActionDecl 'xtrans.Data out;
' #txt
tt0 f6 responseMappingAction 'out=in;
' #txt
tt0 f6 windowConfiguration '{/title "cmsTranslat0r.beta"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
tt0 f6 isAsynch false #txt
tt0 f6 isInnerRd false #txt
tt0 f6 userContext '* ' #txt
tt0 f6 174 188 36 24 20 -2 #rect
tt0 f6 @|RichDialogIcon #fIcon
tt0 f8 expr out #txt
tt0 f8 188 77 210 200 #arcP
tt0 f8 1 40 144 #addKink
tt0 f8 2 64 328 #addKink
tt0 f8 3 160 320 #addKink
tt0 f8 4 136 352 #addKink
tt0 f8 5 168 376 #addKink
tt0 f8 6 376 152 #addKink
tt0 f8 7 168 104 #addKink
tt0 f8 8 64 152 #addKink
tt0 f8 9 80 304 #addKink
tt0 f8 10 184 304 #addKink
tt0 f8 11 280 200 #addKink
tt0 f8 12 272 160 #addKink
tt0 f8 13 152 144 #addKink
tt0 f8 14 96 176 #addKink
tt0 f8 15 128 264 #addKink
tt0 f8 16 200 248 #addKink
tt0 f8 17 240 200 #addKink
tt0 f8 1 0.13271179742222697 0 0 #arcLabel
tt0 f9 expr out #txt
tt0 f9 192 212 176 334 #arcP
tt0 f9 1 192 232 #addKink
tt0 f9 2 144 240 #addKink
tt0 f9 3 128 192 #addKink
tt0 f9 4 176 160 #addKink
tt0 f9 5 224 168 #addKink
tt0 f9 6 264 192 #addKink
tt0 f9 7 200 272 #addKink
tt0 f9 8 128 280 #addKink
tt0 f9 9 104 272 #addKink
tt0 f9 10 80 160 #addKink
tt0 f9 11 168 120 #addKink
tt0 f9 12 336 160 #addKink
tt0 f9 12 0.17484247635895112 0 0 #arcLabel
>Proto tt0 .type xtrans.Data #txt
>Proto tt0 .processKind NORMAL #txt
>Proto tt0 0 0 32 24 18 0 #rect
>Proto tt0 @|BIcon #fIcon
tt0 f3 mainOut f8 tail #connect
tt0 f8 head f6 mainIn #connect
tt0 f6 mainOut f9 tail #connect
tt0 f9 head f5 mainIn #connect
