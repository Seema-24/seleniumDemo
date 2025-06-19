package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage2 {

	WebDriver driver;

	// Constructor
	public LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginBtn;
	@FindBy(how = How.XPATH, using = "//img[@alt='profile picture']") // Another approach to locate the elements
	WebElement profilePic;

	// Action Methods
	public void enterUsername(String user) {
		username.sendKeys(user);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void verifyProfilePic() {
		boolean status = profilePic.isDisplayed();
		Assert.assertTrue(status);
		
		System.out.println("POM with PAGE FACTORY...");
	}

}
