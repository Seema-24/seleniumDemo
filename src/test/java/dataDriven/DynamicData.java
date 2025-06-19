package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicData {

	public static void main(String[] args) throws IOException {
		// Dynamic Data enter
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testData\\dynmic.xlsx");
		Scanner sc = new Scanner(System.in);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("dyndata");
		
		System.out.println("Enter the no. of Rows : ");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter the no. of Cells: ");
		int noOfCells = sc.nextInt();
		
		for (int r = 0; r <= noOfRows; r++) {
			XSSFRow row = sheet.createRow(r);
			System.out.println("enter data for row "+ r);
			for (int c = 0; c < noOfCells; c++) {
				XSSFCell cell = row.createCell(c);
				String data = sc.next();
				cell.setCellValue(data);
			}
			
		}
		wb.write(file);
		wb.close();
		file.close();
		
		System.out.println("Data entered succesfully ");
	}

}
