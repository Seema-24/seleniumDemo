package utilitities;

import java.awt.image.IndexColorModel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String cellData;
	public static CellStyle style;
	 
	
	public static int getRowCount(String xlFile, String xlSheet) throws IOException {
		
		fis = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(xlSheet);
		int rowCount = sheet.getLastRowNum();	
		wb.close();
		fis.close();
		
		return rowCount;
		
	}
	
	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException {
		fis = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fis);
		sheet= wb.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fis.close();
		
		return cellCount;
		
	}
	
	public static String getCellData(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException {
		fis = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		try {
			//cellData = cell.toString();
			DataFormatter format = new DataFormatter();
			cellData = format.formatCellValue(cell); //Return the formateed value of cell as a string regarding
			
		} catch (Exception e) {
			cellData = "";
		}
		
		wb.close();
		fis.close();

		return cellData;
		
	}
	
	public static void CreateFileAndSetCellData(String xlFile, String xlSheet, int rowNum, int colNum, String data) throws IOException {

		wb = new XSSFWorkbook();
		sheet = wb.createSheet(xlSheet);
		row = sheet.createRow(rowNum);
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		
		fos = new FileOutputStream(xlFile);
		wb.write(fos);
		wb.close();
		fos.close();
		
	}
	
	public static void setCellData(String xlFile, String xlSheet, int rowNum, int colNum, String data) throws IOException {
		// already created File need to create cell & set the cell value 
		fis = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		fos = new FileOutputStream(xlFile);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
		
	}
	
	public static void fillCellColor(String xlFile, String xlSheet, int rowNum, int colNum, String color) throws IOException {
		fis = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(xlSheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		
		style = wb.createCellStyle();
		
		if(color.equalsIgnoreCase("GREEN")) {
			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		} else if(color.equalsIgnoreCase("RED")) {
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
		} else {
			System.out.println("Bydefault Cell filled with color Yellow");
			style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		}
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);

		fos = new FileOutputStream(xlFile);
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
	}
	
	
	
	
}
