package ch.xpertline.xtrans.common.addLanguage;

import com.ulcjava.base.application.util.ULCIcon;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField;

/**
 * <p>addLanguagePanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class addLanguagePanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
private RButton btn_submit = null;
private RLookupTextField lkp_language = null;
  
  /**
   * Create a new instance of addLanguagePanel
   */
  public addLanguagePanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes addLanguagePanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(241,79));
        this.add(getBtn_submit(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getLkp_language(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

/**
 * This method initializes btn_submit	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
 */
private RButton getBtn_submit() {
	if (btn_submit == null) {
		btn_submit = new RButton();
		btn_submit.setText("OK");
		btn_submit.setStyleProperties("{/anchor \"EAST\"/marginLeft \"15\"/marginRight \"15\"/marginTop \"0\"/insetsRight \"10\"/marginBottom \"0\"}");
		btn_submit.setName("btn_submit");
	}
	return btn_submit;
}

/**
 * This method initializes lkp_language	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField	
 */
private RLookupTextField getLkp_language() {
	if (lkp_language == null) {
		lkp_language = new RLookupTextField();
		lkp_language.setText("");
		lkp_language.setStyleProperties("{/insetsLeft \"10\"/insetsRight \"10\"/marginTop \"2\"/marginBottom \"2\"/anchor \"CENTER\"/marginRight \"2\"/insetsTop \"5\"/insetsBottom \"5\"/weightX \"1\"/fill \"HORIZONTAL\"}");
		lkp_language.setName("lkp_language");
		try {
			byte[] bytes = Ivy.cms().getContentObjectValue("/ch/ivyteam/xtrans/icons/world", null).getContentAsByteArray();
			ULCIcon icon = new ULCIcon(bytes);
			lkp_language.setIndicatorIcon(icon);
		} catch (Exception e) {
			Ivy.log().error("Searchfield Icon could not be setted. Reason: "+e.getMessage());
		}	
	}
	return lkp_language;
}
}  //  @jve:decl-index=0:visual-constraint="10,10"