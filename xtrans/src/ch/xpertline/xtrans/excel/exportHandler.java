package ch.xpertline.xtrans.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.ULCComponent;
import com.ulcjava.base.application.util.IFileStoreHandler;
import com.ulcjava.base.shared.FileChooserConfig;
import com.ulcjava.base.shared.FileChooserConfig.FileFilterConfig;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.scripting.objects.Date;
import ch.xpertline.ria.util.RDCallbackMethodHandler;


public class exportHandler<T extends ULCComponent & IRichDialogPanel> {
	
	private ProgressMsg returnedMessage;
	private T ulcPane = null;
	
	private static java.io.File exportedExcel;
	private static String outputPath;
	private static String outputName;
	private static String fullPath;
	
	public exportHandler(final T _ulcPane) {
		ulcPane = _ulcPane;
		returnedMessage = new ProgressMsg();
	}
	
	public exportHandler(){
		ulcPane = null;
		returnedMessage = new ProgressMsg();
	}
	
	
	public static java.io.File transformTable2Excel(RTable _table, String _sheetName) {
		outputPath = formatPathWithEndSeparator("");
		outputName = getFileNameWithoutExt(_sheetName + "_export-" + System.nanoTime());
		if (_table == null){
			return exportedExcel;
		}
		fullPath =  outputPath + outputName + ".xls";

		// build tables of values from the table
		int x = _table.getColumnCount();
		int y = _table.getRowCount();

		try {

			String heads[] = new String[x];
			for (int i = 0; i < x; i++) {
				try {
					if (_table.getColumnName(i) == null) {
						heads[i] = "";
					} else {
						heads[i] = _table.getColumnModel().getColumn(i)
								.getHeaderValue().toString();
					}
				} catch (NullPointerException ex) {
					heads[i] = "";
				}
			}

			HSSFWorkbook wb = new HSSFWorkbook();
			FileOutputStream fileOut;
			HSSFSheet sheet = wb.createSheet(_sheetName);
			HSSFCellStyle cs = wb.createCellStyle();
			HSSFCellStyle csDate = wb.createCellStyle();
			cs.setWrapText(true);
			csDate.setDataFormat((short) 14);
			// make the titles row
			HSSFRow row = sheet.createRow((short) 0);
			for (int i = 0; i < heads.length; i++) {
				HSSFCell cell = row.createCell(i);
				cell.setCellValue(new HSSFRichTextString(heads[i].toString()));
			}
			// make the values cells
			for (int i = 0; i < y; i++) { // get every row
				HSSFRow r = sheet.createRow((short) i + 1);
				for (int j = 0; j < x; j++) { // get every column
					// we build each cell value
					HSSFCell cell;
					;
					Object o;

					o = _table.getValueAt(i, j);

					if (o instanceof String) {
						try {
							o = Double.parseDouble((String) o);
						} catch (NumberFormatException e) {
							// Nothing to do
						}
					}
					if (o instanceof Number) {
						cell = r.createCell(j, HSSFCell.CELL_TYPE_NUMERIC);
						cell.setCellValue(((Number) o).doubleValue());
						cell.setCellStyle(cs);
					} else if (o instanceof Date) {
						cell = r.createCell(j, HSSFCell.CELL_TYPE_NUMERIC);
						cell.setCellValue(((Date) o).toJavaDate());
						cell.setCellStyle(csDate);
					} else if (o instanceof java.util.Date) {
						cell = r.createCell(j, HSSFCell.CELL_TYPE_NUMERIC);
						cell.setCellValue((java.util.Date) o);
						cell.setCellStyle(csDate);
					} else {
						cell = r.createCell(j);
						cell.setCellValue(new HSSFRichTextString(o.toString()));
						cell.setCellStyle(cs);
					}
				}
			}
			for (short i = 0; i < x; i++) {
				sheet.autoSizeColumn(i, false);
			}
			fileOut = new FileOutputStream(fullPath);
			wb.write(fileOut);
			fileOut.close();
			exportedExcel = new java.io.File(fullPath);
			outputPath = exportedExcel.getAbsolutePath().substring(0, exportedExcel.getAbsolutePath().lastIndexOf(File.separator));
			Ivy.log().warn(outputPath);
		} catch (FileNotFoundException e) {
			Ivy.log().error("FileNotFoundException " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			Ivy.log().error("IOException " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			Ivy.log().error("Exception " + e.getMessage());
			e.printStackTrace();
		}
		return exportedExcel;
	}
	
	public ProgressMsg export(final File file) {
		returnedMessage.setType(ProgressMsg.INFORMATION_MESSAGE);
		returnedMessage.setText("");
				
		final FileChooserConfig fcConfig = new FileChooserConfig();
		fcConfig.setDialogTitle(Ivy.cms().co("/ch/ivyteam/xtrans/labels/messages/ChoosePlace"));
		fcConfig.setMultiSelectionEnabled(false); // We accept just one file at time
		fcConfig.addFileFilterConfig(new FileFilterConfig(new String[] {"xls"}, "*.xls")); // We accept just xls files
		fcConfig.setApproveButtonText("Export");
		fcConfig.setSelectedFile(file.getName().substring(0, file.getName().lastIndexOf("-")) + ".xls");
		
		try {
			ClientContext.storeFile(new IFileStoreHandler() {
				public void onFailure(int reason, String description) {
					String msg = "";
					switch (reason) {
					case CANCELLED:
						msg = "";
						break;
					case FAILED:
						msg = "The Download has failed. CAUSE: unknown";
						break;
					default:
						msg = "The Download has failed. CAUSE: unknown.";
						break;
					}
					if (exportedExcel.exists()){
						exportedExcel.delete();
					}
					if  (msg.trim().length() > 0)  {
						returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
            			returnedMessage.setText(msg);
            			RDCallbackMethodHandler.callRDMethod(ulcPane, "errorMethod", new Object[] {returnedMessage});
					}
				}

				public void prepareFile(OutputStream data) {
					try {
						formatServerPath(outputPath);
						File serverDir = new File(outputPath);
						if((serverDir.exists() && !serverDir.isDirectory()) || !serverDir.exists()){
							returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
		            		returnedMessage.setText("The directory supposed to contain the File to download doesn't exist. "+outputPath);
						}
						else {
							if(!file.exists()){
								returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
			            		returnedMessage.setText("The file you try to download doesn't exit.");
							}else{
								FileInputStream fis = new FileInputStream(file);
								byte b[] = new byte[1024]; 
			            		int c=0;
			            		while((c= fis.read(b)) != -1){
			            			data.write(b,0,c);
			            		}
			            		fis.close();
			            		
								returnedMessage.setType(ProgressMsg.SUCCESS_MESSAGE);
							}
						}
					} catch (IOException ioe) {
						returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
	            		returnedMessage.setText(ioe.getMessage());
	            		RDCallbackMethodHandler.callRDMethod(ulcPane, "errorMethod", new Object[] {returnedMessage});
					}
				}

				public void onSuccess(String filePath, String fileName) {
					exportedExcel.delete();
					returnedMessage.setType(ProgressMsg.SUCCESS_MESSAGE);
					returnedMessage.setText("<html>Congratulations! Export Successfull to " + filePath + "</html>");
					RDCallbackMethodHandler.callRDMethod(ulcPane, "exportSuccess", new Object[] {returnedMessage});
				}
			}, fcConfig, ulcPane);
		} catch (Exception e) {
			returnedMessage.setType(ProgressMsg.ERROR_MESSAGE);
    		returnedMessage.setText(e.getMessage());
    		RDCallbackMethodHandler.callRDMethod(ulcPane, "errorMethod", new Object[] {returnedMessage});
		}
		return returnedMessage;
	}
	
	/**
	 * @author Emmanuel Comba <br>
	 * Formats a given path in a path with the right system File.separator characters<br>
	 * It checks if there is a File.separator at the end of the path. If not it adds one.<br>
	 * It checks if the directory exists, if not it makes it.
	 * @param path
	 * @return formatted path with the system File.separator
	 */
	private static String formatPathWithEndSeparator(String path)
	{
		if(path != null && !path.equals(""))
		{
//			path = path.replaceAll("\\\\", File.separator);
			path = org.apache.commons.lang.StringUtils.replace(path,"\\", File.separator);
			//path = path.replaceAll("/", File.separator);
			path = org.apache.commons.lang.StringUtils.replace(path,"/", File.separator);
			File serverDir = new File(path);
			if((serverDir.exists() && !serverDir.isDirectory()) || !serverDir.exists())
				serverDir.mkdirs();
			if(path.lastIndexOf(File.separator) != path.length() - 1) 
				path=path+java.io.File.separator;
		}
		return path;
	}
	
	/**
	 * @author Emmanuel Comba <br>
	 * return the file name without the file extension
	 * @param fileName the string filename 
	 * @return file name without the file extension
	 */
	private static String getFileNameWithoutExt(String fileName){
		String s="";
		if(fileName.lastIndexOf(".")>0)
			s = fileName.substring(0,fileName.lastIndexOf("."));
		else s=fileName;
		return s;
	}
	
	/**
	 * format a path parameter, so that it will contains the right File.separator
	 * @param path: the string to format
	 * @return String: returnedPath
	 */
	private String formatServerPath(String path){
		String returnedPath = path;
		if(path!=null && !path.equals("")){
			returnedPath= returnedPath.replace("\\",java.io.File.separator);
			returnedPath= returnedPath.replace("/",java.io.File.separator);
		}
		return returnedPath;
	}
}
