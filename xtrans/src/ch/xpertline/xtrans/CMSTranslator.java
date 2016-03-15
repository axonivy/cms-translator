package ch.xpertline.xtrans;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.cm.CoType;
import ch.ivyteam.ivy.cm.IContentManagement;
import ch.ivyteam.ivy.cm.IContentManagementSystem;
import ch.ivyteam.ivy.cm.IContentObject;
import ch.ivyteam.ivy.cm.IContentObjectValue;
import ch.ivyteam.ivy.environment.EnvironmentNotAvailableException;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ivy.scripting.objects.Recordset;
import ch.ivyteam.ivy.security.SecurityManagerFactory;
import ch.xpertline.ria.util.RDCallbackMethodHandler;
import ch.xpertline.xtrans.cmsTool.cmsToolPanel;
import ch.xpertline.xtrans.excel.ProgressMsg;

/**
 * Helper-class for translating CMS of other projects in the same workspace
 * 
 * @author 	pb, lt
 * @date	02.07.2009
 */
@SuppressWarnings("deprecation")
public class CMSTranslator {
	
	private static String processName;
	private static IProcessModelVersion proModVers;
	private List<String> langs = null;
	private static cmsToolPanel parentPanel;
	private static ProgressMsg progressMessage;
	
	private IContentManagementSystem cms;
	/**
	 * load a CMS and login as developer user
	 * 
	 * @param projectName
	 * @throws Exception 
	 */
	public CMSTranslator(String projectName) throws Exception{
		Ivy.session().loginSessionUser("Developer", "Developer");
		cms = getCmsForProject(projectName);	
	}
	
	public CMSTranslator(IProcessModelVersion _pmv) throws Exception{
		Ivy.session().loginSessionUser("Developer", "Developer");
		cms = getCmsForPMV(_pmv);
	}
	
	
	public IContentManagementSystem getCms() {
		return this.cms;
	}
	
	/**
	 * Load a CMS from a different project located in the same workspace
	 * 
	 * @param _projectName
	 * @return
	 * @throws Exception 
	 * @throws EnvironmentNotAvailableException 
	 */
	private static IContentManagementSystem getCmsForProject(String _projectName) throws EnvironmentNotAvailableException, Exception{
		processName = _projectName;
		
		IContentManagementSystem cms = SecurityManagerFactory.getSecurityManager().executeAsSystem(new Callable<IContentManagementSystem>() {
			@Override
			public IContentManagementSystem call() throws Exception {
				IContentManagement cm = Ivy.cms().getContentManagement();
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IProject project = workspace.getRoot().getProject(processName);
				IProcessModelVersion pmv = (IProcessModelVersion) project.getAdapter(IProcessModelVersion.class);
				IContentManagementSystem cms = cm.findCms(pmv, "cms");
				return cms;
			}
		});	
		
		return cms;
	}
	
	private static IContentManagementSystem getCmsForPMV(IProcessModelVersion _pmv) throws EnvironmentNotAvailableException, Exception{
		proModVers = _pmv;
		
		IContentManagementSystem cms = SecurityManagerFactory.getSecurityManager().executeAsSystem(new Callable<IContentManagementSystem>() {
			@Override
			public IContentManagementSystem call() throws Exception {
				IContentManagement cm = Ivy.cms().getContentManagement();
				IContentManagementSystem cms = cm.findCms(proModVers, "cms");
				return cms;
			}
		});	
		
		return cms;
	}
		
