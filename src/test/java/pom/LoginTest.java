package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver; 
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin() throws InterruptedException {
		//LoginPage lp = new LoginPage(driver);  // POM without PageFactory
		LoginPage2 lp = new LoginPage2(driver);   // POM with PAGE FACTORY
		
		Thread.sleep(1000);
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginBtn();
		lp.verifyProfilePic();
		Thread.sleep(1000);
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
