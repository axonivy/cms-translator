package ch.xpertline.xtrans.excel.importWizard;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.util.Color;
import ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.xpertline.ria.util.RDCallbackMethodHandler;

import com.ulcjava.base.application.event.IValueChangedListener;
import com.ulcjava.base.application.event.ValueChangedEvent;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.components.RButtonGroup;

/**
 * <p>importWizardPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class importWizardPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RBoxPane box_title = null;
private RBoxPane box_main = null;
private RBoxPane box_buttons = null;
private RLabel lbl_titleBold = null;
private RLabel lbl_titleThin = null;
private RButton btn_sumbit = null;
private RButton btn_cancel = null;
private RBoxPane box_createUnexisting = null;
private RBoxPane box_overWriteExisting = null;
private RBoxPane box_wichLanguages = null;
private RRadioButton rad_createUnex_true = null;
private RRadioButton rad_createUnex_false = null;
private RRadioButton rad_overwrite_true = null;
private RRadioButton rad_overwrite_false = null;
private RCheckBox chk_justSupported = null;
private IValueChangedListener iValueChangedListener = null;  //  @jve:decl-index=0:visual-constraint="556,172"
private RTextField hdn_langs = null;
private RButtonGroup overwrite = null;  //  @jve:decl-index=0:visual-constraint="634,401"
private RButtonGroup create = null;  //  @jve:decl-index=0:visual-constraint="678,490"
/**
   * Create a new instance of importWizardPanel
   */
  public importWizardPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes importWizardPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(361,414));
        this.add(getBox_title(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_main(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_buttons(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes box_title	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_title() {
	if (box_title == null) {
		RFiller flr_title = new RFiller();
		flr_title.setStyle("horizontalGlue");
		box_title = new RBoxPane();
		box_title.setName("box_title");
		box_title.setStyleProperties("{/insetsTop \"10\"/insetsRight \"10\"/fill \"HORIZONTAL\"/weightX \"1\"}");
		box_title.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_titleBold());
		box_title.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_titleThin());
		box_title.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_title);
	}
	return box_title;
}

/**
 * This method initializes box_main	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_main() {
	if (box_main == null) {
		box_main = new RBoxPane();
		box_main.setName("box_main");
		box_main.setStyleProperties("{/insetsBottom \"10\"/insetsTop \"10\"/insetsRight \"10\"/fill \"BOTH\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
		box_main.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_createUnexisting());
		box_main.set(0, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_overWriteExisting());
		box_main.set(0, 2, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_wichLanguages());
		box_main.set(0, 3, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getChk_justSupported());
		box_main.set(0, 4, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getHdn_langs());
	}
	return box_main;
}

/**
 * This method initializes box_buttons	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_buttons() {
	if (box_buttons == null) {
		RFiller flr_buttons = new RFiller();
		flr_buttons.setStyle("horizontalGlue");
		flr_buttons.setStyleProperties("{/weightX \"8\"}");
		box_buttons = new RBoxPane();
		box_buttons.setName("box_buttons");
		box_buttons.setStyleProperties("{/insetsBottom \"15\"/fill \"HORIZONTAL\"/insetsLeft \"10\"}");
		box_buttons.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_sumbit());
		box_buttons.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_cancel());
		box_buttons.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_buttons);
	}
	return box_buttons;
}

/**
 * This method initializes lbl_titleBold	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_titleBold() {
	if (lbl_titleBold == null) {
		lbl_titleBold = new RLabel();
		lbl_titleBold.setText("Import");
		lbl_titleBold.setStyleProperties("{/font {/name \"Dialog\"/size \"18\"/style \"BOLD\"}/insetsLeft \"10\"}");
		lbl_titleBold.setName("lbl_titleBold");
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
		lbl_titleThin.setStyleProperties("{/font {/name \"Dialog\"/size \"18\"/style \"PLAIN\"}/insetsBottom \"0\"/insetsTop \"0\"/insetsRight \"0\"/insetsLeft \"0\"}");
		lbl_titleThin.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/ttl_wizard\")%>");
		lbl_titleThin.setName("lbl_titleThin");
	}
	return lbl_titleThin;
}

/**
 * This method initializes btn_sumbit	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_sumbit() {
	if (btn_sumbit == null) {
		btn_sumbit = new RButton();
		btn_sumbit.setName("btn_sumbit");
		btn_sumbit.setStyleProperties("{/marginTop \"0\"/marginRight \"25\"/marginLeft \"25\"/fill \"HORIZONTAL\"/marginBottom \"0\"}");
		btn_sumbit.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/ok\")%>");
	}
	return btn_sumbit;
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
		btn_cancel.setStyleProperties("{/marginLeft \"15\"/marginRight \"15\"/marginTop \"0\"/fill \"HORIZONTAL\"/insetsRight \"10\"/marginBottom \"0\"}");
		btn_cancel.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/cancel\")%>");
	}
	return btn_cancel;
}

/**
 * This method initializes box_createUnexisting	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_createUnexisting() {
	if (box_createUnexisting == null) {
		box_createUnexisting = new RBoxPane();
		box_createUnexisting.setName("box_createUnexisting");
		box_createUnexisting.setBorder(BorderFactory.createTitledBorder(null, "Create unexisting", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(12, 74, 124)));
		box_createUnexisting.setStyleProperties("{/insetsBottom \"5\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
		box_createUnexisting.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getRad_createUnex_true());
		box_createUnexisting.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getRad_createUnex_false());
	}
	return box_createUnexisting;
}

/**
 * This method initializes box_overWriteExisting	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_overWriteExisting() {
	if (box_overWriteExisting == null) {
		box_overWriteExisting = new RBoxPane();
		box_overWriteExisting.setName("box_overWriteExisting");
		box_overWriteExisting.setBorder(BorderFactory.createTitledBorder(null, "Overwrite Content", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(12, 74, 124)));
		box_overWriteExisting.setStyleProperties("{/insetsBottom \"5\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
		box_overWriteExisting.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getRad_overwrite_true());
		box_overWriteExisting.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getRad_overwrite_false());
	}
	return box_overWriteExisting;
}

/**
 * This method initializes box_wichLanguages	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_wichLanguages() {
	if (box_wichLanguages == null) {
		box_wichLanguages = new RBoxPane();
		box_wichLanguages.setName("box_wichLanguages");
		box_wichLanguages.setBorder(BorderFactory.createTitledBorder(null, "Languages", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(12, 74, 124)));
		box_wichLanguages.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
	}
	return box_wichLanguages;
}

/**
 * This method initializes rad_createUnex_true	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton	
 */
private RRadioButton getRad_createUnex_true() {
	if (rad_createUnex_true == null) {
		rad_createUnex_true = new RRadioButton();
		rad_createUnex_true.setName("rad_createUnex_true");
		rad_createUnex_true.setGroup(getCreate());
		rad_createUnex_true.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/rad_createUnex_true\")%>");
	}
	return rad_createUnex_true;
}

