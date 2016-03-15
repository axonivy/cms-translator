[Ivy]
[>Created: Tue May 31 12:09:26 CEST 2011]
130456F91BCBE0A4 3.17 #module
>Proto >Proto Collection #zClass
ns0 nameInputBoxProcess Big #zClass
ns0 RD #cInfo
ns0 #process
ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ns0 @TextInP .resExport .resExport #zField
ns0 @TextInP .type .type #zField
ns0 @TextInP .processKind .processKind #zField
ns0 @AnnotationInP-0n ai ai #zField
ns0 @TextInP .xml .xml #zField
ns0 @TextInP .responsibility .responsibility #zField
ns0 @RichDialogInitStart f0 '' #zField
ns0 @RichDialogProcessEnd f1 '' #zField
ns0 @PushWFArc f2 '' #zField
ns0 @RichDialogInitStart f3 '' #zField
ns0 @PushWFArc f4 '' #zField
ns0 @RichDialogProcessStart f5 '' #zField
ns0 @RichDialogProcessStart f6 '' #zField
ns0 @RichDialogEnd f7 '' #zField
ns0 @PushWFArc f9 '' #zField
ns0 @Alternative f10 '' #zField
ns0 @PushWFArc f11 '' #zField
ns0 @PushWFArc f8 '' #zField
ns0 @PushWFArc f12 '' #zField
>Proto ns0 ns0 nameInputBoxProcess #zField
ns0 f0 guid 130456F91CB9C46B #txt
ns0 f0 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f0 method start() #txt
ns0 f0 disableUIEvents true #txt
ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ns0 f0 outParameterDecl '<> result;
' #txt
ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
ns0 f0 90 40 20 20 13 0 #rect
ns0 f0 @|RichDialogInitStartIcon #fIcon
ns0 f1 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f1 90 140 20 20 13 0 #rect
ns0 f1 @|RichDialogProcessEndIcon #fIcon
ns0 f2 expr out #txt
ns0 f2 100 60 100 140 #arcP
ns0 f3 guid 130457CF53CA003C #txt
ns0 f3 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f3 method startWithOutput() #txt
ns0 f3 disableUIEvents true #txt
ns0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ns0 f3 outParameterDecl '<java.lang.String result,java.lang.String name> result;
' #txt
ns0 f3 outParameterMapAction 'result.result=in.answer;
result.name=in.name;
' #txt
ns0 f3 embeddedRdInitializations '* ' #txt
ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startWithOutput()</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f3 158 78 20 20 13 0 #rect
ns0 f3 @|RichDialogInitStartIcon #fIcon
ns0 f4 expr out #txt
ns0 f4 158 88 105 141 #arcP
ns0 f4 1 136 88 #addKink
ns0 f4 1 0.3010633544840828 0 0 #arcLabel
ns0 f5 guid 130457DF35121610 #txt
ns0 f5 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f5 actionDecl 'ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData out;
' #txt
ns0 f5 actionTable 'out=in;
out.answer="n";
out.name="";
' #txt
ns0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f5 174 206 20 20 -43 -17 #rect
ns0 f5 @|RichDialogProcessStartIcon #fIcon
ns0 f6 guid 130457DFFE037539 #txt
ns0 f6 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f6 actionDecl 'ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData out;
' #txt
ns0 f6 actionTable 'out=in;
out.answer="y";
out.name=panel.input.getValueAsString();
' #txt
ns0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f6 102 246 20 20 -27 -11 #rect
ns0 f6 @|RichDialogProcessStartIcon #fIcon
ns0 f7 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f7 guid 130457E0899369C9 #txt
ns0 f7 214 302 20 20 13 0 #rect
ns0 f7 @|RichDialogEndIcon #fIcon
ns0 f9 expr out #txt
ns0 f9 194 216 224 302 #arcP
ns0 f9 1 224 216 #addKink
ns0 f9 1 0.2788503277191687 0 0 #arcLabel
ns0 f10 type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
ns0 f10 162 242 28 28 14 0 #rect
ns0 f10 @|AlternativeIcon #fIcon
ns0 f11 expr out #txt
ns0 f11 122 256 162 256 #arcP
ns0 f11 0 0.7268382253681664 0 0 #arcLabel
ns0 f8 expr in #txt
ns0 f8 outCond panel.ok.enabled #txt
ns0 f8 176 270 234 312 #arcP
ns0 f8 1 176 344 #addKink
ns0 f8 2 264 344 #addKink
ns0 f8 3 264 312 #addKink
ns0 f8 0 0.8569974399860859 0 0 #arcLabel
ns0 f12 expr in #txt
ns0 f12 176 242 95 159 #arcP
ns0 f12 1 176 232 #addKink
ns0 f12 2 80 232 #addKink
ns0 f12 3 80 192 #addKink
ns0 f12 1 0.7296832413471195 0 0 #arcLabel
>Proto ns0 .type ch.xpertline.xtrans.common.nameInputBox.nameInputBoxData #txt
>Proto ns0 .processKind RICH_DIALOG #txt
>Proto ns0 -8 -8 16 16 16 26 #rect
>Proto ns0 '' #fIcon
ns0 f0 mainOut f2 tail #connect
ns0 f2 head f1 mainIn #connect
ns0 f3 mainOut f4 tail #connect
ns0 f4 head f1 mainIn #connect
ns0 f5 mainOut f9 tail #connect
ns0 f9 head f7 mainIn #connect
ns0 f6 mainOut f11 tail #connect
ns0 f11 head f10 in #connect
ns0 f10 out f8 tail #connect
ns0 f8 head f7 mainIn #connect
ns0 f10 out f12 tail #connect
ns0 f12 head f1 mainIn #connect
