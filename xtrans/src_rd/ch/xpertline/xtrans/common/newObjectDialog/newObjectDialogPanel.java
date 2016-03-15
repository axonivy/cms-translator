package ch.xpertline.xtrans.common.newObjectDialog;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import com.ulcjava.base.application.util.Color;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.enabler.ULCAndEnabler;

/**
 * <p>newObjectDialogPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class newObjectDialogPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RLabel lbl_path = null;
private RTree treeFolders = null;
private RComboBox cmb_type = null;
private RTextField txt_name = null;
private RBoxPane box_buttons = null;
private RButton btn_cancel = null;
private RButton btn_finish = null;
private RButton btn_next = null;
private RButton btn_back = null;
private RBoxPane box_title = null;
private RLabel icon = null;
private RBoxPane box_titleAndStuff = null;
private RLabel lbl_titleBold = null;
private RLabel lbl_titleThin = null;
private RLabel lbl_step = null;
private ULCAndEnabler ulcenabler = null;  //  @jve:decl-index=0:visual-constraint="513,252"
/**
   * Create a new instance of newObjectDialogPanel
   */
  public newObjectDialogPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes newObjectDialogPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(332,370));
        this.add(getLbl_path(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 3, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getTreeFolders(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 3, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getCmb_type(), new com.ulcjava.base.application.GridBagConstraints(2, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getTxt_name(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_buttons(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 2, 2, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_titleAndStuff(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes lbl_path	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_path() {
	if (lbl_path == null) {
		lbl_path = new RLabel();
		lbl_path.setText("lbl_path");
		lbl_path.setStyleProperties("{/insetsBottom \"10\"/insetsRight \"10\"/fill \"HORIZONTAL\"/insetsLeft \"10\"/weightX \"1\"}");
		lbl_path.setName("lbl_path");
	}
	return lbl_path;
}

/**
 * This method initializes treeFolders	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree	
 */
private RTree getTreeFolders() {
	if (treeFolders == null) {
		treeFolders = new RTree();
		treeFolders.setName("treeFolders");
		treeFolders.setForeground(new Color(51, 51, 51));
		treeFolders.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"15\"/insetsRight \"10\"/fill \"BOTH\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
		treeFolders.setModelConfiguration("{/emptyTableText \"No CMS\"/version \"3.0\"/showTableheader true /autoTableheader false /showtooltip false /showIcons true /columns {{/patterns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/" +
				  						  "icon \"result=ivy.cms.cr(\\\"/ch/ivyteam/xtrans/icons/folder\\\")\"" +
										  "/header \"\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}}}}}");
	}
	return treeFolders;
}

/**
 * This method initializes cmb_type	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox	
 */
private RComboBox getCmb_type() {
	if (cmb_type == null) {
		cmb_type = new RComboBox();
		cmb_type.setName("cmb_type");
		cmb_type.setMandatory(true);
		cmb_type.setStyleProperties("{/insetsBottom \"10\"/fill \"HORIZONTAL\"/insetsRight \"10\"}");
	}
	return cmb_type;
}

/**
 * This method initializes txt_name	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
 */
private RTextField getTxt_name() {
	if (txt_name == null) {
		txt_name = new RTextField();
		txt_name.setText("");
		txt_name.setStyleProperties("{/insetsBottom \"10\"/fill \"HORIZONTAL\"/insetsRight \"20\"/insetsLeft \"10\"/weightX \"1\"}");
		txt_name.setMandatory(true);
		txt_name.setValidation("StringObjectName");
		txt_name.setName("txt_name");
	}
	return txt_name;
}

/**
 * This method initializes box_buttons	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_buttons() {
	if (box_buttons == null) {
		box_buttons = new RBoxPane();
		box_buttons.setName("box_buttons");
		box_buttons.setStyleProperties("{/fill \"BOTH\"/weightX \"1\"}");
		box_buttons.set(4, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_cancel());
		box_buttons.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_finish());
		box_buttons.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_next());
		box_buttons.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_back());
	}
	return box_buttons;
}

/**
 * This method initializes btn_cancel	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_cancel() {
	if (btn_cancel == null) {
		btn_cancel = new RButton();
		btn_cancel.setName("btn_cancel");
		btn_cancel.setStyleProperties("{/insetsBottom \"20\"/marginLeft \"0\"/marginTop \"0\"/marginRight \"0\"/insetsRight \"10\"/fill \"HORIZONTAL\"/marginBottom \"0\"/weightX \"1\"}");
		btn_cancel.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/cancel\")%>");
	}
	return btn_cancel;
}

/**
 * This method initializes btn_finish	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_finish() {
	if (btn_finish == null) {
		btn_finish = new RButton();
		btn_finish.setName("btn_finish");
		btn_finish.setStyleProperties("{/insetsBottom \"20\"/marginLeft \"0\"/marginTop \"0\"/marginRight \"0\"/insetsRight \"5\"/fill \"HORIZONTAL\"/marginBottom \"0\"/weightX \"1\"}");
		btn_finish.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/finish\")%>");
		btn_finish.setEnabler(getUlcenabler());
	}
	return btn_finish;
}

/**
 * This method initializes btn_next	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_next() {
	if (btn_next == null) {
		btn_next = new RButton();
		btn_next.setName("btn_next");
		btn_next.setStyleProperties("{/insetsBottom \"20\"/marginLeft \"0\"/marginTop \"0\"/marginRight \"0\"/insetsRight \"5\"/fill \"HORIZONTAL\"/marginBottom \"0\"/weightX \"1\"}");
		btn_next.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/next\")%>");
		btn_next.setEnabler(getUlcenabler());
	}
	return btn_next;
}

/**
 * This method initializes btn_back	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_back() {
	if (btn_back == null) {
		btn_back = new RButton();
		btn_back.setName("btn_back");
		btn_back.setStyleProperties("{/insetsLeft \"20\"/insetsRight \"5\"/marginTop \"0\"/marginLeft \"0\"/marginBottom \"0\"/marginRight \"0\"/insetsBottom \"20\"/weightX \"1\"/fill \"HORIZONTAL\"}");
		btn_back.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/back\")%>");
	}
	return btn_back;
}

/**
 * This method initializes box_title	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_title() {
	if (box_title == null) {
		RFiller flr = new RFiller();
		flr.setStyle("horizontalGlue");
		box_title = new RBoxPane();
		box_title.setName("box_title");
		box_title.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
		box_title.setBackground(this.getBackground().brighter());
		box_title.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_titleThin());
		box_title.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_titleBold());
		box_title.set(1, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_step());
		box_title.set(2, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr);
	}
	return box_title;
}

/**
 * This method initializes icon	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getIcon() {
	if (icon == null) {
		icon = new RLabel();
		icon.setName("icon");
		icon.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/newThingWizzard\")%>");
	}
	return icon;
}

/**
 * This method initializes box_titleAndStuff	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_titleAndStuff() {
	if (box_titleAndStuff == null) {
		box_titleAndStuff = new RBoxPane();
		box_titleAndStuff.setName("box_titleAndStuff");
		box_titleAndStuff.setStyleProperties("{/fill \"BOTH\"}");
		box_titleAndStuff.setName("box_titleAndStuff");
		box_titleAndStuff.setBackground(this.getBackground().brighter());
		box_titleAndStuff.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getIcon());
		box_titleAndStuff.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_title());
	}
	return box_titleAndStuff;
}

/**
 * This method initializes lbl_titleBold	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_titleBold() {
	if (lbl_titleBold == null) {
		lbl_titleBold = new RLabel();
		lbl_titleBold.setName("lbl_titleBold");
		lbl_titleBold.setStyleProperties("{/font {/name \"Dialog\"/size \"20\"/style \"BOLD\"}/insetsTop \"3\"/insetsLeft \"5\"}");
		lbl_titleBold.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/new\")%>");
	}
	return lbl_titleBold;
}

/**
 * This method initializes lbl_titleThin	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_titleThin() {
	if (lbl_titleThin == null) {
		lbl_titleThin = new RLabel();
		lbl_titleThin.setName("lbl_titleThin");
		lbl_titleThin.setStyleProperties("{/font {/name \"Dialog\"/size \"20\"/style \"PLAIN\"}/insetsTop \"3\"/insetsLeft \"0\"}");
		lbl_titleThin.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/Object\")%>");
	}
	return lbl_titleThin;
}

/**
 * This method initializes lbl_step	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_step() {
	if (lbl_step == null) {
		lbl_step = new RLabel();
		lbl_step.setName("lbl_step");
		lbl_step.setStyleProperties("{/insetsTop \"0\"/insetsLeft \"-5\"}");
		lbl_step.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/wizard\")%> 1/2");
	}
	return lbl_step;
}

/**
 * This method initializes ulcenabler	
 * 	
 * @return com.ulcjava.base.application.enabler.ULCAndEnabler	
 */
private ULCAndEnabler getUlcenabler() {
	if (ulcenabler == null) {
		ulcenabler = new ULCAndEnabler();
		ulcenabler.add(getCmb_type());
		ulcenabler.add(getTxt_name());
	}
	return ulcenabler;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"