[Ivy]
[>Created: Tue May 31 12:28:05 CEST 2011]
13045901FD521F3E 3.17 #module
>Proto >Proto Collection #zClass
ms0 messageProcess Big #zClass
ms0 RD #cInfo
ms0 #process
ms0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ms0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ms0 @TextInP .resExport .resExport #zField
ms0 @TextInP .type .type #zField
ms0 @TextInP .processKind .processKind #zField
ms0 @AnnotationInP-0n ai ai #zField
ms0 @TextInP .xml .xml #zField
ms0 @TextInP .responsibility .responsibility #zField
ms0 @RichDialogInitStart f0 '' #zField
ms0 @RichDialogProcessEnd f1 '' #zField
ms0 @PushWFArc f2 '' #zField
ms0 @RichDialogInitStart f3 '' #zField
ms0 @RichDialogProcessStart f5 '' #zField
ms0 @RichDialogEnd f6 '' #zField
ms0 @PushWFArc f7 '' #zField
ms0 @RichDialogProcessStep f8 '' #zField
ms0 @PushWFArc f9 '' #zField
ms0 @PushWFArc f4 '' #zField
>Proto ms0 ms0 messageProcess #zField
ms0 f0 guid 13045901FDFE95AB #txt
ms0 f0 type ch.xpertline.xtrans.common.message.messageData #txt
ms0 f0 method start() #txt
ms0 f0 disableUIEvents true #txt
ms0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ms0 f0 outParameterDecl '<> result;
' #txt
ms0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
ms0 f0 90 40 20 20 13 0 #rect
ms0 f0 @|RichDialogInitStartIcon #fIcon
ms0 f1 type ch.xpertline.xtrans.common.message.messageData #txt
ms0 f1 90 140 20 20 13 0 #rect
ms0 f1 @|RichDialogProcessEndIcon #fIcon
ms0 f2 expr out #txt
ms0 f2 100 60 100 140 #arcP
ms0 f3 guid 130459486461CF4F #txt
ms0 f3 type ch.xpertline.xtrans.common.message.messageData #txt
ms0 f3 method start(String,String) #txt
ms0 f3 disableUIEvents true #txt
ms0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String message,java.lang.String type> param = methodEvent.getInputArguments();
' #txt
ms0 f3 inParameterMapAction 'out.message=param.message;
out.type=param.type.trim().toLowerCase();
' #txt
ms0 f3 outParameterDecl '<> result;
' #txt
ms0 f3 embeddedRdInitializations '* ' #txt
ms0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String,String)</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ms0 f3 166 78 20 20 13 0 #rect
ms0 f3 @|RichDialogInitStartIcon #fIcon
ms0 f5 guid 1304594F7082938A #txt
ms0 f5 type ch.xpertline.xtrans.common.message.messageData #txt
ms0 f5 actionDecl 'ch.xpertline.xtrans.common.message.messageData out;
' #txt
ms0 f5 actionTable 'out=in;
' #txt
ms0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok_Click</name>
        <nameStyle>8,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ms0 f5 246 166 20 20 13 0 #rect
ms0 f5 @|RichDialogProcessStartIcon #fIcon
ms0 f6 type ch.xpertline.xtrans.common.message.messageData #txt
ms0 f6 guid 13045951EB97C823 #txt
ms0 f6 246 214 20 20 13 0 #rect
ms0 f6 @|RichDialogEndIcon #fIcon
ms0 f7 expr out #txt
ms0 f7 256 186 256 214 #arcP
ms0 f8 actionDecl 'ch.xpertline.xtrans.common.message.messageData out;
' #txt
ms0 f8 actionTable 'out=in;
' #txt
ms0 f8 actionCode '
if (in.type.startsWith("warn")){
	panel.icon.setIconUri("/ch/ivyteam/xtrans/icons/dialog/warn");
}else if(in.type.startsWith("error")){
	panel.icon.setIconUri("/ch/ivyteam/xtrans/icons/dialog/error");
}else if(in.type.startsWith("info")){
	panel.icon.setIconUri("/ch/ivyteam/xtrans/icons/dialog/info");
} else {
	panel.icon.setIconUri("");
}

panel.message.setText(in.message);' #txt
ms0 f8 type ch.xpertline.xtrans.common.message.messageData #txt
ms0 f8 158 138 36 24 20 -2 #rect
ms0 f8 @|RichDialogProcessStepIcon #fIcon
ms0 f9 expr out #txt
ms0 f9 166 88 170 138 #arcP
ms0 f9 1 144 88 #addKink
ms0 f9 1 0.3423518437263835 0 0 #arcLabel
ms0 f4 expr out #txt
ms0 f4 158 150 110 150 #arcP
>Proto ms0 .type ch.xpertline.xtrans.common.message.messageData #txt
>Proto ms0 .processKind RICH_DIALOG #txt
>Proto ms0 -8 -8 16 16 16 26 #rect
>Proto ms0 '' #fIcon
ms0 f0 mainOut f2 tail #connect
ms0 f2 head f1 mainIn #connect
ms0 f5 mainOut f7 tail #connect
ms0 f7 head f6 mainIn #connect
ms0 f3 mainOut f9 tail #connect
ms0 f9 head f8 mainIn #connect
ms0 f8 mainOut f4 tail #connect
ms0 f4 head f1 mainIn #connect
