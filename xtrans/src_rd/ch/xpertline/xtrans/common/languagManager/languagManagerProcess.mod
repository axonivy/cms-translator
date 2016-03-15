[Ivy]
[>Created: Fri Jul 01 11:32:29 CEST 2011]
13069CF7B1A211B1 3.17 #module
>Proto >Proto Collection #zClass
ls0 languagManagerProcess Big #zClass
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
ls0 @RichDialogProcessStart f3 '' #zField
ls0 @RichDialogProcessStart f4 '' #zField
ls0 @RichDialogProcessEnd f5 '' #zField
ls0 @PushWFArc f6 '' #zField
ls0 @PushWFArc f7 '' #zField
ls0 @RichDialogProcessStart f8 '' #zField
ls0 @RichDialogProcessStart f9 '' #zField
ls0 @RichDialogProcessEnd f10 '' #zField
ls0 @RichDialogFireEvent f16 '' #zField
ls0 @PushWFArc f13 '' #zField
ls0 @RichDialogInitStart f20 '' #zField
ls0 @RichDialogProcessStep f22 '' #zField
ls0 @PushWFArc f2 '' #zField
ls0 @PushWFArc f18 '' #zField
ls0 @PushWFArc f19 '' #zField
ls0 @RichDialogFireEvent f11 '' #zField
ls0 @RichDialogProcessEnd f14 '' #zField
ls0 @PushWFArc f15 '' #zField
ls0 @RichDialogProcessStep f21 '' #zField
ls0 @PushWFArc f12 '' #zField
ls0 @RichDialogProcessStep f24 '' #zField
ls0 @PushWFArc f25 '' #zField
ls0 @PushWFArc f17 '' #zField
ls0 @RichDialog f26 '' #zField
ls0 @PushWFArc f27 '' #zField
ls0 @Alternative f28 '' #zField
ls0 @PushWFArc f29 '' #zField
ls0 @PushWFArc f23 '' #zField
ls0 @PushWFArc f30 '' #zField
>Proto ls0 ls0 languagManagerProcess #zField
ls0 f0 guid 13069CF7B787E41D #txt
ls0 f0 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
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
ls0 f1 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f1 90 158 20 20 13 0 #rect
ls0 f1 @|RichDialogProcessEndIcon #fIcon
ls0 f3 guid 1306A10C8E04B23F #txt
ls0 f3 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f3 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f3 actionTable 'out=in;
' #txt
ls0 f3 actionCode 'panel.lnk_add.setEnabled(true);

if (panel.lis_aviable.getSelectedIndex() < panel.lis_aviable.getListData().size()){
	if (panel.lis_aviable.getSelectedListEntry() != null){
		in.lastSelectedIndexBot = panel.lis_aviable.getSelectedIndex();
	}else if(in.lastSelectedIndexBot >= 0 && in.lastSelectedIndexBot < panel.lis_aviable.getListData().size()){
		panel.lis_aviable.setSelectedIndex(in.lastSelectedIndexBot);
	}else if(panel.lis_aviable.getListData().size() > 0){
		panel.lis_aviable.setSelectedIndex(0);
	}else{
		panel.lnk_add.setEnabled(false);
	}
}else{
	panel.lnk_add.setEnabled(false);
}' #txt
ls0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>aviable_click()</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f3 182 78 20 20 13 -7 #rect
ls0 f3 @|RichDialogProcessStartIcon #fIcon
ls0 f4 guid 1306A10D10AF6172 #txt
ls0 f4 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f4 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f4 actionTable 'out=in;
' #txt
ls0 f4 actionCode 'panel.lnk_remove.setEnabled(true);

