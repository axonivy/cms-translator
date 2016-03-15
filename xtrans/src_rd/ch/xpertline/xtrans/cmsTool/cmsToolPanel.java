package ch.xpertline.xtrans.cmsTool;

import java.net.URL;
import java.util.Locale;

import ch.ivyteam.ivy.cm.IContentObjectValue;
import ch.ivyteam.ivy.environment.EnvironmentNotAvailableException;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.persistence.PersistencyException;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;

import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RTextFieldCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.components.RTableTree;
import ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.components.RSlider;

import ch.ivyteam.ivy.scripting.objects.Recordset;

import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.ULCIcon;
import com.ulcjava.base.application.util.Dimension;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.ULCComponent;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.ULCListSelectionModel;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.ULCScrollPane;
import com.ulcjava.base.application.BorderFactory;

import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IKeyListener;
import com.ulcjava.base.application.event.KeyEvent;
import com.ulcjava.base.application.event.IFocusListener;
import com.ulcjava.base.application.event.FocusEvent;
import com.ulcjava.base.application.event.IValueChangedListener;
import com.ulcjava.base.application.event.ValueChangedEvent;
import com.ulcjava.base.application.event.IActionListener;

/**
 * <p>cmsToolPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class cmsToolPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RLabel lbl_title = null;
private RSplitPane spl_content = null;
private RBoxPane box_left = null;
private RBoxPane box_right = null;
private RComboBox cmb_projects = null;
private RScrollPane scr_tree = null;
private RTree tree_cmsObjects = null;
private RBoxPane box_actions = null;
private RHyperlink lnk_export = null;
private RBoxPane box_filters = null;
private RCheckBox chk_DE = null;
private RScrollPane scr_table = null;
private RBoxPane box_bottom = null;
private RButton btn_close = null;
private RHyperlink lnk_import = null;
private RHyperlink lnk_showFilter = null;
private RBoxPane box_title = null;
private RLabel lbl_thinTitle = null;
private RLabel spr_separator1 = null;
private RLabel lbl_subtitle = null;
private RTable tbl_cmsObjects = null;
private RTextFieldCellWidget TextFieldCellWidget = null;  //  @jve:decl-index=0:visual-constraint="496,447"

private String modelConfig = "";  //  @jve:decl-index=0:
private RLookupTextField lup_search = null;
private IFocusListener lst_searchFieldFocus = null;  //  @jve:decl-index=0:visual-constraint="654,245"
private IValueChangedListener lst_checkBoxValueChanged = null;  //  @jve:decl-index=0:visual-constraint="648,285"
private RTextField hdn_hiddenField = null;
private RHyperlink lnk_addLang = null;
private RLabel spr_separator2 = null;
private RTextField hdn_tableEvents = null;
private IValueChangedListener lst_tblValueChangeListener = null;  //  @jve:decl-index=0:visual-constraint="650,203"
private Boolean isDoing = false;  //  @jve:decl-index=0:
private IActionListener lst_isDoingListener = null;  //  @jve:decl-index=0:visual-constraint="648,326"
private RPopupMenu mnu_tree = null;  //  @jve:decl-index=0:visual-constraint="222,508"
private RHyperlink lnk_new = null;
private RLabel spr_separator3 = null;
private RHyperlink lnk_delete = null;
private RPopupMenu mnu_tbl = null;  //  @jve:decl-index=0:visual-constraint="359,517"
private RMenuItem mnu_tbl_dlt = null;  //  @jve:decl-index=0:visual-constraint="385,537"
private IKeyListener lst_tblKeyListener = null;  //  @jve:decl-index=0:visual-constraint="648,363"
private RMenuItem mnu_tree_dlt = null;  //  @jve:decl-index=0:visual-constraint="250,522"
private IKeyListener lst_treeKeyListener = null;  //  @jve:decl-index=0:visual-constraint="649,403"
private RButton hdn_dummyTreeDelete = null;
private IActionListener lst_treeActnListener = null;  //  @jve:decl-index=0:visual-constraint="648,442"
private RMenuItem mnu_tree_newFolder = null;  //  @jve:decl-index=0:visual-constraint="248,524"
private RMenuItem mnu_tbl_addNew = null;  //  @jve:decl-index=0:visual-constraint="450,542"
private RMenuItem mnu_tree_addNewWithWizzard = null;  //  @jve:decl-index=0:visual-constraint="246,518"
private RMenuItem mnu_tree_addNewFast = null;  //  @jve:decl-index=0:visual-constraint="247,520"
private IKeyListener lst_wholeApplKey = null;  //  @jve:decl-index=0:visual-constraint="647,442"
private RSlider sld_rowHeight = null;
private RBoxPane box_sld = null;
private RLabel lbl_plus = null;
private RLabel lbl_minus = null;
private RLabel lbl_rowHeightDesc = null;
private Recordset recordset = new Recordset();  //  @jve:decl-index=0:
private IKeyListener lst_lupSearch = null;  //  @jve:decl-index=0:visual-constraint="643,153"
private RButton hdn_search = null;
/**
   * Create a new instance of cmsToolPanel
   */
  public cmsToolPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes cmsToolPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(642,425));
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(777,512));
        this.add(getSpl_content(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_bottom(), new com.ulcjava.base.application.GridBagConstraints(2, 4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getBox_title(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes lbl_title	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_title() {
	if (lbl_title == null) {
		lbl_title = new RLabel();
		lbl_title.setText("CMS");
		lbl_title.setStyleProperties("{/verticalTextPosition \"TOP\"/font {/name \"Dialog\"/size \"24\"/style \"BOLD\"}/insetsTop \"10\"/fill \"HORIZONTAL\"}");
		lbl_title.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/title\")%>");
		lbl_title.setName("lbl_title");
	}
	return lbl_title;
}

/**
 * This method initializes spl_content	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane	
 */
private RSplitPane getSpl_content() {
	if (spl_content == null) {
		spl_content = new RSplitPane();
		spl_content.setName("spl_content");
		spl_content.setDividerLocation(200);
		spl_content.setDividerSize(20);
		spl_content.setLeftComponent(getBox_left());
		spl_content.setRightComponent(getBox_right());
		spl_content.setStyleProperties("{/insetsBottom \"0\"/insetsTop \"10\"/fill \"BOTH\"/insetsRight \"10\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
	}
	return spl_content;
}

/**
 * This method initializes box_left	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_left() {
	if (box_left == null) {
		box_left = new RBoxPane();
		box_left.setName("box_left");
		box_left.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
		box_left.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getCmb_projects());
		box_left.set(1, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getScr_tree());
	}
	return box_left;
}

/**
 * This method initializes box_right	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_right() {
	if (box_right == null) {
		box_right = new RBoxPane();
		box_right.setName("box_right");
		box_right.setStyleProperties("{/fill \"BOTH\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
		box_right.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_actions());
		box_right.set(0, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_filters());
		box_right.set(0, 2, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getScr_table());
		box_right.set(0, 3, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBox_sld());
	}
	return box_right;
}

/**
 * This method initializes cmb_projects	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox	
 */
private RComboBox getCmb_projects() {
	if (cmb_projects == null) {
		cmb_projects = new RComboBox();
		cmb_projects.setName("cmb_projects");
		cmb_projects.setModelConfiguration("{/result \"\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
		cmb_projects.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
		cmb_projects.addKeyListener(getLst_wholeApplKey());
	}
	return cmb_projects;
}

/**
 * This method initializes scr_tree	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
 */
private RScrollPane getScr_tree() {
	if (scr_tree == null) {
		scr_tree = new RScrollPane();
		scr_tree.setName("scr_tree");
		scr_tree.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
		scr_tree.setViewPortView(getTree_cmsObjects());
	}
	return scr_tree;
}

/**
 * This method initializes tree_cmsObjects	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree	
 */
private RTree getTree_cmsObjects() {
	if (tree_cmsObjects == null) {
		tree_cmsObjects = new RTree();
		tree_cmsObjects.setName("tree_cmsObjects");
		tree_cmsObjects.setToggleClickCount(-1);
		tree_cmsObjects.setAutoSelectFirstEntry(true);
		tree_cmsObjects.setBackground(Color.white);
		tree_cmsObjects.setComponentPopupMenu(getMnu_tree());
		tree_cmsObjects.addKeyListener(getLst_treeKeyListener());
		tree_cmsObjects.setModelConfiguration("{/emptyTableText \"No CMS\"/version \"3.0\"/showTableheader true /autoTableheader false /showtooltip false /showIcons true /columns {{/patterns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/" +
				"icon \"result=ivy.cms.cr(\\\"/ch/ivyteam/xtrans/icons/folder\\\")\"" +
				"/header \"\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}}}}}");
		tree_cmsObjects.addKeyListener(getLst_wholeApplKey());
	}
	return tree_cmsObjects;
}

/**
 * This method initializes box_actions	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_actions() {
	if (box_actions == null) {
		RFiller flr_actions = new RFiller();
		flr_actions.setStyle("horizontalGlue");
		box_actions = new RBoxPane();
		box_actions.setName("box_actions");
		box_actions.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
		box_actions.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_export());
		box_actions.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_import());
		box_actions.set(6, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_actions);
		box_actions.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getSpr_separator1());
		box_actions.set(7, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_showFilter());
		box_actions.set(3, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_new());
		box_actions.set(4, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getSpr_separator3());
		box_actions.set(5, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_delete());
	}
	return box_actions;
}

/**
 * This method initializes lnk_export	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_export() {
	if (lnk_export == null) {
		lnk_export = new RHyperlink();
		lnk_export.setText("Export");
		lnk_export.setStyleProperties("{/verticalTextPosition \"BOTTOM\"/foregroundColor {/b \"0\"/r \"0\"/g \"0\"}/insetsBottom \"3\"/horizontalTextPosition \"CENTER\"}");
		lnk_export.setClickedColor(Color.black);
		lnk_export.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/export/dark\")%>");
		lnk_export.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/export/bright\")%>");
		lnk_export.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/export/bright\")%>");
		lnk_export.setName("lnk_export");
		lnk_export.addKeyListener(getLst_wholeApplKey());
	}
	return lnk_export;
}

/**
 * This method initializes box_filters	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_filters() {
	if (box_filters == null) {
		RFiller flr_fltrs = new RFiller();
		flr_fltrs.setStyle("horizontalGlue");
		flr_fltrs.setName("filler");
		box_filters = new RBoxPane();
		box_filters.setName("box_filters");
		box_filters.setStyleProperties("{/backgroundColor {/b \"249\"/r \"249\"/g \"249\"}/insetsTop \"0\"/fill \"HORIZONTAL\"}");
		box_filters.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.lightGray));
		box_filters.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getChk_DE());
		box_filters.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_fltrs);
		box_filters.set(3, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLnk_addLang());
		box_filters.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getSpr_separator2());
	}
	return box_filters;
}

/**
 * This method initializes chk_DE	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox	
 */
private RCheckBox getChk_DE() {
	if (chk_DE == null) {
		chk_DE = new RCheckBox();
		chk_DE.setText("chk_DE");
		chk_DE.setStyleProperties("{/horizontalAlignment \"RIGHT\"/anchor \"EAST\"/horizontalTextPosition \"RIGHT\"}");
		chk_DE.setName("chk_DE");
		chk_DE.setVisible(false);
		chk_DE.addValueChangedListener(null);
	}
	return chk_DE;
}

/**
 * This method initializes scr_table	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
 */
private RScrollPane getScr_table() {
	if (scr_table == null) {
		scr_table = new RScrollPane();
		scr_table.setName("scr_table");
		scr_table.setStyleProperties("{/insetsTop \"0\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
		scr_table.setVerticalScrollBarPolicy(ULCScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scr_table.setHorizontalScrollBarPolicy(ULCScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scr_table.setViewPortView(getTbl_cmsObjects());
	}
	return scr_table;
}



/**
 * This method initializes box_bottom	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_bottom() {
	if (box_bottom == null) {
		RFiller flr_buttons = new RFiller();
		flr_buttons.setStyle("horizontalGlue");
		box_bottom = new RBoxPane();
		box_bottom.setName("box_bottom");
		box_bottom.setStyleProperties("{/fill \"HORIZONTAL\"}");
		box_bottom.set(6, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getBtn_close());
		box_bottom.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_buttons);
		box_bottom.set(5, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getHdn_hiddenField());
		box_bottom.set(4, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getHdn_tableEvents());
		box_bottom.set(3, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getHdn_dummyTreeDelete());
		box_bottom.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getHdn_search());
	}
	return box_bottom;
}

/**
 * This method initializes btn_close	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_close() {
	if (btn_close == null) {
		btn_close = new RButton();
		btn_close.setStyleProperties("{/insetsLeft \"10\"/insetsRight \"10\"/marginTop \"3\"/iconTextGap \"5\"/marginLeft \"3\"/marginBottom \"3\"/marginRight \"3\"/insetsTop \"10\"/horizontalTextPosition \"LEFT\"/insetsBottom \"15\"/horizontalAlignment \"LEFT\"}");
		btn_close.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/close\")%>");
		btn_close.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/closeRed\")%>");
		btn_close.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/closeRed\")%>");
		btn_close.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/close\")%>");
		btn_close.setToolTipText("Strg + Q");
		btn_close.setName("btn_close");
		btn_close.addKeyListener(getLst_wholeApplKey());
	}
	return btn_close;
}

/**
 * This method initializes lnk_import	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_import() {
	if (lnk_import == null) {
		lnk_import = new RHyperlink();
		lnk_import.setText("Import");
		lnk_import.setStyleProperties("{/verticalTextPosition \"BOTTOM\"/foregroundColor {/b \"0\"/r \"0\"/g \"0\"}/insetsBottom \"3\"/horizontalTextPosition \"CENTER\"}");
		lnk_import.setClickedColor(Color.black);
		lnk_import.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/import/dark\")%>");
		lnk_import.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/import/bright\")%>");
		lnk_import.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/import/bright\")%>");
		lnk_import.setName("lnk_import");
		lnk_import.addKeyListener(getLst_wholeApplKey());
	}
	return lnk_import;
}

/**
 * This method initializes lnk_showFilter	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_showFilter() {
	if (lnk_showFilter == null) {
		lnk_showFilter = new RHyperlink();
		lnk_showFilter.setText("Filter");
		lnk_showFilter.setStyleProperties("{/horizontalAlignment \"CENTER\"/foregroundColor {/b \"0\"/r \"0\"/g \"0\"}/verticalAlignment \"BOTTOM\"/anchor \"SOUTH\"/insetsRight \"0\"/horizontalTextPosition \"CENTER\"}");
		lnk_showFilter.setClickedColor(Color.black);
		lnk_showFilter.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/filterTab\")%>");
		lnk_showFilter.setName("lnk_showFilter");
		lnk_showFilter.addKeyListener(getLst_wholeApplKey());
	}
	return lnk_showFilter;
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
		box_title.setStyleProperties("{/insetsRight \"10\"/fill \"BOTH\"/insetsLeft \"10\"}");
		box_title.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_title());
		box_title.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_thinTitle());
		box_title.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_title);
		box_title.set(1, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_subtitle());
		box_title.set(3, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLup_search());
	}
	return box_title;
}

/**
 * This method initializes lbl_thinTitle	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_thinTitle() {
	if (lbl_thinTitle == null) {
		lbl_thinTitle = new RLabel();
		lbl_thinTitle.setText("Translator");
		lbl_thinTitle.setStyleProperties("{/insetsLeft \"-1\"/font {/name \"Dialog\"/size \"24\"/style \"PLAIN\"}/anchor \"NORTHWEST\"/verticalAlignment \"TOP\"/insetsTop \"10\"/verticalTextPosition \"TOP\"/insetsBottom \"0\"/horizontalTextPosition \"LEFT\"/horizontalAlignment \"LEFT\"}");
		lbl_thinTitle.setName("lbl_thinTitle");
	}
	return lbl_thinTitle;
}

/**
 * This method initializes spr_separator1	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getSpr_separator1() {
	if (spr_separator1 == null) {
		spr_separator1 = new RLabel();
		spr_separator1.setText("|");
		spr_separator1.setName("spr_separator1");
		spr_separator1.setForeground(this.getBackground().darker().darker());
	}
	return spr_separator1;
}

/**
 * This method initializes lbl_subtitle	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_subtitle() {
	if (lbl_subtitle == null) {
		lbl_subtitle = new RLabel();
		lbl_subtitle.setForeground(this.getBackground().darker().darker());
		lbl_subtitle.setText("Manage your content management system!");
		lbl_subtitle.setStyleProperties("{/insetsTop \"-23\"/insetsLeft \"-15\"}");
		lbl_subtitle.setName("lbl_subtitle");
	}
	return lbl_subtitle;
}

/**
 * This method initializes tbl_cmsObjects	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable	
 */
private RTable getTbl_cmsObjects() {
	tbl_cmsObjects = new RTable();
	tbl_cmsObjects.setName("tbl_cmsObjects");
	tbl_cmsObjects.setSortable(true);
	if (modelConfig == null || modelConfig == ""){
		tbl_cmsObjects.setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=record.getField(\\\"Name\\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Name\\\"\"/field \"\"/editable \"false\"/condition \"\"/columnStyle \"\"/cellWidget \"\"}{/result \"result=record.getField(\\\"EN\\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"EN\\\"\"/field \"\"/editable \"true\"/condition \"\"/columnStyle \"\"/cellWidget \"TextFieldCellWidget\"}{/result \"result=record.getField(\\\"Path\\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Path\\\"\"/field \"\"/editable \"false\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}}}");
		tbl_cmsObjects.setRowHeight(50);
		tbl_cmsObjects.setName("tbl_cmsObjects");
	} else{
		tbl_cmsObjects.setModelConfiguration(modelConfig);
	}
	tbl_cmsObjects.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
	tbl_cmsObjects.setComponentPopupMenu(getMnu_tbl());
	tbl_cmsObjects.addValueChangedListener(getLst_tblValueChangeListener());
	tbl_cmsObjects.addKeyListener(getLst_tblKeyListener());
	tbl_cmsObjects.addKeyListener(lst_wholeApplKey);

	return tbl_cmsObjects;
}

public void repaintTable(String _config){
	modelConfig = _config;
	scr_table.setViewPortView(getTbl_cmsObjects());
	tbl_cmsObjects.setRowHeight(sld_rowHeight.getValue());
}

/**
 * This method initializes TextFieldCellWidget	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RTextFieldCellWidget	
 */
private RTextFieldCellWidget getTextFieldCellWidget() {
	if (TextFieldCellWidget == null) {
		TextFieldCellWidget = new RTextFieldCellWidget();
		TextFieldCellWidget.setText("TextFieldCellWidget");
		TextFieldCellWidget.setStyleProperties("{/backgroundColor {/b \"255\"/r \"255\"/g \"255\"}/foregroundColor {/b \"0\"/r \"0\"/g \"0\"}}");
		TextFieldCellWidget.setName("TextFieldCellWidget");
		TextFieldCellWidget.addKeyListener(getLst_tblKeyListener());
	}
	return TextFieldCellWidget;
}

/**
 * This method initializes lup_search	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField	
 */
private RLookupTextField getLup_search() {
	if (lup_search == null) {
		lup_search = new RLookupTextField();
		lup_search.setText("");
		lup_search.setStyleProperties("{/foregroundColor {/b \"128\"/r \"128\"/g \"128\"}/marginRight \"1\"/marginTop \"1\"/fill \"HORIZONTAL\"/marginBottom \"1\"/weightX \"0.3\"}");
		lup_search.setName("lup_search");
		lup_search.addFocusListener(getLst_searchFieldFocus());
		lup_search.addKeyListener(getLst_lupSearch());
		lup_search.setForeground(Color.gray);
		lup_search.addKeyListener(getLst_wholeApplKey());
		try {
			byte[] bytes = Ivy.cms().getContentObjectValue("/ch/ivyteam/xtrans/icons/search/bright", null).getContentAsByteArray();
			ULCIcon icon = new ULCIcon(bytes);
			lup_search.setIndicatorIcon(icon);
		} catch (Exception e) {
			Ivy.log().error("Searchfield Icon could not be setted. Reason: "+e.getMessage());
		}		
	}
	return lup_search;
}

/**
 * This method initializes lst_searchFieldFocus	
 * 	
 * @return com.ulcjava.base.application.event.IFocusListener	
 */
private IFocusListener getLst_searchFieldFocus() {
	if (lst_searchFieldFocus == null) {
		lst_searchFieldFocus = new IFocusListener() {
			public void focusGained(FocusEvent event) {
				try {
					byte[] bytes = Ivy.cms().getContentObjectValue("/ch/ivyteam/xtrans/icons/search/dark", null).getContentAsByteArray();
					ULCIcon icon = new ULCIcon(bytes);
					lup_search.setIndicatorIcon(icon);
				} catch (Exception e) {
					Ivy.log().error("Searchfield Icon could not be setted. Reason: "+e.getMessage());
				}
			}

			public void focusLost(FocusEvent event) {
				try {
					byte[] bytes = Ivy.cms().getContentObjectValue("/ch/ivyteam/xtrans/icons/search/bright", null).getContentAsByteArray();
					ULCIcon icon = new ULCIcon(bytes);
					lup_search.setIndicatorIcon(icon);
				} catch (Exception e) {
					Ivy.log().error("Searchfield Icon could not be setted. Reason: "+e.getMessage());
				}
			}
		};
	}
	return lst_searchFieldFocus;
}

/**
 * This method initializes lst_checkBoxValueChanged	
 * 	
 * @return com.ulcjava.base.application.event.IValueChangedListener	
 */
public IValueChangedListener getLst_checkBoxValueChanged() {
	if (lst_checkBoxValueChanged == null) {
		lst_checkBoxValueChanged = new IValueChangedListener() {

			public void valueChanged(ValueChangedEvent event) {
				String lang = ((RCheckBox) event.getSource()).getText()+"/"+((RCheckBox) event.getSource()).isSelected();
				hdn_hiddenField.setText(lang);
				isDoing = true;
			}
		};
	}
	return lst_checkBoxValueChanged;
}

/**
 * This method initializes hdn_hiddenField	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
 */
private RTextField getHdn_hiddenField() {
	if (hdn_hiddenField == null) {
		hdn_hiddenField = new RTextField();
		hdn_hiddenField.setText("");
		hdn_hiddenField.setName("hdn_hiddenField");
		hdn_hiddenField.setVisible(false);
	}
	return hdn_hiddenField;
}

/**
 * This method initializes lnk_addLang	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
public RHyperlink getLnk_addLang() {
	if (lnk_addLang == null) {
		lnk_addLang = new RHyperlink();
		lnk_addLang.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/add/add_colour\")%>");
		lnk_addLang.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/add/add_colour\")%>");
		lnk_addLang.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/add/add_gray\")%>");
		lnk_addLang.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/tooltips/addLang\")%>");
		lnk_addLang.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"10\"}");
		lnk_addLang.setName("lnk_addLang");
		lnk_addLang.addKeyListener(getLst_wholeApplKey());
	}
	return lnk_addLang;
}

/**
 * This method initializes spr_separator2	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
public RLabel getSpr_separator2() {
	if (spr_separator2 == null) {
		spr_separator2 = new RLabel();
		spr_separator2.setText("|");
		spr_separator2.setName("spr_separator2");
	}
	return spr_separator2;
}

/**
 * This method initializes hdn_tableEvents	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
 */
private RTextField getHdn_tableEvents() {
	if (hdn_tableEvents == null) {
		hdn_tableEvents = new RTextField();
		hdn_tableEvents.setText("");
		hdn_tableEvents.setName("hdn_tableEvents");
		hdn_tableEvents.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1000\"}");
		hdn_tableEvents.setVisible(false);
	}
	return hdn_tableEvents;
}

/**
 * This method initializes lst_tblValueChangeListener	
 * 	
 * @return com.ulcjava.base.application.event.IValueChangedListener	
 */
private IValueChangedListener getLst_tblValueChangeListener() {
	if (lst_tblValueChangeListener == null) {
		lst_tblValueChangeListener = new IValueChangedListener() {

			public void valueChanged(ValueChangedEvent event) {
				if(tbl_cmsObjects.getRecordsetData() != null){
					if((recordset.size() == tbl_cmsObjects.getRecordsetData().size() && recordset.columnCount() == tbl_cmsObjects.getRecordsetData().columnCount()) || (lup_search.getForeground() != Color.gray && lup_search.getText().trim().length() > 0)){
						if (!isDoing){
							hdn_tableEvents.setText("EDIT:"+tbl_cmsObjects.getRecordsetData().toString());
						}else{
							hdn_tableEvents.setText("DONG:"+tbl_cmsObjects.getRecordsetData().toString());
							isDoing = false;
						}
					}
					recordset = tbl_cmsObjects.getRecordsetData();
				}
			}
		};
	}
	return lst_tblValueChangeListener;
}


/**
 * This method initializes lst_isDoingListener	
 * 	
 * @return com.ulcjava.base.application.event.serializable.IActionListener	
 */
private IActionListener getLst_isDoingListener() {
	if (lst_isDoingListener == null) {
		lst_isDoingListener = new IActionListener() {

			public void actionPerformed(ActionEvent event) {
				isDoing = true;
			}
		};
	}
	return lst_isDoingListener;
}

/**
 * This method initializes mnu_tree	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu	
 */
private RPopupMenu getMnu_tree() {
	if (mnu_tree == null) {
		mnu_tree = new RPopupMenu();
		mnu_tree.setName("mnu_tree");
		mnu_tree.add(getMnu_tree_newFolder());
		mnu_tree.add(getMnu_tree_dlt());
		mnu_tree.addSeparator();
		mnu_tree.add(getMnu_tree_addNewWithWizzard());
		mnu_tree.add(getMnu_tree_addNewFast());
	}
	return mnu_tree;
}

/**
 * This method initializes lnk_new	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_new() {
	if (lnk_new == null) {
		lnk_new = new RHyperlink();
		lnk_new.setText("New");
		lnk_new.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/addBig/dark\")%>");
		lnk_new.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/addBig/bright\")%>");
		lnk_new.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/addBig/bright\")%>");
		lnk_new.setStyleProperties("{/verticalTextPosition \"BOTTOM\"/horizontalAlignment \"CENTER\"/foregroundColor {/b \"0\"/r \"0\"/g \"0\"}/verticalAlignment \"TOP\"/insetsBottom \"3\"/insetsLeft \"20\"/horizontalTextPosition \"CENTER\"}");
		lnk_new.setClickedColor(Color.black);
		lnk_new.setToolTipText("Strg + N");
		lnk_new.setName("lnk_new");
		lnk_new.addKeyListener(getLst_wholeApplKey());
	}
	return lnk_new;
}

/**
 * This method initializes spr_separator3	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getSpr_separator3() {
	if (spr_separator3 == null) {
		Color color = this.getBackground().darker().darker();
		spr_separator3 = new RLabel();
		spr_separator3.setName("spr_separator3");
		spr_separator3.setText("|");
		spr_separator3.setForeground(color);
	}
	return spr_separator3;
}

/**
 * This method initializes lnk_delete	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink	
 */
private RHyperlink getLnk_delete() {
	if (lnk_delete == null) {
		lnk_delete = new RHyperlink();
		lnk_delete.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/remove/dark\")%>");
		lnk_delete.setPressedIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/remove/bright\")%>");
		lnk_delete.setRolloverIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/remove/bright\")%>");
		lnk_delete.setStyleProperties("{/verticalTextPosition \"BOTTOM\"/horizontalAlignment \"CENTER\"/foregroundColor {/b \"0\"/r \"0\"/g \"0\"}/verticalAlignment \"TOP\"/insetsBottom \"3\"/horizontalTextPosition \"CENTER\"}");
		lnk_delete.setClickedColor(Color.black);
		lnk_delete.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/delete\")%>");
		lnk_delete.setName("lnk_delete");
		lnk_delete.addKeyListener(getLst_wholeApplKey());
	}
	return lnk_delete;
}

/**
 * This method initializes mnu_tbl	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu	
 */
private RPopupMenu getMnu_tbl() {
	if (mnu_tbl == null) {
		mnu_tbl = new RPopupMenu();
		mnu_tbl.setName("mnu_tbl");
		mnu_tbl.add(getMnu_tbl_addNew());
		mnu_tbl.add(getMnu_tbl_dlt());
		mnu_tbl.setMinimumSize(new Dimension(110, 5));
	}
	return mnu_tbl;
}

/**
 * This method initializes mnu_tbl_dlt	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem	
 */
private RMenuItem getMnu_tbl_dlt() {
	if (mnu_tbl_dlt == null) {
		mnu_tbl_dlt = new RMenuItem();
		mnu_tbl_dlt.setText("  "+Ivy.cms().co("/ch/ivyteam/xtrans/labels/common/delete")+"                          ");
		mnu_tbl_dlt.setName("mnu_tbl_dlt");
		isDoing = true;
	}
	return mnu_tbl_dlt;
}

/**
 * This method initializes lst_tblKeyListener	
 * 	
 * @return com.ulcjava.base.application.event.IKeyListener	
 */
private IKeyListener getLst_tblKeyListener() {
	if (lst_tblKeyListener == null) {
		lst_tblKeyListener = new IKeyListener() {

			public void keyTyped(KeyEvent event) {
				if (event.getKeyChar() == event.VK_DELETE){
					lnk_delete.doClick();
				}
				Ivy.log().debug("click...");
				
				
			}
		};
	}
	return lst_tblKeyListener;
}

/**
 * This method initializes mnu_tree_dlt	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem	
 */
private RMenuItem getMnu_tree_dlt() {
	if (mnu_tree_dlt == null) {
		mnu_tree_dlt = new RMenuItem();
		mnu_tree_dlt.setText("  "+Ivy.cms().co("/ch/ivyteam/xtrans/labels/common/delete"));
		mnu_tree_dlt.setName("mnu_tree_dlt");
	}
	return mnu_tree_dlt;
}

/**
 * This method initializes lst_treeKeyListener	
 * 	
 * @return com.ulcjava.base.application.event.IKeyListener	
 */
private IKeyListener getLst_treeKeyListener() {
	if (lst_treeKeyListener == null) {
		lst_treeKeyListener = new IKeyListener() {

			public void keyTyped(KeyEvent event) {
				if (event.getKeyChar() == event.VK_DELETE){
					hdn_dummyTreeDelete.doClick();
				}
			}
		};
	}
	return lst_treeKeyListener;
}

/**
 * This method initializes hdn_dummyTreeDelete	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getHdn_dummyTreeDelete() {
	if (hdn_dummyTreeDelete == null) {
		hdn_dummyTreeDelete = new RButton();
		hdn_dummyTreeDelete.setText("");
		hdn_dummyTreeDelete.setVisible(false);
		hdn_dummyTreeDelete.setName("hdn_dummyTreeDelete");
	}
	return hdn_dummyTreeDelete;
}

/**
 * This method initializes mnu_tree_newFolder	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem	
 */
private RMenuItem getMnu_tree_newFolder() {
	if (mnu_tree_newFolder == null) {
		mnu_tree_newFolder = new RMenuItem();
		mnu_tree_newFolder.setName("mnu_tree_newFolder");
		mnu_tree_newFolder.setText("  "+Ivy.cms().co("/ch/ivyteam/xtrans/labels/labels/newFolder"));
	}
	return mnu_tree_newFolder;
}

/**
 * This method initializes mnu_tbl_addNew	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem	
 */
private RMenuItem getMnu_tbl_addNew() {
	if (mnu_tbl_addNew == null) {
		mnu_tbl_addNew = new RMenuItem();
		mnu_tbl_addNew.setText("  "+"<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/newObject\")%>");
		mnu_tbl_addNew.setName("mnu_tbl_addNew");
	}
	return mnu_tbl_addNew;
}

/**
 * This method initializes mnu_tree_addNewWithWizzard	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem	
 */
private RMenuItem getMnu_tree_addNewWithWizzard() {
	if (mnu_tree_addNewWithWizzard == null) {
		mnu_tree_addNewWithWizzard = new RMenuItem();
		mnu_tree_addNewWithWizzard.setText("  "+"<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/newObject\")%>");
		mnu_tree_addNewWithWizzard.setName("mnu_tree_addNewWithWizzard");
	}
	return mnu_tree_addNewWithWizzard;
}

/**
 * This method initializes mnu_tree_addNewFast	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem	
 */
private RMenuItem getMnu_tree_addNewFast() {
	if (mnu_tree_addNewFast == null) {
		mnu_tree_addNewFast = new RMenuItem();
		mnu_tree_addNewFast.setName("mnu_tree_addNewFast");
		mnu_tree_addNewFast.setText("  "+"<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/labels/newObjectFast\")%>");
	}
	return mnu_tree_addNewFast;
}

/**
 * This method initializes lst_wholeApplKey	
 * 	
 * @return com.ulcjava.base.application.event.IKeyListener	
 */
private IKeyListener getLst_wholeApplKey() {
	if (lst_wholeApplKey == null) {
		lst_wholeApplKey = new IKeyListener() {

			public void keyTyped(KeyEvent event) {
				if (event.getKeyChar() == 14 && event.isControlDown() && !event.isAltDown() && !event.isAltGraphDown() && ! event.isShiftDown() && lnk_new.isEnabled()){
					lnk_new.doClick();
				}
				if (event.getKeyChar() == 6 && event.isControlDown() && !event.isAltDown() && !event.isAltGraphDown() && ! event.isShiftDown() && lup_search.isEnabled()){
					lup_search.requestFocus();
				}
				if (event.getKeyChar() == 17 && event.isControlDown()  && !event.isAltDown() && !event.isAltGraphDown() && !event.isShiftDown() && btn_close.isEnabled()){
					btn_close.doClick();
				}
				
				if (event.getKeyChar() == 43 && !event.isControlDown()  && event.isAltDown() && !event.isAltGraphDown() && sld_rowHeight.isVisible()){
					if (sld_rowHeight.getValue() < sld_rowHeight.getMaximum() - 5){
						sld_rowHeight.setValue(sld_rowHeight.getValue() + 5);
					}else{
						sld_rowHeight.setValue(sld_rowHeight.getMaximum());
					}
				}
				if (event.getKeyChar() == 45 && !event.isControlDown()  && event.isAltDown() && !event.isAltGraphDown() && sld_rowHeight.isVisible()){
					if (sld_rowHeight.getValue() > sld_rowHeight.getMinimum() + 5){
						sld_rowHeight.setValue(sld_rowHeight.getValue() - 5);
					}else{
						sld_rowHeight.setValue(sld_rowHeight.getMinimum());
					}
				}
			}
			
		};
	}
	return lst_wholeApplKey;
}

/**
 * This method initializes sld_rowHeight	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RSlider	
 */
private RSlider getSld_rowHeight() {
	if (sld_rowHeight == null) {
		sld_rowHeight = new RSlider();
		sld_rowHeight.setName("sld_rowHeight");
		sld_rowHeight.setMinimum(15);
		sld_rowHeight.setMaximum(50);
		sld_rowHeight.setMinimumSize(new com.ulcjava.base.application.util.Dimension(150,20));
		sld_rowHeight.setMaximumSize(new com.ulcjava.base.application.util.Dimension(150,20));
		sld_rowHeight.setPreferredSize(new com.ulcjava.base.application.util.Dimension(150,20));
		sld_rowHeight.setFocusable(false);
		sld_rowHeight.setValue(20);
		sld_rowHeight.setPaintLabels(true);
		sld_rowHeight.setStyleProperties("{/anchor \"EAST\"/fill \"NONE\"/insetsLeft \"3\"}");
	}
	return sld_rowHeight;
}

/**
 * This method initializes box_sld	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane	
 */
private RBoxPane getBox_sld() {
	if (box_sld == null) {
		RFiller flr_rowHeight = new RFiller();
		flr_rowHeight.setStyle("horizontalGlue");
		box_sld = new RBoxPane();
		box_sld.setName("box_sld");
		box_sld.setStyleProperties("{/anchor \"EAST\"/fill \"BOTH\"}");
		box_sld.set(3, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getSld_rowHeight());
		box_sld.set(4, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_plus());
		box_sld.set(2, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_minus());
		box_sld.set(1, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLbl_rowHeightDesc());
		box_sld.set(0, 1, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, flr_rowHeight);
	}
	return box_sld;
}

/**
 * This method initializes lbl_plus	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_plus() {
	if (lbl_plus == null) {
		lbl_plus = new RLabel();
		lbl_plus.setText("+");
		lbl_plus.setName("lbl_plus");
		lbl_plus.setStyleProperties("{/font {/name \"Dialog\"/size \"14\"/style \"BOLD\"}/insetsBottom \"0\"/insetsTop \"0\"/insetsLeft \"3\"}");
		lbl_plus.setForeground(this.getBackground().darker());
		lbl_plus.setToolTipText("Alt + +");
	}
	return lbl_plus;
}

/**
 * This method initializes lbl_minus	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_minus() {
	if (lbl_minus == null) {
		lbl_minus = new RLabel();
		lbl_minus.setText("-");
		lbl_minus.setStyleProperties("{/font {/name \"Dialog\"/size \"14\"/style \"BOLD\"}/insetsTop \"-3\"/insetsBottom \"4\"}");
		lbl_minus.setName("lbl_minus");
		lbl_minus.setForeground(this.getBackground().darker());
		lbl_minus.setToolTipText("Alt + -");
	}
	return lbl_minus;
}

/**
 * This method initializes lbl_rowHeightDesc	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_rowHeightDesc() {
	if (lbl_rowHeightDesc == null) {
		lbl_rowHeightDesc = new RLabel();
		lbl_rowHeightDesc.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/components/lbl_rowHeightDesc\")%>");
		lbl_rowHeightDesc.setStyleProperties("{/font {/name \"Dialog\"/size \"9\"/style \"PLAIN\"}/anchor \"NORTH\"/insetsTop \"-2\"/insetsRight \"5\"}");
		lbl_rowHeightDesc.setName("lbl_rowHeightDesc");
		lbl_rowHeightDesc.setForeground(this.getBackground().darker());
	}
	return lbl_rowHeightDesc;
}

/**
 * This method initializes lst_lupSearch	
 * 	
 * @return com.ulcjava.base.application.event.IKeyListener	
 */
private IKeyListener getLst_lupSearch() {
	if (lst_lupSearch == null) {
		lst_lupSearch = new IKeyListener() {

			public void keyTyped(KeyEvent event) {
				if((int) event.getKeyChar() == (int) event.VK_ENTER){
					hdn_search.doClick();
				}
			}
		};
	}
	return lst_lupSearch;
}

/**
 * This method initializes hdn_search	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getHdn_search() {
	if (hdn_search == null) {
		hdn_search = new RButton();
		hdn_search.setText("");
		hdn_search.setName("hdn_search");
		hdn_search.setVisible(false);
	}
	return hdn_search;
}
}  //  @jve:decl-index=0:visual-constraint="-32,7"