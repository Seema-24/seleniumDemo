package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	// read data from Excel
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("dataFile");
		
		int NoOfRows = sheet.getLastRowNum();
		
		short cells = sheet.getRow(1).getLastCellNum();
		System.out.println("No of Rows = "+ NoOfRows);
		System.out.println("No of cells = "+ cells);
		
		
		for (int i = 0; i <= NoOfRows; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < cells; j++) {
				XSSFCell cell = row.getCell(j);
				
				System.out.print(cell.toString() +"\t");
			}
			System.out.println();
		}
		
		wb.close();
		file.close();
		
	}

}
