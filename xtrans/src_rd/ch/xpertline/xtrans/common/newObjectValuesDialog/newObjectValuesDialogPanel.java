package ch.xpertline.xtrans.common.newObjectValuesDialog;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.util.Color;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import com.ulcjava.base.application.enabler.ULCAndEnabler;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import com.ulcjava.base.application.border.ULCBevelBorder;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.util.SystemColor;
import com.ulcjava.base.application.util.Font;
import ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink;
import com.ulcjava.base.application.ULCScrollPane;

/**
 * <p>newObjectValuesDialogPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class newObjectValuesDialogPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RBoxPane box_titleAndStuff = null;
private RLabel icon = null;
private RBoxPane box_title = null;
private RLabel lbl_titleThin = null;
private RLabel lbl_titleBold = null;
private RLabel lbl_step = null;
private RBoxPane box_buttons = null;
private RButton btn_cancel = null;
private RButton btn_finish = null;
private RButton btn_next = null;
private RButton btn_back = null;
private RScrollPane box_center = null;
public  RBoxPane box_main = null;
private RLabel lbl_path = null;
private RLabel lbl_type = null;
private RBoxPane box_desc = null;
private RHyperlink lnk_addVal = null;
private RLabel lbl_title = null;
/**
   * Create a new instance of newObjectValuesDialogPanel
   */
  public newObjectValuesDialogPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes newObjectValuesDialogPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(332,370));
        this.add(getBox_titleAndStuff(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_buttons(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_center(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
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
		box_titleAndStuff.setBackground(this.getBackground().brighter());
		box_titleAndStuff.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getIcon());
		box_titleAndStuff.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_title());
	}
	return box_titleAndStuff;
}

/**
 * This method initializes icon	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getIcon() {
	if (icon == null) {
		icon = new RLabel();
		icon.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/newThingWizzard\")%>");
		icon.setName("icon");
	}
	return icon;
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
 * This method initializes lbl_titleThin	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_titleThin() {
	if (lbl_titleThin == null) {
		lbl_titleThin = new RLabel();
		lbl_titleThin.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/Object\")%>");
		lbl_titleThin.setName("lbl_titleThin");
		lbl_titleThin.setStyleProperties("{/font {/name \"Dialog\"/size \"20\"/style \"PLAIN\"}/insetsTop \"3\"/insetsLeft \"0\"}");
	}
	return lbl_titleThin;
}

/**
 * This method initializes lbl_titleBold	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_titleBold() {
	if (lbl_titleBold == null) {
		lbl_titleBold = new RLabel();
		lbl_titleBold.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/new\")%>");
		lbl_titleBold.setName("lbl_titleBold");
		lbl_titleBold.setStyleProperties("{/font {/name \"Dialog\"/size \"20\"/style \"BOLD\"}/insetsTop \"3\"/insetsLeft \"5\"}");
	}
	return lbl_titleBold;
}

/**
 * This method initializes lbl_step	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_step() {
	if (lbl_step == null) {
		lbl_step = new RLabel();
		lbl_step.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/wizard\")%> 2/2");
		lbl_step.setName("lbl_step");
		lbl_step.setStyleProperties("{/insetsTop \"0\"/insetsLeft \"-5\"}");
	}
	return lbl_step;
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
		btn_next.setEnabler(new ULCAndEnabler());
		btn_next.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/next\")%>");
		btn_next.setStyleProperties("{/insetsBottom \"20\"/marginLeft \"0\"/marginTop \"0\"/marginRight \"0\"/insetsRight \"5\"/fill \"HORIZONTAL\"/marginBottom \"0\"/weightX \"1\"}");
		btn_next.setName("btn_next");
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
 * This method initializes box_center	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
 */
private RScrollPane getBox_center() {
	if (box_center == null) {
		box_center = new RScrollPane();
		box_center.setName("box_center");
		box_center.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
		box_center.setVerticalScrollBarPolicy(ULCScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		box_center.setViewPortView(getBox_main());
	}
	return box_center;
}

/**
 * This method initializes box_main	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_main() {
	if (box_main == null) {
		RFiller theFiller = new RFiller();
		theFiller.setStyle("verticalGlue");
		box_main = new RBoxPane();
		box_main.setName("box_main");
		box_main.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_desc());
		box_main.set(0, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, theFiller);
	}
	return box_main;
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
		lbl_path.setStyleProperties("{/insetsLeft \"10\"}");
		lbl_path.setName("lbl_path");
	}
	return lbl_path;
}

/**
 * This method initializes lbl_type	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_type() {
	if (lbl_type == null) {
		lbl_type = new RLabel();
		lbl_type.setText("lbl_type");
		lbl_type.setStyleProperties("{/insetsTop \"5\"/insetsRight \"10\"}");
		lbl_type.setName("lbl_type");
	}
	return lbl_type;
}

/**
 * This method initializes box_desc	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_desc() {
	if (box_desc == null) {
		box_desc = new RBoxPane();
		box_desc.setName("box_desc");
		box_desc.setStyleProperties("{/insetsBottom \"10\"/fill \"HORIZONTAL\"/weightX \"1\"}");
		box_desc.set(0, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_path());
		box_desc.set(1, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_type());
		box_desc.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_addVal());
		box_desc.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_title());
	}
	return box_desc;
}

/**
 * This method initializes lnk_addVal	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_addVal() {
	if (lnk_addVal == null) {
		lnk_addVal = new RHyperlink();
		lnk_addVal.setName("lnk_addVal");
		lnk_addVal.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/addCO/dark\")%>");
		lnk_addVal.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/addCO/bright\")%>");
		lnk_addVal.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/addCO/bright\")%>");
		lnk_addVal.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsRight \"10\"}");
	}
	return lnk_addVal;
}

/**
 * This method initializes lbl_title	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_title() {
	if (lbl_title == null) {
		lbl_title = new RLabel();
		lbl_title.setName("lbl_title");
		lbl_title.setStyleProperties("{/font {/name \"Dialog\"/size \"12\"/style \"BOLD\"}/fill \"HORIZONTAL\"/insetsRight \"10\"/insetsLeft \"10\"/weightX \"1\"}");
		lbl_title.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/contentObject\")%>");
	}
	return lbl_title;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"