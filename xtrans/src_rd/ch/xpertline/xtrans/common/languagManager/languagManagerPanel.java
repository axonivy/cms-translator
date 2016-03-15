package ch.xpertline.xtrans.common.languagManager;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import com.ulcjava.base.application.ULCListSelectionModel;
import com.ulcjava.base.application.util.Color;

/**
 * <p>languagManagerPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class languagManagerPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RList lis_supported = null;
private RList lis_aviable = null;
private RBoxPane box_buttons = null;
private RBoxPane box_title = null;
private RLabel lbl_titleBold = null;
private RLabel lbl_titleThin = null;
private RHyperlink lnk_add = null;
private RHyperlink lnk_remove = null;
private RScrollPane scr_bottom = null;
private RScrollPane scr_top = null;
  
  /**
   * Create a new instance of languagManagerPanel
   */
  public languagManagerPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes languagManagerPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(286,354));
        this.add(getBox_buttons(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_title(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getScr_bottom(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getScr_top(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes lis_supported	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RList	
 */
private RList getLis_supported() {
	if (lis_supported == null) {
		lis_supported = new RList();
		lis_supported.setName("lis_supported");
		lis_supported.setSelectionMode(ULCListSelectionModel.SINGLE_SELECTION);
		lis_supported.setSelectionForeground(new Color(51, 51, 51));
		lis_supported.setModelConfiguration("{/result \"result=IF(entry.getCountry().trim().length() > 0,entry.getDisplayLanguage() + \\\"(\\\" + entry.getDisplayCountry() + \\\")\\\",entry.getDisplayLanguage())\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
		lis_supported.setStyleProperties("{/insetsTop \"10\"/fill \"BOTH\"/insetsRight \"10\"/insetsLeft \"10\"}");
	}
	return lis_supported;
}

/**
 * This method initializes lis_aviable	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RList	
 */
private RList getLis_aviable() {
	if (lis_aviable == null) {
		lis_aviable = new RList();
		lis_aviable.setName("lis_aviable");
		lis_aviable.setSelectionMode(ULCListSelectionModel.SINGLE_SELECTION);
		lis_aviable.setModelConfiguration("{/result \"result=IF(entry.getCountry().trim().length() > 0,entry.getDisplayLanguage() + \\\"(\\\" + entry.getDisplayCountry() + \\\")\\\",entry.getDisplayLanguage())\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
		lis_aviable.setStyleProperties("{/insetsBottom \"0\"/insetsTop \"0\"/fill \"BOTH\"/insetsRight \"0\"/insetsLeft \"0\"/weightY \"3\"/weightX \"1\"}");
	}
	return lis_aviable;
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
		box_buttons.setStyleProperties("{/fill \"BOTH\"}");
		box_buttons.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_add());
		box_buttons.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_remove());
	}
	return box_buttons;
}

/**
 * This method initializes box_title	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_title() {
	if (box_title == null) {
		RFiller Filler = new RFiller();
		Filler.setStyle("horizontalGlue");
		box_title = new RBoxPane();
		box_title.setName("box_title");
		box_title.setStyleProperties("{/fill \"BOTH\"}");
		box_title.set(0, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_titleBold());
		box_title.set(1, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_titleThin());
		box_title.set(3, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, Filler);
	}
	return box_title;
}

/**
 * This method initializes lbl_titleBold	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_titleBold() {
	if (lbl_titleBold == null) {
		lbl_titleBold = new RLabel();
		lbl_titleBold.setText("Supported");
		lbl_titleBold.setStyleProperties("{/font {/name \"Dialog\"/size \"16\"/style \"BOLD\"}/insetsTop \"15\"/insetsLeft \"10\"}");
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
		lbl_titleThin.setText("Languages");
		lbl_titleThin.setStyleProperties("{/font {/name \"Dialog\"/size \"16\"/style \"PLAIN\"}/insetsTop \"15\"/insetsLeft \"0\"}");
		lbl_titleThin.setName("lbl_titleThin");
	}
	return lbl_titleThin;
}

/**
 * This method initializes lnk_add	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_add() {
	if (lnk_add == null) {
		lnk_add = new RHyperlink();
		lnk_add.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/up/bright\")%>");
		lnk_add.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/up/dark\")%>");
		lnk_add.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/up/dark\")%>");
		lnk_add.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/add\")%>");
		lnk_add.setName("lnk_add");
	}
	return lnk_add;
}

/**
 * This method initializes lnk_remove	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_remove() {
	if (lnk_remove == null) {
		lnk_remove = new RHyperlink();
		lnk_remove.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/down/bright\")%>");
		lnk_remove.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/down/dark\")%>");
		lnk_remove.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/down/dark\")%>");
		lnk_remove.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/remove\")%>");
		lnk_remove.setName("lnk_remove");
	}
	return lnk_remove;
}

/**
 * This method initializes scr_bottom	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
 */
private RScrollPane getScr_bottom() {
	if (scr_bottom == null) {
		scr_bottom = new RScrollPane();
		scr_bottom.setName("scr_bottom");
		scr_bottom.setStyleProperties("{/insetsBottom \"20\"/fill \"BOTH\"/insetsRight \"10\"/insetsLeft \"10\"/weightY \"2\"/weightX \"1\"}");
		scr_bottom.setViewPortView(getLis_aviable());
	}
	return scr_bottom;
}

/**
 * This method initializes scr_top	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
 */
private RScrollPane getScr_top() {
	if (scr_top == null) {
		scr_top = new RScrollPane();
		scr_top.setName("scr_top");
		scr_top.setStyleProperties("{/insetsTop \"5\"/insetsRight \"10\"/fill \"BOTH\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
		scr_top.setViewPortView(getLis_supported());
	}
	return scr_top;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"