	public java.util.List<IContentObject> getContentHierarchyList(IContentObject currentLevel) throws PersistencyException{		
		java.util.List<IContentObject> allLevelChildren = List.create(IContentObject.class);
		java.util.List<IContentObject> currentLevelChildren = (java.util.List<IContentObject>) currentLevel.getChildren();
		Iterator<IContentObject> cLCI = currentLevelChildren.iterator();
		IContentObject currentContentObject;
		
		// read current content object recursivly and add all children to the output list
		while(cLCI.hasNext()){
			currentContentObject = (IContentObject) cLCI.next();
			if (Constants.EDITABLE_CONTENT_TYPES.contains(currentContentObject.getContentObjectType().getCoType())){
				allLevelChildren.add(currentContentObject);
				allLevelChildren.addAll(getContentHierarchyList(currentContentObject));
			} else if (currentContentObject.getContentObjectType().getCoType() == CoType.FOLDER){
				allLevelChildren.addAll(getContentHierarchyList(currentContentObject));
			}
		}
		return allLevelChildren;
	}
	
	@SuppressWarnings("unchecked")
	public java.util.List<CMSObject> getWholeContent(List<IContentObject> _contentList) throws PersistencyException {
		IContentObject currentContentObject;
		IContentObjectValue currentObjectValue;
		java.util.List<IContentObjectValue> currentObjectValues;
		CMSObject currentTO;
		java.util.List<CMSObject> translationObjectList = List.create(CMSObject.class);
		
		// read the list of content objects for wrapping to translation objects
		for (int i = 0; i < _contentList.size(); i++) {
			currentTO = new CMSObject();

			currentContentObject = _contentList.get(i);
			currentTO.setName((String) currentContentObject.getName());
			currentTO.setPath((String) currentContentObject.getUri());

			currentObjectValues = (java.util.List<IContentObjectValue>) currentContentObject.getValues();

			CoType currentType = currentContentObject.getContentObjectType().getCoType();
			
			if (currentObjectValues.size() > 0) {
				HashMap<String, String> hm = new HashMap<String, String>();
				currentTO.setValue(hm);
				for (int j = 0; j < currentObjectValues.size(); j++) {

					currentObjectValue = currentObjectValues.get(j);
					try {
						String l = "";
						if (currentObjectValue.getLanguage().getDisplayCountry().trim().length() > 0){
							l = currentObjectValue.getLanguage().getLanguage().toUpperCase() + "_" + currentObjectValue.getLanguage().getCountry(); 
						} else {
							l = currentObjectValue.getLanguage().getLanguage().toUpperCase();
						}
						
						if (Constants.EDITABLE_CONTENT_TYPES.contains(currentType)){
							currentTO.getValue().put(l, currentObjectValue.getContentAsString());
							currentTO.setType(currentType);
						} else {
							currentTO.setType(CoType.FOLDER);
						}
					} catch (PersistencyException e) {
						Ivy.log().error(e.getMessage());
						currentObjectValue.delete("xtrans");
					}
				}
			} else {
				if (Constants.EDITABLE_CONTENT_TYPES.contains(currentType)){
					currentTO.setType(currentType);
				} else {
					currentTO.setType(CoType.FOLDER);
				}
			}
			translationObjectList.add(currentTO);
			currentTO = null;
		}
		return translationObjectList;
	}
	
	public Recordset getValueRecordset(List<CMSObject> _cmsObject, List<String> _langs) throws PersistencyException{
		List<String> clmns = List.create(String.class);
		langs = List.create(String.class);
		
		if (_langs != null){
			langs = _langs;
		} else {
			for (int i = 0; i < cms.getSupportedLanguages().size(); i++){
				if (cms.getSupportedLanguages().get(i).getCountry().trim().length() > 0){
					langs.add(cms.getSupportedLanguages().get(i).getLanguage().toUpperCase() + "_" + cms.getSupportedLanguages().get(i).getCountry());
				}else{
					langs.add(cms.getSupportedLanguages().get(i).getLanguage().toUpperCase());
				}
			}
		}
		Collections.sort(langs);
		
		clmns.add("Name");
		clmns.addAll(langs);
		clmns.add("Path");
		Recordset res = new Recordset(clmns);
		for (int j = 0; j < _cmsObject.size(); j++){
			List<String> currRow = List.create(String.class);
			CMSObject currObject = _cmsObject.get(j);
			
			currRow.add(currObject.getName());
				for (int i = 0; i < langs.size(); i++){
					if (currObject.getValue() == null || currObject.getValue().isEmpty()) {
						currRow.add("");
					}else if (currObject.getValue().get(langs.get(i)) != null){
						currRow.add((String) currObject.getValue().get(langs.get(i)));
					} else {
						currRow.add("");
					}
				}
			currRow.add(currObject.getPath());
			res.add(currRow);
		}
		return res;
	}
	
	
	public List<String> getLanguages() throws PersistencyException {
		return langs;
	}

	
	public void setPanel(cmsToolPanel _panel){
		if (_panel != null){
			parentPanel = _panel;
		}
	}
	
