package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DataProviderDemo {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(dataProvider = "dp") // for the connection of data provider
	public void testLogin(String username, String password) throws InterruptedException { // data is coming from DataProvider
		driver.get("https://demo.opencart.com/admin/index.php");

		WebElement userField = driver.findElement(By.xpath("//input[@id='input-username']"));
		userField.clear();
		userField.sendKeys(username);
		WebElement pwdField = driver.findElement(By.xpath("//input[@id='input-password']"));
		pwdField.clear();
		pwdField.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(500);
		loginBtn.click();
		
		boolean status = driver.findElement(By.id("nav-profile")).isDisplayed();
		if (status) {
			driver.quit();
			Assert.assertTrue(status);
		} else {
			Assert.fail();
		}
		
	}

	@AfterClass
	public void tearDown() {
		
	}

	@DataProvider(name = "dp", indices = {0, 4}) //giving the position index of Object data given below //indices defines the specific row
	Object[][] loginData() {

		Object data[][] = { 
				{ "abc@gamil.com", "test123" }, 
				{ "seemac@gamil.com", "test@d" },
				{ "john12@gamil.com", "Abcd" },
				{ "pratibha13@gamil.com", "Prat123" },
				{"demo", "demo"}
		};

		return data;
	}

}
