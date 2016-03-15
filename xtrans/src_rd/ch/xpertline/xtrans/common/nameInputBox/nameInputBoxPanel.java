package ch.xpertline.xtrans.common.nameInputBox;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import com.ulcjava.base.application.enabler.ULCAndEnabler;

/**
 * <p>nameInputBoxPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class nameInputBoxPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RTextField input = null;
private RButton ok = null;
private RButton cancel = null;
private ULCAndEnabler ulcenabler = null;  //  @jve:decl-index=0:visual-constraint="383,65"
  
  /**
   * Create a new instance of nameInputBoxPanel
   */
  public nameInputBoxPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes nameInputBoxPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(265,73));
        this.add(getInput(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getOk(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getCancel(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes input	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
 */
private RTextField getInput() {
	if (input == null) {
		input = new RTextField();
		input.setText("");
		input.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"10\"/fill \"HORIZONTAL\"/insetsRight \"20\"/insetsLeft \"20\"}");
		input.setMandatory(true);
		input.setValidation("StringObjectName");
		input.setName("input");
	}
	return input;
}

/**
 * This method initializes ok	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getOk() {
	if (ok == null) {
		ok = new RButton();
		ok.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/marginLeft \"20\"/marginTop \"0\"/marginRight \"20\"/insetsRight \"10\"/marginBottom \"0\"/weightX \"1\"}");
		ok.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/ok\")%>");
		ok.setName("ok");
		ok.setEnabler(getUlcenabler());
	}
	return ok;
}

/**
 * This method initializes cancel	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getCancel() {
	if (cancel == null) {
		cancel = new RButton();
		cancel.setName("cancel");
		cancel.setStyleProperties("{/insetsBottom \"5\"/marginLeft \"10\"/marginRight \"10\"/marginTop \"0\"/insetsRight \"20\"/marginBottom \"0\"}");
		cancel.setText("<%=ivy.cms.co(\"/ch/ivyteam/xtrans/labels/common/cancel\")%>");
	}
	return cancel;
}

/**
 * This method initializes ulcenabler	
 * 	
 * @return com.ulcjava.base.application.enabler.ULCAndEnabler	
 */
private ULCAndEnabler getUlcenabler() {
	if (ulcenabler == null) {
		ulcenabler = new ULCAndEnabler();
		ulcenabler.add(getInput());
	}
	return ulcenabler;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"