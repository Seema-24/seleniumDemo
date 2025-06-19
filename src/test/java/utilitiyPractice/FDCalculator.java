package utilitiyPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.findElement(By.id("wzrk-cancel")).click();
		String filePath = System.getProperty("user.dir") + "\\testData\\FdCalci.xlsx";
		String sheetName = "Sheet1";
		
		int rows = ExcelUtils.getRowCount(filePath, sheetName);
		for (int r = 1; r <= rows; r++) {
			
			//read data from Excel file
			String principle = ExcelUtils.getCellData(filePath, sheetName, r, 0);
			String rateOfInterest = ExcelUtils.getCellData(filePath, sheetName, r, 1);
			String period1 = ExcelUtils.getCellData(filePath, sheetName, r, 2);
			String period2 = ExcelUtils.getCellData(filePath, sheetName, r, 3);
			String freq = ExcelUtils.getCellData(filePath, sheetName, r, 4);
			String expMaturity = ExcelUtils.getCellData(filePath, sheetName, r, 5);
			
			//Pass the data into application 
			driver.findElement(By.id("principal")).sendKeys(principle);
			driver.findElement(By.id("interest")).sendKeys(rateOfInterest);
			driver.findElement(By.id("tenure")).sendKeys(period1);
			Select tanureDrp = new Select(driver.findElement(By.id("tenurePeriod")));
			tanureDrp.selectByVisibleText(period2);
			Select freqDrp = new Select(driver.findElement(By.id("frequency")));
			freqDrp.selectByVisibleText(freq);	
			driver.findElement(By.xpath("//img[contains(@src,\"btn_calcutate\")]")).click(); //Calculate Button
			
			 String actMaturity = driver.findElement(By.id("resp_matval")).getText();
			
			//Validation 
			if(Double.parseDouble(actMaturity) == Double.parseDouble(expMaturity)) {
				ExcelUtils.setCellData(filePath, sheetName, r, 7, "PASS");
				ExcelUtils.fillCellColor(filePath, sheetName, r, 7, "green");
				System.out.println("Test passed");
			} else {
				ExcelUtils.setCellData(filePath, sheetName, r, 7, "FAILED");
				ExcelUtils.fillCellColor(filePath, sheetName, r, 7, "RED");
				System.out.println("Test failed");
			}
			
			driver.findElement(By.xpath("//img[contains(@src,\"btn_clear\")]")).click(); //Clear Button
		}
		
		
		driver.close();
	}

}