/**
 * This method initializes rad_createUnex_false	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton	
 */
private RRadioButton getRad_createUnex_false() {
	if (rad_createUnex_false == null) {
		rad_createUnex_false = new RRadioButton();
		rad_createUnex_false.setName("rad_createUnex_false");
		rad_createUnex_false.setGroup(getCreate());
		rad_createUnex_false.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/rad_createUnex_false\")%>");
	}
	return rad_createUnex_false;
}

/**
 * This method initializes rad_overwrite_true	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton	
 */
private RRadioButton getRad_overwrite_true() {
	if (rad_overwrite_true == null) {
		rad_overwrite_true = new RRadioButton();
		rad_overwrite_true.setName("rad_overwrite_true");
		rad_overwrite_true.setGroup(getOverwrite());
		rad_overwrite_true.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/rad_overwrite_true\")%>");
	}
	return rad_overwrite_true;
}

/**
 * This method initializes rad_overwrite_false	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton	
 */
private RRadioButton getRad_overwrite_false() {
	if (rad_overwrite_false == null) {
		rad_overwrite_false = new RRadioButton();
		rad_overwrite_false.setName("rad_overwrite_false");
		rad_overwrite_false.setGroup(getOverwrite());
		rad_overwrite_false.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/rad_overwrite_false\")%>");
	}
	return rad_overwrite_false;
}

/**
 * This method initializes chk_justSupported	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox	
 */
private RCheckBox getChk_justSupported() {
	if (chk_justSupported == null) {
		chk_justSupported = new RCheckBox();
		chk_justSupported.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"0\"/insetsTop \"0\"/insetsRight \"0\"/insetsLeft \"0\"}");
		chk_justSupported.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/chk_justSupported\")%>");
		chk_justSupported.setName("chk_justSupported");
	}
	return chk_justSupported;
}

/**
 * This method initializes iValueChangedListener	
 * 	
 * @return com.ulcjava.base.application.event.IValueChangedListener	
 */
public IValueChangedListener getIValueChangedListener() {
	if (iValueChangedListener == null) {
		iValueChangedListener = new IValueChangedListener() {

			public void valueChanged(ValueChangedEvent event) {
				hdn_langs.setText(((RCheckBox) event.getSource()).isSelected()+((RCheckBox) event.getSource()).getText()); 
			}
		};
	}
	return iValueChangedListener;
}

/**
 * This method initializes hdn_langs	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
 */
private RTextField getHdn_langs() {
	if (hdn_langs == null) {
		hdn_langs = new RTextField();
		hdn_langs.setText("");
		hdn_langs.setName("hdn_langs");
	}
	return hdn_langs;
}

/**
 * This method initializes overwrite	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButtonGroup	
 */
private RButtonGroup getOverwrite() {
	if (overwrite == null) {
		overwrite = new RButtonGroup();
	}
	return overwrite;
}

/**
 * This method initializes create	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButtonGroup	
 */
private RButtonGroup getCreate() {
	if (create == null) {
		create = new RButtonGroup();
	}
	return create;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"