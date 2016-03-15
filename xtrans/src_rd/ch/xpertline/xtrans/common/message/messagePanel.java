package ch.xpertline.xtrans.common.message;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

/**
 * <p>messagePanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class messagePanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RButton ok = null;
private RLabel message = null;
private RLabel icon = null;
  
  /**
   * Create a new instance of messagePanel
   */
  public messagePanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes messagePanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(309,140));
        this.add(getOk(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 3, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getMessage(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getIcon(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes ok	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getOk() {
	if (ok == null) {
		ok = new RButton();
		ok.setStyleProperties("{/insetsBottom \"10\"/marginRight \"30\"/marginLeft \"30\"/marginTop \"0\"/marginBottom \"0\"}");
		ok.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/ok\")%>");
		ok.setName("ok");
	}
	return ok;
}

/**
 * This method initializes message	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getMessage() {
	if (message == null) {
		message = new RLabel();
		message.setText("message");
		message.setStyleProperties("{/insetsBottom \"10\"/insetsTop \"10\"/insetsRight \"20\"/fill \"BOTH\"/insetsLeft \"10\"/weightY \"1\"/weightX \"1\"}");
		message.setName("message");
	}
	return message;
}

/**
 * This method initializes icon	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getIcon() {
	if (icon == null) {
		icon = new RLabel();
		icon.setStyleProperties("{/insetsLeft \"20\"}");
		icon.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/xtrans/icons/dialog/info\")%>");
		icon.setName("icon");
	}
	return icon;
}
}  //  @jve:decl-index=0:visual-constraint="56,50"