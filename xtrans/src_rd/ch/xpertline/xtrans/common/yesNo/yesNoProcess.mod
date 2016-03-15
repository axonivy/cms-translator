[Ivy]
[>Created: Tue May 31 12:26:54 CEST 2011]
1303FF947381E8FF 3.17 #module
>Proto >Proto Collection #zClass
ys0 yesNoProcess Big #zClass
ys0 RD #cInfo
ys0 #process
ys0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ys0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ys0 @TextInP .resExport .resExport #zField
ys0 @TextInP .type .type #zField
ys0 @TextInP .processKind .processKind #zField
ys0 @AnnotationInP-0n ai ai #zField
ys0 @TextInP .xml .xml #zField
ys0 @TextInP .responsibility .responsibility #zField
ys0 @RichDialogInitStart f0 '' #zField
ys0 @RichDialogProcessEnd f1 '' #zField
ys0 @PushWFArc f2 '' #zField
ys0 @RichDialogProcessStep f3 '' #zField
ys0 @RichDialogInitStart f4 '' #zField
ys0 @PushWFArc f5 '' #zField
ys0 @PushWFArc f6 '' #zField
ys0 @RichDialogProcessStart f7 '' #zField
ys0 @RichDialogProcessStart f8 '' #zField
ys0 @RichDialogEnd f9 '' #zField
ys0 @PushWFArc f10 '' #zField
ys0 @PushWFArc f11 '' #zField
>Proto ys0 ys0 yesNoProcess #zField
ys0 f0 guid 1303FF94767AC4E5 #txt
ys0 f0 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f0 method start() #txt
ys0 f0 disableUIEvents true #txt
ys0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ys0 f0 outParameterDecl '<> result;
' #txt
ys0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
ys0 f0 90 40 20 20 13 0 #rect
ys0 f0 @|RichDialogInitStartIcon #fIcon
ys0 f1 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f1 90 140 20 20 13 0 #rect
ys0 f1 @|RichDialogProcessEndIcon #fIcon
ys0 f2 expr out #txt
ys0 f2 100 60 100 140 #arcP
ys0 f3 actionDecl 'ch.xpertline.xtrans.common.yesNo.yesNoData out;
' #txt
ys0 f3 actionTable 'out=in;
' #txt
ys0 f3 actionCode '
if (in.type.startsWith("warn")){
	panel.Label.setIconUri("/ch/ivyteam/xtrans/icons/dialog/warn");
}else if(in.type.startsWith("error")){
	panel.Label.setIconUri("/ch/ivyteam/xtrans/icons/dialog/error");
}else if(in.type.startsWith("info")){
	panel.Label.setIconUri("/ch/ivyteam/xtrans/icons/dialog/info");
} else {
	panel.Label.setIconUri("");
}' #txt
ys0 f3 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f3 174 138 36 24 20 -2 #rect
ys0 f3 @|RichDialogProcessStepIcon #fIcon
ys0 f4 guid 130400942116DF6A #txt
ys0 f4 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f4 method start(String,String) #txt
ys0 f4 disableUIEvents true #txt
ys0 f4 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String message,java.lang.String type> param = methodEvent.getInputArguments();
' #txt
ys0 f4 inParameterMapAction 'out.message=param.message;
out.type=param.type.trim().toLowerCase();
' #txt
ys0 f4 outParameterDecl '<java.lang.String result> result;
' #txt
ys0 f4 outParameterMapAction 'result.result=in.result;
' #txt
ys0 f4 embeddedRdInitializations '* ' #txt
ys0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String,String)</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ys0 f4 182 40 20 20 13 0 #rect
ys0 f4 @|RichDialogInitStartIcon #fIcon
ys0 f5 expr out #txt
ys0 f5 192 60 192 138 #arcP
ys0 f6 expr out #txt
ys0 f6 174 150 110 150 #arcP
ys0 f7 guid 13040100975FEE71 #txt
ys0 f7 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f7 actionDecl 'ch.xpertline.xtrans.common.yesNo.yesNoData out;
' #txt
ys0 f7 actionTable 'out=in;
out.result="y";
' #txt
ys0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes_Click()</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ys0 f7 182 182 20 20 -73 1 #rect
ys0 f7 @|RichDialogProcessStartIcon #fIcon
ys0 f8 guid 1304010147E3DD19 #txt
ys0 f8 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f8 actionDecl 'ch.xpertline.xtrans.common.yesNo.yesNoData out;
' #txt
ys0 f8 actionTable 'out=in;
out.result="n";
' #txt
ys0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no_Click()</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ys0 f8 182 230 20 20 -71 -1 #rect
ys0 f8 @|RichDialogProcessStartIcon #fIcon
ys0 f9 type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
ys0 f9 guid 13040104C06F1DAC #txt
ys0 f9 238 278 20 20 13 0 #rect
ys0 f9 @|RichDialogEndIcon #fIcon
ys0 f10 expr out #txt
ys0 f10 202 192 248 278 #arcP
ys0 f10 1 248 192 #addKink
ys0 f10 1 0.20401547742012316 0 0 #arcLabel
ys0 f11 expr out #txt
ys0 f11 202 240 248 278 #arcP
ys0 f11 1 248 240 #addKink
ys0 f11 0 0.9230970092020652 0 0 #arcLabel
>Proto ys0 .rdData2UIAction 'panel.lbl_message.text=in.message;
' #txt
>Proto ys0 .type ch.xpertline.xtrans.common.yesNo.yesNoData #txt
>Proto ys0 .processKind RICH_DIALOG #txt
>Proto ys0 -8 -8 16 16 16 26 #rect
>Proto ys0 '' #fIcon
ys0 f0 mainOut f2 tail #connect
ys0 f2 head f1 mainIn #connect
ys0 f4 mainOut f5 tail #connect
ys0 f5 head f3 mainIn #connect
ys0 f3 mainOut f6 tail #connect
ys0 f6 head f1 mainIn #connect
ys0 f7 mainOut f10 tail #connect
ys0 f10 head f9 mainIn #connect
ys0 f8 mainOut f11 tail #connect
ys0 f11 head f9 mainIn #connect