if (panel.lis_supported.getSelectedIndex() < panel.lis_supported.getListData().size()){
	if (panel.lis_supported.getSelectedListEntry() != null){
		in.lastSelectedIndexTop = panel.lis_supported.getSelectedIndex();
	}else if(in.lastSelectedIndexTop >= 0 && in.lastSelectedIndexTop < panel.lis_supported.getListData().size()){
		panel.lis_supported.setSelectedIndex(in.lastSelectedIndexTop);
	}else if(panel.lis_supported.getListData().size() > 0){
		panel.lis_supported.setSelectedIndex(0);
	}else{
		panel.lnk_add.setEnabled(false);
	}
}else{
	panel.lnk_remove.setEnabled(false);
}' #txt
ls0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>supported_click()</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f4 310 78 20 20 13 -8 #rect
ls0 f4 @|RichDialogProcessStartIcon #fIcon
ls0 f5 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f5 246 134 20 20 13 0 #rect
ls0 f5 @|RichDialogProcessEndIcon #fIcon
ls0 f6 expr out #txt
ls0 f6 312 94 263 137 #arcP
ls0 f7 expr out #txt
ls0 f7 199 94 248 137 #arcP
ls0 f8 guid 1306A12ED581A95B #txt
ls0 f8 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f8 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f8 actionTable 'out=in;
' #txt
ls0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>add_click()</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f8 294 278 20 20 13 0 #rect
ls0 f8 @|RichDialogProcessStartIcon #fIcon
ls0 f9 guid 1306A13320731BA3 #txt
ls0 f9 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f9 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f9 actionTable 'out=in;
' #txt
ls0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>remove_click()</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f9 150 278 20 20 13 0 #rect
ls0 f9 @|RichDialogProcessStartIcon #fIcon
ls0 f10 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f10 294 454 20 20 13 0 #rect
ls0 f10 @|RichDialogProcessEndIcon #fIcon
ls0 f16 actionDecl 'java.util.Locale locale;
' #txt
ls0 f16 actionTable 'locale=in.lcle2add;
' #txt
ls0 f16 actionCode panel.fireSupportedLangAdded(locale); #txt
ls0 f16 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f16 fireEvent supportedLangAdded(java.util.Locale) #txt
ls0 f16 286 396 36 24 20 -2 #rect
ls0 f16 @|RichDialogFireEventIcon #fIcon
ls0 f13 expr out #txt
ls0 f13 304 420 304 454 #arcP
ls0 f13 0 0.6824366453831899 0 0 #arcLabel
ls0 f20 guid 1306A2F84F92762A #txt
ls0 f20 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f20 method start(List<java.util.Locale>) #txt
ls0 f20 disableUIEvents true #txt
ls0 f20 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<java.util.Locale> currLangList> param = methodEvent.getInputArguments();
' #txt
ls0 f20 inParameterMapAction 'out.supLocls=param.currLangList;
' #txt
ls0 f20 outParameterDecl '<> result;
' #txt
ls0 f20 embeddedRdInitializations '* ' #txt
ls0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(List&lt;String&gt;)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ls0 f20 166 40 20 20 13 0 #rect
ls0 f20 @|RichDialogInitStartIcon #fIcon
ls0 f22 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f22 actionTable 'out=in;
' #txt
ls0 f22 actionCode 'import ch.xpertline.xtrans.util.LocaleCompertor;
import java.util.Comparator;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Locale;

panel.lnk_add.setEnabled(false);
panel.lnk_remove.setEnabled(false);

in.aviLocls = SimpleDateFormat.getAvailableLocales().removeAll(in.supLocls);//new List<Locale>();

LocaleCompertor comp = new LocaleCompertor();
Collections.sort(in.aviLocls, comp);
' #txt
ls0 f22 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f22 86 108 36 24 20 -2 #rect
ls0 f22 @|RichDialogProcessStepIcon #fIcon
ls0 f2 expr out #txt
ls0 f2 168 56 116 108 #arcP
ls0 f18 expr out #txt
ls0 f18 100 59 103 108 #arcP
ls0 f19 expr out #txt
ls0 f19 103 132 100 158 #arcP
ls0 f11 actionDecl 'java.util.Locale locale;
' #txt
ls0 f11 actionTable 'locale=in.lcle2rmv;
' #txt
ls0 f11 actionCode panel.fireSupportedLangRemoved(locale); #txt
ls0 f11 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f11 fireEvent supportedLangRemoved(java.util.Locale) #txt
ls0 f11 142 468 36 24 20 -2 #rect
ls0 f11 @|RichDialogFireEventIcon #fIcon
ls0 f14 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f14 150 526 20 20 13 0 #rect
ls0 f14 @|RichDialogProcessEndIcon #fIcon
ls0 f15 expr out #txt
ls0 f15 160 492 160 526 #arcP
ls0 f21 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f21 actionTable 'out=in;
' #txt
ls0 f21 actionCode 'import ch.xpertline.xtrans.util.LocaleCompertor;
import java.util.Locale;
import java.util.Collections;

if (panel.lis_supported.getSelectedIndex() > -1){
	in.lcle2rmv = panel.lis_supported.getSelectedListEntry() as Locale;
	
	in.aviLocls.add(in.lcle2rmv);
	in.supLocls.remove(in.lcle2rmv);

	LocaleCompertor comp = new LocaleCompertor();
	Collections.sort(in.aviLocls, comp);
	
	in.lastSelectedIndexTop = -1;
}else{
	panel.lnk_remove.setEnabled(false);
}

' #txt
ls0 f21 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f21 142 420 36 24 20 -2 #rect
ls0 f21 @|RichDialogProcessStepIcon #fIcon
ls0 f12 expr out #txt
ls0 f12 160 444 160 468 #arcP
ls0 f24 actionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f24 actionTable 'out=in;
' #txt
ls0 f24 actionCode 'import ch.xpertline.xtrans.util.LocaleCompertor;
import java.util.Locale;
import java.util.Collections;

