[Ivy]
[>Created: Mon Jun 06 15:50:58 CEST 2011]
130636241473D892 3.17 #module
>Proto >Proto Collection #zClass
ns0 newObjectValuesDialogProcess Big #zClass
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
ns0 @RichDialogProcessStart f3 '' #zField
ns0 @RichDialogProcessEnd f6 '' #zField
ns0 @RichDialogInitStart f8 '' #zField
ns0 @RichDialogProcessStep f10 '' #zField
ns0 @PushWFArc f11 '' #zField
ns0 @PushWFArc f9 '' #zField
ns0 @RichDialog f12 '' #zField
ns0 @PushWFArc f13 '' #zField
ns0 @PushWFArc f4 '' #zField
ns0 @RichDialogProcessStart f5 '' #zField
ns0 @RichDialogProcessStart f7 '' #zField
ns0 @RichDialogProcessStart f14 '' #zField
ns0 @RichDialogEnd f15 '' #zField
ns0 @PushWFArc f16 '' #zField
ns0 @PushWFArc f17 '' #zField
ns0 @PushWFArc f18 '' #zField
>Proto ns0 ns0 newObjectValuesDialogProcess #zField
ns0 f0 guid 13063624163E7612 #txt
ns0 f0 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
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
ns0 f1 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f1 90 140 20 20 13 0 #rect
ns0 f1 @|RichDialogProcessEndIcon #fIcon
ns0 f2 expr out #txt
ns0 f2 100 60 100 140 #arcP
ns0 f3 guid 13063712D6BCD747 #txt
ns0 f3 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f3 actionDecl 'ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData out;
' #txt
ns0 f3 actionTable 'out=in;
' #txt
ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addNewVal</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f3 302 86 20 20 13 0 #rect
ns0 f3 @|RichDialogProcessStartIcon #fIcon
ns0 f6 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f6 302 246 20 20 13 0 #rect
ns0 f6 @|RichDialogProcessEndIcon #fIcon
ns0 f8 guid 13063957AEDC8B7B #txt
ns0 f8 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f8 method start(String,String,List<java.util.Locale>,java.util.Locale) #txt
ns0 f8 disableUIEvents true #txt
ns0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String fullPath,java.lang.String type,List<java.util.Locale> langs,java.util.Locale defaultLang> param = methodEvent.getInputArguments();
' #txt
ns0 f8 inParameterMapAction 'out.avLangs=param.langs;
out.defaultLang=param.defaultLang;
out.object.path=param.fullPath.replaceAll("//","/");
out.object.type=param.type.substring(0,1).toUpperCase().concat(param.type.substring(1).toLowerCase());
' #txt
ns0 f8 outParameterDecl '<java.lang.String answer,List<java.lang.String> vals,List<java.util.Locale> langs> result;
' #txt
ns0 f8 outParameterMapAction 'result.answer=in.answer;
result.vals=in.object.values;
result.langs=in.object.langs;
' #txt
ns0 f8 embeddedRdInitializations '* ' #txt
ns0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String,String)</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f8 158 78 20 20 13 0 #rect
ns0 f8 @|RichDialogInitStartIcon #fIcon
ns0 f10 actionDecl 'ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData out;
' #txt
ns0 f10 actionTable 'out=in;
' #txt
ns0 f10 actionCode 'import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import com.ulcjava.base.application.util.SystemColor;
import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.util.Color;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

in.object.langs.add(in.defaultLang);
in.object.values.add("");

panel.box_main.remove(panel.box_main.getComponent(panel.box_main.getComponentCount()-1));

RTextField txt = new RTextField();
txt.setText("");
txt.setSelectAllOnFocusGained(true);
txt.setStyleProperties("{/insetsBottom \"0\"/insetsTop \"5\"/fill \"HORIZONTAL\"/insetsRight \"5\"/insetsLeft \"5\"/weightX \"1\"}");

RBoxPane box = new RBoxPane();
box.setStyleProperties("{/insetsRight \"10\"/fill \"HORIZONTAL\"/insetsLeft \"10\"/weightX \"1\"}");
box.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.lightGray), in.defaultLang.getDisplayLanguage(), ULCTitledBorder.LEFT, ULCTitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 11), ClientContext.getSystemColor(SystemColor.controlShadow)));
box.setBackground(new Color(238, 238, 238));
box.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, txt);

RFiller theFiller = new RFiller();
theFiller.setStyle("verticalGlue");

panel.box_main.set(0, in.object.langs.size(), 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, box);
panel.box_main.set(0, in.object.langs.size()+1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, theFiller);
(panel.box_main.getComponent(in.object.langs.size()) as RBoxPane).getComponent(0).requestFocus();


panel.lbl_path.setText(in.object.path);
panel.lbl_type.setText(in.object.type);

' #txt
ns0 f10 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f10 150 138 36 24 20 -2 #rect
ns0 f10 @|RichDialogProcessStepIcon #fIcon
ns0 f11 expr out #txt
ns0 f11 168 98 168 138 #arcP
ns0 f9 expr out #txt
ns0 f9 150 150 110 150 #arcP
ns0 f12 targetWindow NEW:card: #txt
ns0 f12 targetDisplay TOP #txt
ns0 f12 richDialogId ch.xpertline.xtrans.common.lanngChooser #txt
ns0 f12 startMethod start(List<java.util.Locale>) #txt
ns0 f12 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f12 requestActionDecl '<List<java.util.Locale> langs> param;' #txt
ns0 f12 requestMappingAction 'param.langs=in.avLangs;
' #txt
ns0 f12 responseActionDecl 'ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData out;
' #txt
ns0 f12 responseMappingAction 'out=in;
' #txt
ns0 f12 responseActionCode 'import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import com.ulcjava.base.application.util.SystemColor;
import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.util.Color;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

