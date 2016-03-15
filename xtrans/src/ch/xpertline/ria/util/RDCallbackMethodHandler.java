/**
 * This class allows calling a method on a RichDialog Panel from a java class or a java Object.
 *  
 */
package ch.xpertline.ria.util;

import java.lang.reflect.InvocationTargetException;

import com.ulcjava.base.application.ULCComponent;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;

/**
 * @author ec
 * This Class is an utility class to be able to communicate from a java context with a method in a Rich Dialog.<br>
 * The RD method has to be declared in the RD public Interface.
 */
public abstract class RDCallbackMethodHandler {
	/**
	 * This method allows invoking a method on a RichDialog Panel from a java class or a java Object.<br>
	 *<br>
	 * @param RDPanel : the RD panel that wich method has to be called back.<br>
	 *  The RDPanel has to implement ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel (RGridbagLayoutPane...)
	 * @param methodName : the method that has to be called back
	 * @param parameters : array of the parameters that have to be passed to the method
	 * @return null if the callback method couldn't be called, or an array of Object that the Method in the RD interface should return.<br>
	 * If the called method is void, it returns an empty array.
	 */
	public static Object[] callRDMethod(IRichDialogPanel RDPanel, String methodName, Object[] parameters){
		Object[] ret = null;
		
			if(RDPanel!=null && methodName !=null && methodName.trim().length()>0){
				try {
					ret = RDPanel.getPanelAPI().callMethod(methodName, parameters);
					
				} catch (InvocationTargetException ex) {
					//Ivy.log().error("RDCallbackMethodHandler InvocationTargetException "+ex.getMessage());
				} catch (NoSuchMethodException ex) {
					//Ivy.log().error("RDCallbackMethodHandler NoSuchMethodException "+ex.getMessage());
				}catch(Exception ex){
					Ivy.log().error("RDCallbackMethodHandler "+ex.getMessage());
				}catch(Error ex){
					Ivy.log().error("RDCallbackMethodHandler "+ex.getMessage());
				}
			}else{
				Ivy.log().error("One of the parameters was invalid ");
			
			}
		
		return ret;
	}
	
	/**
	 * This method allows invoking a method on a ULCComponent Panel from a java class or a java Object.<br>
	 *<br>
	 * @param RDPanel : the RD panel that which method has to be called back.<br>
	 *  The RDPanel has to implement ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel (RGridbagLayoutPane...)
	 *  If this is not an IRichDialogPanel, the result will be null.
	 * @param methodName : the method that has to be called back
	 * @param parameters : array of the parameters that have to be passed to the method
	 * @return null if the callback method couldn't be called, or an array of Object that the Method in the RD interface should return.<br>
	 * If the called method is void, it returns an empty array.
	 */
	public static Object[] callRDMethodFromULCComponent(ULCComponent RDPanel, String methodName, Object[] parameters){
		Object[] ret = null;
		if(RDPanel!=null && methodName !=null && methodName.trim().length()>0){
			if(!(RDPanel instanceof IRichDialogPanel)) {
				//Ivy.log().debug(RDPanel.getClass().toString()+ " is not an IRichDialogPanel.");
				String s []= {"Not an IRichDialogPanel."};
				return s;
			}
			else{
				IRichDialogPanel iRich = (IRichDialogPanel)RDPanel;
				try {
					/*
					for(int i=0; i<parameters.length; i++){
						Ivy.log().info(parameters[i]+" "+parameters[i].getClass().getName());
					}
					Ivy.log().debug(RDPanel.getClass().toString()+" is an IRichDialog");
					*/
					ret = iRich.getPanelAPI().callMethod(methodName, parameters);
					
				} catch (InvocationTargetException ex) {
					//Ivy.log().error("RDCallbackMethodHandler InvocationTargetException "+ex);
				} catch (NoSuchMethodException ex) {
					//Ivy.log().error("RDCallbackMethodHandler NoSuchMethodException "+ex);
				}catch(Exception ex){
					Ivy.log().error("RDCallbackMethodHandler "+ex.getMessage());
				}catch(Error ex){
					Ivy.log().error("RDCallbackMethodHandler "+ex.getMessage());
				}
			}
		}
		return ret;
	}
}
