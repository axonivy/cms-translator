package ch.xpertline.xtrans.common.lanngChooser;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;

/**
 * <p>lanngChooserPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class lanngChooserPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RList langs = null;
private RButton submit = null;
  
  /**
   * Create a new instance of lanngChooserPanel
   */
  public lanngChooserPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes lanngChooserPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(226,104));
        this.add(getLangs(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getSubmit(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes langs	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RList	
 */
private RList getLangs() {
	if (langs == null) {
		langs = new RList();
		langs.setName("langs");
		langs.setStyleProperties("{/insetsBottom \"10\"/insetsTop \"10\"/insetsRight \"10\"/fill \"BOTH\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
	}
	return langs;
}

/**
 * This method initializes submit	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getSubmit() {
	if (submit == null) {
		submit = new RButton();
		submit.setName("submit");
		submit.setStyleProperties("{/insetsBottom \"10\"/marginRight \"40\"/marginLeft \"40\"/marginTop \"-2\"/marginBottom \"-2\"}");
		submit.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/ok\")%>");
	}
	return submit;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"