	public void addNewFolder(String _path, String _name) throws PersistencyException{
		if (_path == "/" || _path == "//" || _path == ""){
			cms.getRootContentObject().addChild(_name, "", CoType.FOLDER, "xtrans");
		}else{
			cms.getContentObject(_path).addChild(_name, "", CoType.FOLDER, "xtrans");
		}
	}
	
	public void addNewObject (String _path, String _name, String _type, List<Locale> _langs, List<String> _vlues) throws PersistencyException{
		CoType ct = CoType.STRING;
		if (_type.equalsIgnoreCase("text")){
			ct = CoType.TEXT;
		}
		IContentObject co = cms.getContentObject(_path).addChild(_name, "", ct, "xtrans");
		String pth = co.getUri();
		for (int i = 0; i < _langs.size(); i++){
			this.saveObjectValue(co, _vlues.get(i), pth, _langs.get(i));
		}
	}
	
	public void deleteObjects(List<String> _paths) throws PersistencyException{
		if (_paths == null){
			progressMessage = new ProgressMsg();
			progressMessage.setText(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/pathListEmpty"));
			progressMessage.setType(ProgressMsg.ERROR_MESSAGE);
			RDCallbackMethodHandler.callRDMethod(parentPanel, "errorMethod", new Object[]{progressMessage});
			return;
		}
		for (int i = 0; i < _paths.size(); i++){
			cms.getContentObject(_paths.get(i)).delete();
		}
	}
	
	public int executeImport(List<Map<String, String>> _vals, List<String> _langs, Boolean _createNew, Boolean _overwrite, Boolean _handleUnsup) throws PersistencyException{
		List<Locale> suppLangs = List.create(Locale.class);
		List<String> tempList = _langs;
		int c = 0;
		
		for (int i = 0; i < tempList.size(); i++){
			Locale l;
			if (tempList.get(i).contains("_")){
				l = new Locale(tempList.get(i).substring(0, tempList.get(i).lastIndexOf("_")), tempList.get(i).substring(tempList.get(i).lastIndexOf("_")+1));
			}else{
				l = new Locale(tempList.get(i));
			}
			if (cms.getSupportedLanguages().contains(l)){
				suppLangs.add(l);
			}else{
				if(_handleUnsup){
					cms.addSupportedLanguage(l);
					suppLangs.add(l);
					RDCallbackMethodHandler.callRDMethod(parentPanel, "supportedLangAdded", new Object[]{l});
					langs.add(tempList.get(i));
				}else{
					_langs.remove(tempList.get(i));
					i--;
				}
			}
		}
		
		for (int i = 0; i < _vals.size(); i++){
			Map<String, String> m = _vals.get(i);
			String path = m.get("Path");
			if (path != null && path.trim().length() > 0){
				IContentObject co =  cms.getContentObject(path);
				if (co == null && _createNew){
					co = cms.getContentObject(path.substring(0, path.lastIndexOf("/"))).addChild(path.substring(path.lastIndexOf("/")+1, path.length()), "", CoType.STRING, "xtrans");
					co.addValue("", new java.util.Date(), null, cms.getDefaultLanguage(), "xtrans", true, "");
				}
				if (co != null){
					for (int j = 0; j < suppLangs.size(); j++){
						c = c + saveObjectValue(co, m.get(_langs.get(j)), path, suppLangs.get(j), _overwrite);
					}
				}
			}
		}
		return c;
	}
	
	public void removeLanguage(Locale _lang) throws PersistencyException{
		try{
			for(int j = 0; j < cms.getRootContentObject().getChildren().size(); j++){
				removeLanguageContent(cms.getRootContentObject().getChildren().get(j), _lang);
			}
			cms.removeSupportedLanguage(_lang);
		}catch(Throwable t){
			Ivy.log().error(t.getMessage(), t);
			progressMessage = new ProgressMsg();
			progressMessage.setText(t.getMessage());
			progressMessage.setType(ProgressMsg.ERROR_MESSAGE);
			RDCallbackMethodHandler.callRDMethod(parentPanel, "errorMethod", new Object[]{progressMessage});
		}
		langs.remove(_lang.getLanguage());
		return;
	}
	
	private void removeLanguageContent(IContentObject _co, Locale _l) throws PersistencyException{
		IContentObjectValue cov = cms.getContentObjectValue(_co.getUri(), _l);
		if(cov != null){
			if (cov.getLanguage().equals(_l)){
				cov.delete("xtrans");
			}
		}
		if(_co.hasChildren()){
			for (int i = 0; i < _co.getChildren().size(); i++){
				removeLanguageContent(_co.getChildren().get(i), _l);
			}
		}
	}
	
	public void saveObjectValue(IContentObject _co, String _val, String _pth, java.util.Locale _lang) throws PersistencyException, IllegalArgumentException{
		if (_val == null || _co == null || _lang == null || _pth == null){
			return;
		}else {
			IContentObjectValue cov = cms.getContentObjectValue(_pth, _lang, true);
			if (cov != null){
				if (_lang.equals(cms.getDefaultLanguage()) && _val.length() == 0){
					cov.setContent("", "xtrans");
				}else if (_val.length() == 0){
					cov.delete("xtrans");
				} else {
					if (cov.getLanguage().equals(_lang)){
						if (cov.getContentAsString() == null){
							cov.setContent(_val, "xtrans");
						} else if (!cov.getContentAsString().trim().equals(_val)) { // value changed -> update cmsValue
							cov.setContent(_val, "xtrans");
						}
					} else {
						_co.addValue("", new java.util.Date(), null, _lang, "", _lang == cms.getDefaultLanguage(), "").setContent(_val, "xtrans");
					}
				}
			}  else {
				_co.addValue("", new java.util.Date(), null, _lang, "", _lang == cms.getDefaultLanguage(), "").setContent(_val, "xtrans");
			}
		}
	}
	
	private int saveObjectValue(IContentObject _co, String _val, String _pth, java.util.Locale _lang, Boolean _overwrite) throws PersistencyException, IllegalArgumentException{
		int c = 0;
		_val = _val.trim();
		if (_val == null || _co == null || _lang == null || _pth == null){
			return 0;
		}else {
			IContentObjectValue cov = cms.getContentObjectValue(_pth, _lang, true);
			if (cov != null){
				if (_val.length() > 0) {
					if (cov.getLanguage().equals(_lang)){
						if (cov.getContentAsString() == null){
							c++;
							cov.setContent(_val, "xtrans");
						} else if (!cov.getContentAsString().trim().equals(_val.trim()) && _overwrite) { // value changed -> update cmsValue
							c++;
							cov.setContent(_val, "xtrans");
						}
					} else {
						c++;
						_co.addValue("", new java.util.Date(), null, _lang, "", _lang == cms.getDefaultLanguage(), "").setContent(_val, "xtrans");
					}
				}
			}  else {
				c++;
				_co.addValue("", new java.util.Date(), null, _lang, "", _lang == cms.getDefaultLanguage(), "").setContent(_val, "xtrans");
			}
			return c;
		}
	}	
}
