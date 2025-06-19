package basicTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class DynamicPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String username = "demo";
		String pwd = "demo";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement userField = driver.findElement(By.xpath("//input[@id='input-username']"));
		userField.clear();
		userField.sendKeys(username);
		WebElement pwdField = driver.findElement(By.xpath("//input[@id='input-password']"));
		pwdField.clear();
		pwdField.sendKeys(pwd);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(1000);
		loginBtn.click();
		
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//li[@id='nav-profile']//span")).isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Login Successfully...");
		} else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String pages = driver.findElement(By.xpath("//div[contains(@class,'text-end') and contains(text(), 'Showing')]")).getText();
		
		int totalPage = Integer.parseInt(pages.substring(pages.indexOf("(")+1, pages.indexOf("Pages")-1));
		System.out.println(totalPage);
		for (int i = 1; i <= 10; i++) {
			if(i>1) {
				WebElement nextPage = driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='"+i+"']"));
				js.executeScript("arguments[0].click();", nextPage);
			} 
			
			int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			for (int j = 1; j <= noOfRows ; j++) {
				
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+j+"]/td[3]")).getText();
				System.out.println(email);
			}
			Thread.sleep(2000);
		}
	}

}