if (panel.lis_aviable.getSelectedIndex() > -1){
	in.lcle2add = panel.lis_aviable.getSelectedListEntry() as Locale;
	
	in.aviLocls.remove(in.lcle2add);
	in.supLocls.add(in.lcle2add);
	
	LocaleCompertor comp = new LocaleCompertor();
	Collections.sort(in.aviLocls, comp);

	in.lastSelectedIndexBot = -1;
}else{
	panel.lnk_add.setEnabled(false);
}' #txt
ls0 f24 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f24 286 332 36 24 20 -2 #rect
ls0 f24 @|RichDialogProcessStepIcon #fIcon
ls0 f25 expr out #txt
ls0 f25 304 298 304 332 #arcP
ls0 f25 0 0.626257873344743 0 0 #arcLabel
ls0 f17 expr out #txt
ls0 f17 304 356 304 396 #arcP
ls0 f26 targetWindow NEW:card: #txt
ls0 f26 targetDisplay TOP #txt
ls0 f26 richDialogId ch.xpertline.xtrans.common.yesNo #txt
ls0 f26 startMethod start(String,String) #txt
ls0 f26 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f26 requestActionDecl '<String message, String type> param;' #txt
ls0 f26 requestMappingAction 'param.message=ivy.cms.co("/ch/ivyteam/xtrans/labels/messages/deleteLangQuestion");
param.type="warn";
' #txt
ls0 f26 responseActionDecl 'ch.xpertline.xtrans.common.languagManager.languagManagerData out;
' #txt
ls0 f26 responseMappingAction 'out=in;
out.answer=result.result;
' #txt
ls0 f26 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/wait\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
ls0 f26 isAsynch false #txt
ls0 f26 isInnerRd true #txt
ls0 f26 userContext '* ' #txt
ls0 f26 142 324 36 24 20 -2 #rect
ls0 f26 @|RichDialogIcon #fIcon
ls0 f27 expr out #txt
ls0 f27 160 298 160 324 #arcP
ls0 f27 0 0.5522321881093722 0 0 #arcLabel
ls0 f28 type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
ls0 f28 146 370 28 28 14 0 #rect
ls0 f28 @|AlternativeIcon #fIcon
ls0 f29 expr out #txt
ls0 f29 160 348 160 370 #arcP
ls0 f23 expr in #txt
ls0 f23 outCond in.answer.equalsIgnoreCase("y") #txt
ls0 f23 160 398 160 420 #arcP
ls0 f30 expr in #txt
ls0 f30 146 384 150 536 #arcP
ls0 f30 1 120 384 #addKink
ls0 f30 2 120 536 #addKink
ls0 f30 1 0.44622683789982354 0 0 #arcLabel
>Proto ls0 .rdData2UIAction 'panel.lis_supported.listData=in.supLocls;
panel.lis_aviable.listData=in.aviLocls;
' #txt
>Proto ls0 .type ch.xpertline.xtrans.common.languagManager.languagManagerData #txt
>Proto ls0 .processKind RICH_DIALOG #txt
>Proto ls0 -8 -8 16 16 16 26 #rect
>Proto ls0 '' #fIcon
ls0 f4 mainOut f6 tail #connect
ls0 f6 head f5 mainIn #connect
ls0 f3 mainOut f7 tail #connect
ls0 f7 head f5 mainIn #connect
ls0 f16 mainOut f13 tail #connect
ls0 f13 head f10 mainIn #connect
ls0 f20 mainOut f2 tail #connect
ls0 f2 head f22 mainIn #connect
ls0 f0 mainOut f18 tail #connect
ls0 f18 head f22 mainIn #connect
ls0 f22 mainOut f19 tail #connect
ls0 f19 head f1 mainIn #connect
ls0 f11 mainOut f15 tail #connect
ls0 f15 head f14 mainIn #connect
ls0 f21 mainOut f12 tail #connect
ls0 f12 head f11 mainIn #connect
ls0 f8 mainOut f25 tail #connect
ls0 f25 head f24 mainIn #connect
ls0 f24 mainOut f17 tail #connect
ls0 f17 head f16 mainIn #connect
ls0 f9 mainOut f27 tail #connect
ls0 f27 head f26 mainIn #connect
ls0 f26 mainOut f29 tail #connect
ls0 f29 head f28 in #connect
ls0 f28 out f23 tail #connect
ls0 f23 head f21 mainIn #connect
ls0 f28 out f30 tail #connect
ls0 f30 head f14 mainIn #connect
