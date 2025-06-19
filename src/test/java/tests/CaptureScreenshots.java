package tests;

import java.io.File;

import org.apache.commons.io.CopyUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		String path = System.getProperty("user.dir") + "\\screenshots\\fullPage.png";
		
		/*
		 * File srcFile = ts.getScreenshotAs(OutputType.FILE); File destFile = new
		 * File(path); //own path where save the file with full path and name of the
		 * screenshots
		 * 
		 * srcFile.renameTo(destFile);
		 */
		
		WebElement feature = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File source = feature.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		source.renameTo(dest);
		
	}

}