ivy.log.debug(result.lang.getCountry());

if (result != null && !result.lang.getDisplayLanguage().equalsIgnoreCase("blublubb")){
	in.object.langs.add(result.lang);
	in.object.values.add("");
	in.avLangs.remove(result.lang);
	if (in.avLangs.size() < 1){
		panel.lnk_addVal.setEnabled(false);
	}
	
	panel.box_main.remove(panel.box_main.getComponent(panel.box_main.getComponentCount()-1));
	
	RTextField txt = new RTextField();
	txt.setText("");
	txt.setStyleProperties("{/insetsBottom \"0\"/insetsTop \"5\"/fill \"HORIZONTAL\"/insetsRight \"5\"/insetsLeft \"5\"/weightX \"1\"}");
	
	RBoxPane box = new RBoxPane();
	box.setStyleProperties("{/insetsRight \"10\"/fill \"HORIZONTAL\"/insetsLeft \"10\"/weightX \"1\"}");
	box.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 0, 1, Color.lightGray), result.lang.getDisplayLanguage(), ULCTitledBorder.LEFT, ULCTitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 11), ClientContext.getSystemColor(SystemColor.controlShadow)));
	box.setBackground(new Color(238, 238, 238));
	box.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, txt);
	
	RFiller theFiller = new RFiller();
	theFiller.setStyle("verticalGlue");
	
	panel.box_main.set(0, in.object.langs.size(), 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, box);
	panel.box_main.set(0, in.object.langs.size()+1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, theFiller);
	(panel.box_main.getComponent(in.object.langs.size()) as RBoxPane).getComponent(0).requestFocus();
}' #txt
ns0 f12 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/chooseLang\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
ns0 f12 isAsynch false #txt
ns0 f12 isInnerRd true #txt
ns0 f12 userContext '* ' #txt
ns0 f12 294 124 36 24 20 -2 #rect
ns0 f12 @|RichDialogIcon #fIcon
ns0 f13 expr out #txt
ns0 f13 312 106 312 124 #arcP
ns0 f4 expr out #txt
ns0 f4 312 148 312 246 #arcP
ns0 f5 guid 1306408DBAABB98D #txt
ns0 f5 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f5 actionDecl 'ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData out;
' #txt
ns0 f5 actionTable 'out=in;
out.answer="f";
' #txt
ns0 f5 actionCode 'import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;

for (int i = 1; i < panel.box_main.getComponentCount()-1; i++){
	in.object.values.set(i-1,((panel.box_main.getComponent(i) as RBoxPane).getComponent(0) as RTextField).getValueAsString());
}

ivy.log.debug(in.object.values);
' #txt
ns0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>finish</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f5 86 406 20 20 -43 0 #rect
ns0 f5 @|RichDialogProcessStartIcon #fIcon
ns0 f7 guid 13064092A5CA3912 #txt
ns0 f7 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f7 actionDecl 'ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData out;
' #txt
ns0 f7 actionTable 'out=in;
out.answer="c";
' #txt
ns0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f7 86 486 20 20 -49 -3 #rect
ns0 f7 @|RichDialogProcessStartIcon #fIcon
ns0 f14 guid 13064094C4CFBD17 #txt
ns0 f14 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f14 actionDecl 'ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData out;
' #txt
ns0 f14 actionTable 'out=in;
out.answer="b";
' #txt
ns0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>back</name>
        <nameStyle>4,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f14 86 446 20 20 -39 -1 #rect
ns0 f14 @|RichDialogProcessStartIcon #fIcon
ns0 f15 type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
ns0 f15 guid 1306409F84C114B1 #txt
ns0 f15 150 526 20 20 13 0 #rect
ns0 f15 @|RichDialogEndIcon #fIcon
ns0 f16 expr out #txt
ns0 f16 106 416 160 526 #arcP
ns0 f16 1 152 416 #addKink
ns0 f16 2 160 424 #addKink
ns0 f16 2 0.07291865680220662 0 0 #arcLabel
ns0 f17 expr out #txt
ns0 f17 106 456 160 526 #arcP
ns0 f17 1 160 456 #addKink
ns0 f17 0 0.9470572726537606 0 0 #arcLabel
ns0 f18 expr out #txt
ns0 f18 106 496 160 526 #arcP
ns0 f18 1 160 496 #addKink
ns0 f18 0 0.7091945894081005 0 0 #arcLabel
>Proto ns0 .rdData2UIAction 'panel.btn_next.enabled=2+2*2 == 8;
' #txt
>Proto ns0 .type ch.xpertline.xtrans.common.newObjectValuesDialog.newObjectValuesDialogData #txt
>Proto ns0 .processKind RICH_DIALOG #txt
>Proto ns0 -8 -8 16 16 16 26 #rect
>Proto ns0 '' #fIcon
ns0 f0 mainOut f2 tail #connect
ns0 f2 head f1 mainIn #connect
ns0 f8 mainOut f11 tail #connect
ns0 f11 head f10 mainIn #connect
ns0 f10 mainOut f9 tail #connect
ns0 f9 head f1 mainIn #connect
ns0 f3 mainOut f13 tail #connect
ns0 f13 head f12 mainIn #connect
ns0 f12 mainOut f4 tail #connect
ns0 f4 head f6 mainIn #connect
ns0 f5 mainOut f16 tail #connect
ns0 f16 head f15 mainIn #connect
ns0 f14 mainOut f17 tail #connect
ns0 f17 head f15 mainIn #connect
ns0 f7 mainOut f18 tail #connect
ns0 f18 head f15 mainIn #connect
