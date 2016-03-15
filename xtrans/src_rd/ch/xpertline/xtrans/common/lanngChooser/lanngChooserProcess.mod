[Ivy]
[>Created: Thu Jun 09 08:31:38 CEST 2011]
13063CE8462D0CC9 3.17 #module
>Proto >Proto Collection #zClass
ls0 lanngChooserProcess Big #zClass
ls0 RD #cInfo
ls0 #process
ls0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ls0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ls0 @TextInP .resExport .resExport #zField
ls0 @TextInP .type .type #zField
ls0 @TextInP .processKind .processKind #zField
ls0 @AnnotationInP-0n ai ai #zField
ls0 @TextInP .xml .xml #zField
ls0 @TextInP .responsibility .responsibility #zField
ls0 @RichDialogInitStart f0 '' #zField
ls0 @RichDialogProcessEnd f1 '' #zField
ls0 @PushWFArc f2 '' #zField
ls0 @RichDialogInitStart f3 '' #zField
ls0 @RichDialogProcessStep f4 '' #zField
ls0 @PushWFArc f5 '' #zField
ls0 @PushWFArc f6 '' #zField
ls0 @RichDialogProcessStart f7 '' #zField
ls0 @RichDialogProcessStart f8 '' #zField
ls0 @RichDialogEnd f9 '' #zField
ls0 @PushWFArc f10 '' #zField
ls0 @RichDialogProcessEnd f11 '' #zField
ls0 @PushWFArc f12 '' #zField
>Proto ls0 ls0 lanngChooserProcess #zField
ls0 f0 guid 13063CE84978ED88 #txt
ls0 f0 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f0 method start() #txt
ls0 f0 disableUIEvents true #txt
ls0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ls0 f0 outParameterDecl '<> result;
' #txt
ls0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
ls0 f0 90 40 20 20 13 0 #rect
ls0 f0 @|RichDialogInitStartIcon #fIcon
ls0 f1 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f1 90 140 20 20 13 0 #rect
ls0 f1 @|RichDialogProcessEndIcon #fIcon
ls0 f2 expr out #txt
ls0 f2 100 60 100 140 #arcP
ls0 f3 guid 13063D4EB01DA8CF #txt
ls0 f3 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f3 method start(List<java.util.Locale>) #txt
ls0 f3 disableUIEvents true #txt
ls0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<java.util.Locale> langs> param = methodEvent.getInputArguments();
' #txt
ls0 f3 inParameterMapAction 'out.langs=param.langs;
' #txt
ls0 f3 outParameterDecl '<java.util.Locale lang> result;
' #txt
ls0 f3 outParameterMapAction 'result.lang=in.lang;
' #txt
ls0 f3 embeddedRdInitializations '* ' #txt
ls0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(List&lt;Locale&gt;)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f3 158 86 20 20 13 0 #rect
ls0 f3 @|RichDialogInitStartIcon #fIcon
ls0 f4 actionDecl 'ch.xpertline.xtrans.common.lanngChooser.lanngChooserData out;
' #txt
ls0 f4 actionTable 'out=in;
' #txt
ls0 f4 actionCode 'import com.ulcjava.base.application.ULCListSelectionModel;
import java.util.Locale;

List<String> langList = new List<String>();

for (int i = 0; i < in.langs.size(); i++){
	langList.add(in.langs.get(i).getDisplayLanguage());
}

panel.langs.setListData(langList);
panel.langs.setSelectionMode(ULCListSelectionModel.SINGLE_SELECTION);
panel.langs.setSelectedIndex(0);

in.currLang = in.langs.get(0);

in.lang = new Locale("BLUBLUBB");' #txt
ls0 f4 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f4 150 138 36 24 20 -2 #rect
ls0 f4 @|RichDialogProcessStepIcon #fIcon
ls0 f5 expr out #txt
ls0 f5 168 106 168 138 #arcP
ls0 f6 expr out #txt
ls0 f6 150 150 110 150 #arcP
ls0 f7 guid 13063D516EACB023 #txt
ls0 f7 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f7 actionDecl 'ch.xpertline.xtrans.common.lanngChooser.lanngChooserData out;
' #txt
ls0 f7 actionTable 'out=in;
out.lang=in.currLang;
' #txt
ls0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>submit
</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f7 110 246 20 20 13 0 #rect
ls0 f7 @|RichDialogProcessStartIcon #fIcon
ls0 f8 guid 13063EA2CDE63F6D #txt
ls0 f8 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f8 actionDecl 'ch.xpertline.xtrans.common.lanngChooser.lanngChooserData out;
' #txt
ls0 f8 actionTable 'out=in;
' #txt
ls0 f8 actionCode 'if (panel.langs.getSelectedIndex() > -1){
	in.currLang = in.langs.get(panel.langs.getSelectedIndex());
}else{
	panel.langs.setSelectedIndex(in.langs.indexOf(in.currLang));
}' #txt
ls0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>klick
</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f8 230 246 20 20 13 0 #rect
ls0 f8 @|RichDialogProcessStartIcon #fIcon
ls0 f9 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f9 guid 13063EA6765A3E70 #txt
ls0 f9 102 302 20 20 13 0 #rect
ls0 f9 @|RichDialogEndIcon #fIcon
ls0 f10 expr out #txt
ls0 f10 118 265 113 302 #arcP
ls0 f11 type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
ls0 f11 222 318 20 20 13 0 #rect
ls0 f11 @|RichDialogProcessEndIcon #fIcon
ls0 f12 expr out #txt
ls0 f12 238 265 233 318 #arcP
>Proto ls0 .type ch.xpertline.xtrans.common.lanngChooser.lanngChooserData #txt
>Proto ls0 .processKind RICH_DIALOG #txt
>Proto ls0 -8 -8 16 16 16 26 #rect
>Proto ls0 '' #fIcon
ls0 f0 mainOut f2 tail #connect
ls0 f2 head f1 mainIn #connect
ls0 f3 mainOut f5 tail #connect
ls0 f5 head f4 mainIn #connect
ls0 f4 mainOut f6 tail #connect
ls0 f6 head f1 mainIn #connect
ls0 f7 mainOut f10 tail #connect
ls0 f10 head f9 mainIn #connect
ls0 f8 mainOut f12 tail #connect
ls0 f12 head f11 mainIn #connect
