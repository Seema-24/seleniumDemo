package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\myFile.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("mySheet");
		
		XSSFRow row1 = sheet.createRow(0);
		
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(98789);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3555);
		row2.createCell(2).setCellValue("Pytest");
		
		XSSFRow row3 = sheet.createRow(2);
		
		row3.createCell(0).setCellValue("Java");
		row3.createCell(1).setCellValue(98789);
		row3.createCell(2).setCellValue("Automation");
		
		wb.write(file);
		wb.close();
		file.close();
		
		System.out.println("File is created...");
		
	}

}
