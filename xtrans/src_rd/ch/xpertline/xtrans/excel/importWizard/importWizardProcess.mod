[Ivy]
[>Created: Thu Jun 23 09:24:29 CEST 2011]
130970ABE75EF680 3.17 #module
>Proto >Proto Collection #zClass
is0 importWizardProcess Big #zClass
is0 RD #cInfo
is0 #process
is0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
is0 @TextInP .rdData2UIAction .rdData2UIAction #zField
is0 @TextInP .resExport .resExport #zField
is0 @TextInP .type .type #zField
is0 @TextInP .processKind .processKind #zField
is0 @AnnotationInP-0n ai ai #zField
is0 @TextInP .xml .xml #zField
is0 @TextInP .responsibility .responsibility #zField
is0 @RichDialogInitStart f0 '' #zField
is0 @RichDialogProcessEnd f1 '' #zField
is0 @PushWFArc f2 '' #zField
is0 @RichDialogInitStart f3 '' #zField
is0 @RichDialogProcessStep f5 '' #zField
is0 @PushWFArc f6 '' #zField
is0 @PushWFArc f4 '' #zField
is0 @RichDialogProcessStart f7 '' #zField
is0 @RichDialogProcessEnd f8 '' #zField
is0 @PushWFArc f9 '' #zField
is0 @RichDialogProcessStart f10 '' #zField
is0 @RichDialogEnd f11 '' #zField
is0 @RichDialogProcessStart f12 '' #zField
is0 @PushWFArc f13 '' #zField
is0 @PushWFArc f14 '' #zField
>Proto is0 is0 importWizardProcess #zField
is0 f0 guid 130970ABE9187DF4 #txt
is0 f0 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f0 method start() #txt
is0 f0 disableUIEvents true #txt
is0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
is0 f0 outParameterDecl '<> result;
' #txt
is0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
is0 f0 90 40 20 20 13 0 #rect
is0 f0 @|RichDialogInitStartIcon #fIcon
is0 f1 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f1 90 140 20 20 13 0 #rect
is0 f1 @|RichDialogProcessEndIcon #fIcon
is0 f2 expr out #txt
is0 f2 100 60 100 140 #arcP
is0 f3 guid 130973AFF0013338 #txt
is0 f3 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f3 method start(List<String>) #txt
is0 f3 disableUIEvents true #txt
is0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<java.lang.String> langs> param = methodEvent.getInputArguments();
' #txt
is0 f3 inParameterMapAction 'out.langs=param.langs;
' #txt
is0 f3 outParameterDecl '<List<java.lang.String> langs,java.lang.Boolean overwrite,java.lang.Boolean createNew,java.lang.Boolean unsupportedLangs,java.lang.String answer> result;
' #txt
is0 f3 outParameterMapAction 'result.langs=in.langs;
result.overwrite=in.overwrite;
result.createNew=in.createNew;
result.unsupportedLangs=in.handleUnsprtd;
result.answer=in.answer;
' #txt
is0 f3 embeddedRdInitializations '* ' #txt
is0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(List&lt;String&gt;)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
is0 f3 166 40 20 20 13 0 #rect
is0 f3 @|RichDialogInitStartIcon #fIcon
is0 f5 actionDecl 'ch.xpertline.xtrans.excel.importWizard.importWizardData out;
' #txt
is0 f5 actionTable 'out=in;
' #txt
is0 f5 actionCode 'import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;

int row = 0;
int col = 0;


for (int i = 0; i < in.langs.size(); i++){
	
	RCheckBox chk = new RCheckBox();
	chk.setText(in.langs.get(i));
	chk.setSelected(true);
	chk.addValueChangedListener(panel.getIValueChangedListener());
	
	panel.box_wichLanguages.set(col, row, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, chk);
	if (col < 5){
		col++;
	}else{
		col = 0;
		row++;
	}
}

panel.rad_overwrite_true.setSelected(true);
panel.rad_createUnex_true.setSelected(true);' #txt
is0 f5 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f5 158 138 36 24 20 -2 #rect
is0 f5 @|RichDialogProcessStepIcon #fIcon
is0 f6 expr out #txt
is0 f6 176 60 176 138 #arcP
is0 f4 expr out #txt
is0 f4 158 150 110 150 #arcP
is0 f7 guid 13097484AC9F10A3 #txt
is0 f7 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f7 actionDecl 'ch.xpertline.xtrans.excel.importWizard.importWizardData out;
' #txt
is0 f7 actionTable 'out=in;
' #txt
is0 f7 actionCode 'if (panel.hdn_langs.text.startsWith("true")){
	in.langs.add(panel.hdn_langs.text.replaceFirst("true",""));
}else if (panel.hdn_langs.text.startsWith("false")){
	in.langs.remove(panel.hdn_langs.text.replaceFirst("false",""));
}

if (in.langs.size() == 0 || in.langs.isEmpty()){
	panel.btn_sumbit.setEnabled(false);
}else{
	panel.btn_sumbit.setEnabled(true);
}' #txt
is0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>lang</name>
        <nameStyle>4,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
is0 f7 342 142 20 20 13 0 #rect
is0 f7 @|RichDialogProcessStartIcon #fIcon
is0 f8 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f8 342 270 20 20 13 0 #rect
is0 f8 @|RichDialogProcessEndIcon #fIcon
is0 f9 expr out #txt
is0 f9 352 162 352 270 #arcP
is0 f10 guid 130978C85D547A29 #txt
is0 f10 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f10 actionDecl 'ch.xpertline.xtrans.excel.importWizard.importWizardData out;
' #txt
is0 f10 actionTable 'out=in;
out.answer="y";
out.createNew=panel.rad_createUnex_true.isSelected();
out.handleUnsprtd=panel.chk_justSupported.isSelected();
out.langs=in.langs;
out.overwrite=panel.rad_overwrite_true.isSelected();
' #txt
is0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>submit</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
is0 f10 614 286 20 20 13 0 #rect
is0 f10 @|RichDialogProcessStartIcon #fIcon
is0 f11 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f11 guid 130978C8FA413453 #txt
is0 f11 726 342 20 20 13 0 #rect
is0 f11 @|RichDialogEndIcon #fIcon
is0 f12 guid 130978C97E5D40C6 #txt
is0 f12 type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
is0 f12 actionDecl 'ch.xpertline.xtrans.excel.importWizard.importWizardData out;
' #txt
is0 f12 actionTable 'out=in;
out.answer="n";
' #txt
is0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
is0 f12 814 230 20 20 13 0 #rect
is0 f12 @|RichDialogProcessStartIcon #fIcon
is0 f13 expr out #txt
is0 f13 817 247 742 344 #arcP
is0 f14 expr out #txt
is0 f14 632 300 727 347 #arcP
>Proto is0 .rdData2UIAction 'panel.hdn_langs.visible=false;
' #txt
>Proto is0 .type ch.xpertline.xtrans.excel.importWizard.importWizardData #txt
>Proto is0 .processKind RICH_DIALOG #txt
>Proto is0 -8 -8 16 16 16 26 #rect
>Proto is0 '' #fIcon
is0 f0 mainOut f2 tail #connect
is0 f2 head f1 mainIn #connect
is0 f3 mainOut f6 tail #connect
is0 f6 head f5 mainIn #connect
is0 f5 mainOut f4 tail #connect
is0 f4 head f1 mainIn #connect
is0 f7 mainOut f9 tail #connect
is0 f9 head f8 mainIn #connect
is0 f12 mainOut f13 tail #connect
is0 f13 head f11 mainIn #connect
is0 f10 mainOut f14 tail #connect
is0 f14 head f11 mainIn #connect
