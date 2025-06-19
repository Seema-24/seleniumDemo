package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	//user defined method 1
	static void selectFutureDate(WebDriver driver, String year,  String month, String date) {
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		
		List<WebElement> currentDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler=\"selectDay\"]/a"));
		 
		 for (WebElement dt : currentDate) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
	
	static void selectPastDate(WebDriver driver, String year,  String month, String date) {
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
		}
		
		List<WebElement> currentDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler=\"selectDay\"]/a"));
		 
		 for (WebElement dt : currentDate) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}


	public static void main(String[] args) {

		String date = "24";
		String month = "April";
		String year = "2027";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
//		// Method 1 Direct send Keys used
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/05/2025");
		
		//Method 2
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
		//selectFutureDate(driver, year,  month, date);
		selectPastDate(driver, "2020", "July", "12");
	}

}
