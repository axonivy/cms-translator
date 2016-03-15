[Ivy]
[>Created: Mon Jun 06 09:25:24 CEST 2011]
13021F0ED3DAF1C2 3.17 #module
>Proto >Proto Collection #zClass
as0 addLanguageProcess Big #zClass
as0 RD #cInfo
as0 #process
as0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
as0 @TextInP .rdData2UIAction .rdData2UIAction #zField
as0 @TextInP .resExport .resExport #zField
as0 @TextInP .type .type #zField
as0 @TextInP .processKind .processKind #zField
as0 @AnnotationInP-0n ai ai #zField
as0 @TextInP .xml .xml #zField
as0 @TextInP .responsibility .responsibility #zField
as0 @RichDialogInitStart f0 '' #zField
as0 @RichDialogProcessEnd f1 '' #zField
as0 @RichDialogProcessStep f3 '' #zField
as0 @RichDialogInitStart f5 '' #zField
as0 @PushWFArc f6 '' #zField
as0 @RichDialogProcessStart f11 '' #zField
as0 @RichDialogProcessStep f12 '' #zField
as0 @PushWFArc f14 '' #zField
as0 @PushWFArc f2 '' #zField
as0 @RichDialogProcessEnd f7 '' #zField
as0 @RichDialogProcessStep f8 '' #zField
as0 @RichDialogProcessStart f9 '' #zField
as0 @PushWFArc f10 '' #zField
as0 @PushWFArc f16 '' #zField
as0 @RichDialogEnd f13 '' #zField
as0 @PushWFArc f15 '' #zField
as0 @PushWFArc f17 '' #zField
>Proto as0 as0 addLanguageProcess #zField
as0 f0 guid 13021F0ED4D2CC12 #txt
as0 f0 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f0 method start() #txt
as0 f0 disableUIEvents true #txt
as0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
as0 f0 outParameterDecl '<> result;
' #txt
as0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
as0 f0 90 40 20 20 13 0 #rect
as0 f0 @|RichDialogInitStartIcon #fIcon
as0 f1 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f1 78 278 20 20 13 0 #rect
as0 f1 @|RichDialogProcessEndIcon #fIcon
as0 f3 actionDecl 'ch.xpertline.xtrans.common.addLanguage.addLanguageData out;
' #txt
as0 f3 actionTable 'out=in;
' #txt
as0 f3 actionCode 'import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Locale;
List<Locale> langs = SimpleDateFormat.getAvailableLocales();

List<String> langList = new List<String>();

Locale currLocale = null;

for (int i = 0; i < langs.size(); i++){
	currLocale = langs.get(i);
	String currLang = "";
	currLang = "["+currLocale.getLanguage().toUpperCase()+"] "+currLocale.getDisplayLanguage();
	if (!langList.contains(currLang) && !in.oldLangsList.contains(currLocale.getLanguage().trim().toUpperCase())){
		langList.add(currLang);
	}
}

Collections.sort(langList);

