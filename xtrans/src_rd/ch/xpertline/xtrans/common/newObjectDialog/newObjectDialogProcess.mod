[Ivy]
[>Created: Mon Jun 06 13:53:22 CEST 2011]
13045C65D26B96A3 3.17 #module
>Proto >Proto Collection #zClass
ns0 newObjectDialogProcess Big #zClass
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
ns0 @RichDialogProcessStep f4 '' #zField
ns0 @RichDialogProcessEnd f7 '' #zField
ns0 @PushWFArc f8 '' #zField
ns0 @PushWFArc f5 '' #zField
ns0 @RichDialogProcessStart f6 '' #zField
ns0 @RichDialogProcessStart f9 '' #zField
ns0 @RichDialogProcessStart f10 '' #zField
ns0 @RichDialogEnd f11 '' #zField
ns0 @RichDialogProcessStart f15 '' #zField
ns0 @RichDialogProcessEnd f16 '' #zField
ns0 @PushWFArc f17 '' #zField
ns0 @Alternative f18 '' #zField
ns0 @PushWFArc f14 '' #zField
ns0 @PushWFArc f13 '' #zField
ns0 @RichDialogProcessEnd f20 '' #zField
ns0 @PushWFArc f21 '' #zField
ns0 @PushWFArc f22 '' #zField
ns0 @PushWFArc f19 '' #zField
>Proto ns0 ns0 newObjectDialogProcess #zField
ns0 f0 guid 13045C65D30FA7A0 #txt
ns0 f0 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
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
ns0 f1 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f1 94 190 20 20 13 0 #rect
ns0 f1 @|RichDialogProcessEndIcon #fIcon
ns0 f2 expr out #txt
ns0 f2 100 59 103 190 #arcP
ns0 f3 guid 13045CEB0B13DDB5 #txt
ns0 f3 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f3 method start(Tree,Tree,String,String) #txt
ns0 f3 disableUIEvents true #txt
ns0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Tree tree,ch.ivyteam.ivy.scripting.objects.Tree currLevel,java.lang.String name,java.lang.String type> param = methodEvent.getInputArguments();
' #txt
ns0 f3 inParameterMapAction 'out.currLevel=param.currLevel;
out.name=param.name;
out.tree=param.tree;
out.type=param.type;
' #txt
ns0 f3 outParameterDecl '<java.lang.String name,java.lang.String type,java.lang.String path,ch.ivyteam.ivy.scripting.objects.Tree currLoc,java.lang.String answer> result;
' #txt
ns0 f3 outParameterMapAction 'result.name=in.name;
result.type=in.type;
result.path=in.path;
result.currLoc=in.currLevel;
result.answer=in.answer;
' #txt
ns0 f3 embeddedRdInitializations '* ' #txt
ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String,String,String)</name>
        <nameStyle>27,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f3 150 78 20 20 13 0 #rect
ns0 f3 @|RichDialogInitStartIcon #fIcon
ns0 f4 actionDecl 'ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData out;
' #txt
ns0 f4 actionTable 'out=in;
' #txt
ns0 f4 actionCode 'panel.treeFolders.setTreeData(in.tree);
panel.treeFolders.setSelectedTreeNode(in.currLevel);

List<String> types = new List<String>();
types.add("STRING").add("TEXT");
panel.cmb_type.setListData(types);
if(in.type.equalsIgnoreCase("TEXT")){
	panel.cmb_type.setSelectedIndex(1);
}else{
		panel.cmb_type.setSelectedIndex(0);	
}

panel.txt_name.setText(in.name);

in.path = "";
for (int i = 1; i < in.currLevel.getPath().size(); i++){
	in.path = in.path + "/" +in.currLevel.getPath().get(i).getValue();
}
if (in.path == "" || in.path == null || in.path == " "){
	in.path == "/";
}
ivy.log.debug(in.path);
panel.lbl_path.setText(in.path);
panel.txt_name.requestFocus();
panel.txt_name.selectAll();
' #txt
ns0 f4 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f4 158 140 36 24 20 -2 #rect
ns0 f4 @|RichDialogProcessStepIcon #fIcon
ns0 f7 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f7 174 270 20 20 13 0 #rect
ns0 f7 @|RichDialogProcessEndIcon #fIcon
ns0 f8 expr out #txt
ns0 f8 162 97 173 140 #arcP
ns0 f5 expr out #txt
ns0 f5 177 164 183 270 #arcP
ns0 f6 guid 130462F7B113DFC3 #txt
ns0 f6 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f6 actionDecl 'ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData out;
' #txt
ns0 f6 actionTable 'out=in;
out.answer="n";
out.currLevel=panel.treeFolders.getSelectedTreeNode();
out.name=panel.txt_name.getValueAsString();
out.path=panel.lbl_path.getText();
out.type=panel.cmb_type.getSelectedItem().toString();
' #txt
ns0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>next</name>
        <nameStyle>4,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f6 254 366 20 20 13 0 #rect
