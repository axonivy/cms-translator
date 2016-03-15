package ch.xpertline.xtrans.excel;

import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.xpertline.ria.util.RDCallbackMethodHandler;

import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.ULCComponent;
import com.ulcjava.base.application.util.IFileLoadHandler;
import com.ulcjava.base.shared.FileChooserConfig;
import com.ulcjava.base.shared.FileChooserConfig.FileFilterConfig;

public class importHandler<T extends ULCComponent & IRichDialogPanel> {
	
	private ProgressMsg returnedMessage = new ProgressMsg();
	private T ulcPane = null;
	private List<String> langList;
	private List<String> pathList;
	private List<Map<String, String>> valueList;
	private final static DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.##################################################################################################");
	
	@SuppressWarnings("unchecked")
	public importHandler(){
		ulcPane = null;
		returnedMessage = new ProgressMsg();
		langList = List.create(String.class);
		pathList = List.create(String.class);
		Map<String, String> muMap = new HashMap<String, String>();
		valueList = (List<Map<String, String>>) List.create(muMap.getClass());
	}
	
	@SuppressWarnings("unchecked")
	public importHandler(final T _ulcPane){
		ulcPane = _ulcPane;
		returnedMessage = new ProgressMsg();
		langList = List.create(String.class);
		pathList = List.create(String.class);
		Map<String, String> muMap = new HashMap<String, String>();
		valueList = (List<Map<String, String>>) List.create(muMap.getClass());
	}
	
	public ImportData importExcel()
	{
		ImportData imp = new ImportData();
		
		returnedMessage.setType(ProgressMsg.INFORMATION_MESSAGE);
		returnedMessage.setText("");
		//uploadedFile = null;

		FileChooserConfig fcConfig = new FileChooserConfig();
		fcConfig.setDialogTitle(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/chooseFile"));
		fcConfig.setFileSelectionMode(FileChooserConfig.FILES_ONLY);
		fcConfig.setApproveButtonText("Import");
		fcConfig.setMultiSelectionEnabled(false);
		fcConfig.addFileFilterConfig(new FileFilterConfig(new String[] {"xls"}, "*.xls")); // We accept just xls files
		ClientContext.setFileTransferMode(ClientContext.SYNCHRONOUS_MODE);
		ClientContext.loadFile(new IFileLoadHandler(){
			public void onFailure(int reason, String description)
			{
				if (reason != CANCELLED){
					returnedMessage.setText(description);
					returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
					RDCallbackMethodHandler.callRDMethod(ulcPane, "errorMethod", new Object[] {returnedMessage});
				}
			}

			@SuppressWarnings({ "deprecation" })
			public void onSuccess(InputStream ins[], String filePaths[], String fileNames[]){
				try {
					if (fileNames.length == 1 && fileNames[0].endsWith(".xls")){
						HSSFWorkbook wb = new HSSFWorkbook(ins[0]);
						if(wb.getNumberOfSheets() > 0){
							HSSFSheet shiit = wb.getSheetAt(0);
							if (shiit.getPhysicalNumberOfRows() > 0){
								if(shiit.getRow(0).getPhysicalNumberOfCells() > 0){
									for (int i = 0; i < shiit.getPhysicalNumberOfRows(); i++){
										Map<String, String> map = new HashMap<>();
										valueList.add(map);
									}
									for (int i = 0; i < shiit.getRow(0).getPhysicalNumberOfCells(); i++){
										if (shiit.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Path")){
											
											for (int j = 1; j < shiit.getPhysicalNumberOfRows(); j++){
												pathList.add(shiit.getRow(j).getCell(i).getStringCellValue());
												valueList.get(j-1).put("Path", shiit.getRow(j).getCell(i).getStringCellValue());
											}
										}else if (!shiit.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Name")){
											String lang = shiit.getRow(0).getCell(i).getStringCellValue();
											langList.add(lang);
											for (int j = 1; j < shiit.getPhysicalNumberOfRows(); j++){
												HSSFCell cCell = shiit.getRow(j).getCell(i);
												  
												String s = (cCell.getCellType() == HSSFCell.CELL_TYPE_STRING ? cCell.getRichStringCellValue().getString() : DECIMAL_FORMAT.format(cCell.getNumericCellValue()));
												
												valueList.get(j - 1).put(lang, s);
											}
											
										}
									}
									if (pathList.size() == 0 || pathList.isEmpty()){
										Exception e = new Exception(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/notAllColsFound"));
										throw e;
									}
									if (langList.size() == 0 || langList.isEmpty()){
										Exception e = new Exception(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/noLangsInFile"));
										throw e;
									}
									ImportData imp = new ImportData();
									imp.setLangList(langList);
									imp.setPathList(pathList);
									imp.setReturnedMessage(returnedMessage);
									imp.setValueList(valueList);
									RDCallbackMethodHandler.callRDMethod(ulcPane, "importWizzard", new Object[] {imp});
								}else{
									Exception e = new Exception(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/notAllColsFound"));
									throw e;
								}
							}else{
								Exception e = new Exception(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/notAllColsFound"));
								throw e;
							}
						}else{
							Exception e = new Exception(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/noSheet"));
							throw e;
						}
					}else{
						returnedMessage.setText(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/notAnXls"));
						returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
						RDCallbackMethodHandler.callRDMethod(ulcPane, "errorMethod", new Object[] {returnedMessage});
					}
				} catch (Exception e) {
					returnedMessage.setText(e.getMessage());
					returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
					RDCallbackMethodHandler.callRDMethod(ulcPane, "errorMethod", new Object[] {returnedMessage});
				}
			}
		}, fcConfig, null);// end of ClientContext.loadFile
		imp.setLangList(langList);
		imp.setPathList(pathList);
		imp.setReturnedMessage(returnedMessage);
		imp.setValueList(valueList);
		return imp;
	}
	
	public List<String> getLangList(){
		return langList;
	}
}