panel.lkp_language.setListData(langList);
panel.lkp_language.setMandatory(true);
panel.btn_submit.setEnabled(false);' #txt
as0 f3 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f3 82 116 36 24 20 -2 #rect
as0 f3 @|RichDialogProcessStepIcon #fIcon
as0 f5 guid 1302ABEE571CFEB0 #txt
as0 f5 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f5 method start(List<String>) #txt
as0 f5 disableUIEvents true #txt
as0 f5 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<java.lang.String> langList> param = methodEvent.getInputArguments();
' #txt
as0 f5 inParameterMapAction 'out.oldLangsList=param.langList;
' #txt
as0 f5 outParameterDecl '<java.lang.String lang> result;
' #txt
as0 f5 outParameterMapAction 'result.lang=in.newLang;
' #txt
as0 f5 embeddedRdInitializations '* ' #txt
as0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startWithReturn()</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
as0 f5 126 70 20 20 13 0 #rect
as0 f5 @|RichDialogInitStartIcon #fIcon
as0 f6 expr out #txt
as0 f6 130 88 109 116 #arcP
as0 f11 guid 01302AC9CCC79BFB #txt
as0 f11 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f11 actionDecl 'ch.xpertline.xtrans.common.addLanguage.addLanguageData out;
' #txt
as0 f11 actionTable 'out=in;
' #txt
as0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok_click()</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
as0 f11 286 126 20 20 13 0 #rect
as0 f11 @|RichDialogProcessStartIcon #fIcon
as0 f12 actionDecl 'ch.xpertline.xtrans.common.addLanguage.addLanguageData out;
' #txt
as0 f12 actionTable 'out=in;
' #txt
as0 f12 actionCode 'in.newLang = panel.lkp_language.getSelectedListEntry().toString().substring(1,panel.lkp_language.getSelectedListEntry().toString().indexOf("]"));
' #txt
as0 f12 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f12 278 164 36 24 20 -2 #rect
as0 f12 @|RichDialogProcessStepIcon #fIcon
as0 f14 expr out #txt
as0 f14 296 146 296 164 #arcP
as0 f2 expr out #txt
as0 f2 99 140 88 278 #arcP
as0 f7 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f7 374 454 20 20 13 0 #rect
as0 f7 @|RichDialogProcessEndIcon #fIcon
as0 f8 actionDecl 'ch.xpertline.xtrans.common.addLanguage.addLanguageData out;
' #txt
as0 f8 actionTable 'out=in;
' #txt
as0 f8 actionCode 'if (panel.lkp_language.getListData().contains(panel.lkp_language.getValue()) && panel.lkp_language.getValueAsString().length() > 0){
	panel.btn_submit.setEnabled(true);
}else{
	panel.btn_submit.setEnabled(false);
}' #txt
as0 f8 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f8 358 404 36 24 20 -2 #rect
as0 f8 @|RichDialogProcessStepIcon #fIcon
as0 f9 guid 1302ADD2AE858A67 #txt
as0 f9 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f9 actionDecl 'ch.xpertline.xtrans.common.addLanguage.addLanguageData out;
' #txt
as0 f9 actionTable 'out=in;
' #txt
as0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>lkp_valueChanged()</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
as0 f9 366 358 20 20 13 0 #rect
as0 f9 @|RichDialogProcessStartIcon #fIcon
as0 f10 expr out #txt
as0 f10 378 428 382 454 #arcP
as0 f16 expr out #txt
as0 f16 376 378 376 404 #arcP
as0 f13 type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
as0 f13 guid 1302AF048D970196 #txt
as0 f13 302 198 20 20 13 0 #rect
as0 f13 @|RichDialogEndIcon #fIcon
as0 f15 expr out #txt
as0 f15 302 188 307 199 #arcP
as0 f17 expr out #txt
as0 f17 109 49 321 206 #arcP
as0 f17 1 576 32 #addKink
as0 f17 2 536 168 #addKink
as0 f17 0 0.8431796123560888 0 0 #arcLabel
>Proto as0 .type ch.xpertline.xtrans.common.addLanguage.addLanguageData #txt
>Proto as0 .processKind RICH_DIALOG #txt
>Proto as0 -8 -8 16 16 16 26 #rect
>Proto as0 '' #fIcon
as0 f5 mainOut f6 tail #connect
as0 f6 head f3 mainIn #connect
as0 f11 mainOut f14 tail #connect
as0 f14 head f12 mainIn #connect
as0 f3 mainOut f2 tail #connect
as0 f2 head f1 mainIn #connect
as0 f8 mainOut f10 tail #connect
as0 f10 head f7 mainIn #connect
as0 f9 mainOut f16 tail #connect
as0 f16 head f8 mainIn #connect
as0 f12 mainOut f15 tail #connect
as0 f15 head f13 mainIn #connect
as0 f0 mainOut f17 tail #connect
as0 f17 head f13 mainIn #connect
