package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By username = By.xpath("//input[@placeholder='Username']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginBtn = By.xpath("//button[normalize-space()='Login']");
	By profilePic = By.xpath("//img[@alt='profile picture']");

	// Action Methods
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}

	public void verifyProfilePic() {
		boolean status = driver.findElement(profilePic).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("POM without PAGE FACTORY...");
	}

}