ns0 f6 @|RichDialogProcessStartIcon #fIcon
ns0 f9 guid 130462FA311D1F61 #txt
ns0 f9 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f9 actionDecl 'ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData out;
' #txt
ns0 f9 actionTable 'out=in;
out.answer="f";
out.currLevel=in.currLevel;
out.name=panel.txt_name.getValueAsString();
out.path=panel.lbl_path.getText();
out.type=panel.cmb_type.getSelectedItem().toString();
' #txt
ns0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>finish</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f9 254 302 20 20 13 0 #rect
ns0 f9 @|RichDialogProcessStartIcon #fIcon
ns0 f10 guid 130462FCB7859A83 #txt
ns0 f10 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f10 actionDecl 'ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData out;
' #txt
ns0 f10 actionTable 'out=in;
out.answer="c";
out.currLevel=null;
out.name="";
out.path="";
out.type="";
' #txt
ns0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f10 254 438 20 20 13 0 #rect
ns0 f10 @|RichDialogProcessStartIcon #fIcon
ns0 f11 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f11 guid 13046301EC88667D #txt
ns0 f11 334 478 20 20 13 0 #rect
ns0 f11 @|RichDialogEndIcon #fIcon
ns0 f15 guid 1304634E03852FD3 #txt
ns0 f15 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f15 actionDecl 'ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData out;
' #txt
ns0 f15 actionTable 'out=in;
' #txt
ns0 f15 actionCode 'try{
	panel.treeFolders.getSelectedTreeNode().getValue();
	ivy.log.debug(" ---1# "+in.currLevel.toString());
	in.currLevel = panel.treeFolders.getSelectedTreeNode();
	ivy.log.debug(" ---2# "+in.currLevel.toString());
}catch(NullPointerException e){
	ivy.log.debug("-----> "+in.currLevel.toString());
	panel.treeFolders.setSelectedTreeNode(in.currLevel);
}

in.path = "";
for (int i = 1; i < in.currLevel.getPath().size(); i++){
	in.path = in.path + "/" +in.currLevel.getPath().get(i).getValue();
}
if (in.path == "" ||in.path == " "){
	in.path = "/";
}
panel.lbl_path.setText(in.path);' #txt
ns0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>treeClick</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f15 382 230 20 20 13 0 #rect
ns0 f15 @|RichDialogProcessStartIcon #fIcon
ns0 f16 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f16 478 230 20 20 13 0 #rect
ns0 f16 @|RichDialogProcessEndIcon #fIcon
ns0 f17 expr out #txt
ns0 f17 402 240 478 240 #arcP
ns0 f18 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f18 330 394 28 28 14 0 #rect
ns0 f18 @|AlternativeIcon #fIcon
ns0 f14 expr out #txt
ns0 f14 274 376 344 394 #arcP
ns0 f14 1 344 376 #addKink
ns0 f14 0 0.9956010210266141 0 0 #arcLabel
ns0 f13 expr in #txt
ns0 f13 outCond panel.btn_finish.enabled #txt
ns0 f13 344 422 344 478 #arcP
ns0 f20 type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
ns0 f20 398 398 20 20 13 0 #rect
ns0 f20 @|RichDialogProcessEndIcon #fIcon
ns0 f21 expr in #txt
ns0 f21 358 408 398 408 #arcP
ns0 f22 expr out #txt
ns0 f22 274 448 344 478 #arcP
ns0 f22 1 344 448 #addKink
ns0 f22 0 0.9458071281439473 0 0 #arcLabel
ns0 f19 expr out #txt
ns0 f19 274 312 344 394 #arcP
ns0 f19 1 336 312 #addKink
ns0 f19 2 344 320 #addKink
ns0 f19 0 0.43860016297274507 0 0 #arcLabel
>Proto ns0 .rdData2UIAction 'panel.btn_back.enabled=false;
' #txt
>Proto ns0 .type ch.xpertline.xtrans.common.newObjectDialog.newObjectDialogData #txt
>Proto ns0 .processKind RICH_DIALOG #txt
>Proto ns0 -8 -8 16 16 16 26 #rect
>Proto ns0 '' #fIcon
ns0 f0 mainOut f2 tail #connect
ns0 f2 head f1 mainIn #connect
ns0 f3 mainOut f8 tail #connect
ns0 f8 head f4 mainIn #connect
ns0 f4 mainOut f5 tail #connect
ns0 f5 head f7 mainIn #connect
ns0 f15 mainOut f17 tail #connect
ns0 f17 head f16 mainIn #connect
ns0 f6 mainOut f14 tail #connect
ns0 f14 head f18 in #connect
ns0 f18 out f13 tail #connect
ns0 f13 head f11 mainIn #connect
ns0 f18 out f21 tail #connect
ns0 f21 head f20 mainIn #connect
ns0 f10 mainOut f22 tail #connect
ns0 f22 head f11 mainIn #connect
ns0 f9 mainOut f19 tail #connect
ns0 f19 head f18 in #connect
