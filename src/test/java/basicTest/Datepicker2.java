package basicTest;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker2 {
	
	//user defined method for converting month from string --> month
	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("January", Month.JANUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
			
		if(vmonth == null) {
			System.out.println("Invalid Month...");
		}
				
		return vmonth;
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.cssSelector("input[name=\"SelectedDate\"]")).click();
		
		//Select Year
	    WebElement yearDropdown = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		Select selectYear = new Select(yearDropdown);
		selectYear.selectByVisibleText("2018");
		
		//Select Month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		Select selectMonth = new Select(monthDropdown);
		selectMonth.selectByValue("10");
		
		 List<WebElement> DateList = driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
		
		for (WebElement dates : DateList) {
			if (dates.getText().equals("28")) {
				dates.click();
			} 
		}
		
		
		
		
		
		// PRactice of Dates if Dropdown not available and want to compare past, present and future month so user defined function created
		String actMonth = "August";
		String expMonth = "January";
		// use for not purposely in this application// knowledge purpose
		Month actMonthConvert = convertMonth(actMonth);
		Month expMonthConvert = convertMonth(expMonth);
		System.out.println(actMonthConvert);
		
		int result = expMonthConvert.compareTo(actMonthConvert);
		
		System.out.println(result);
	}

}
