package ch.xpertline.xtrans.common.yesNo;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;

/**
 * <p>yesNoPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class yesNoPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RLabel Label = null;
private RButton yes = null;
private RButton no = null;
private RLabel lbl_message = null;
/**
   * Create a new instance of yesNoPanel
   */
  public yesNoPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes yesNoPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(317,165));
        this.add(getLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getYes(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getNo(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getLbl_message(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes Label	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLabel() {
	if (Label == null) {
		Label = new RLabel();
		Label.setStyleProperties("{/insetsLeft \"20\"}");
		Label.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/dialog/info\")%>");
		Label.setName("Label");
	}
	return Label;
}

/**
 * This method initializes yes	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getYes() {
	if (yes == null) {
		yes = new RButton();
		yes.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"10\"/marginRight \"20\"/marginTop \"0\"/marginLeft \"20\"/marginBottom \"0\"/weightX \"1\"}");
		yes.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/yes\")%>");
		yes.setName("yes");
	}
	return yes;
}

/**
 * This method initializes no	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getNo() {
	if (no == null) {
		no = new RButton();
		no.setStyleProperties("{/insetsBottom \"10\"/marginTop \"0\"/marginRight \"20\"/marginLeft \"20\"/insetsRight \"20\"/marginBottom \"0\"/insetsLeft \"30\"/weightX \"0\"}");
		no.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/no\")%>");
		no.setName("no");
	}
	return no;
}

/**
 * This method initializes lbl_message	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getLbl_message() {
	if (lbl_message == null) {
		lbl_message = new RLabel();
		lbl_message.setText("lbl_message");
		lbl_message.setStyleProperties("{/insetsBottom \"10\"/insetsTop \"10\"/fill \"BOTH\"/insetsRight \"20\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
		lbl_message.setName("lbl_message");
		lbl_message.setBackground(this.getBackground().darker());
	}
	return lbl_message;
}
}  //  @jve:decl-index=0:visual-constraint="190,299"