package basicTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
/*
		// Normal Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		System.out.println("Normal Alert passed");
		Thread.sleep(5000);

		// Confirmation Alert
		WebElement jsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));

		jsAlert.click();
		driver.switchTo().alert().dismiss();
		System.out.println("Confirmation alert - dismiss");
		Thread.sleep(5000);

		jsAlert.click();
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert Text " + text);
		driver.switchTo().alert().accept();
		System.out.println("Confirmation alert - accept");
		Thread.sleep(5000);

		// Prompt alert input box
		WebElement jsPrompt = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));

		jsPrompt.click();
		driver.switchTo().alert().sendKeys("My Prompt");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("Prompt alert - accept");
		Thread.sleep(5000);

		jsPrompt.click();
		driver.switchTo().alert().dismiss();
		System.out.println("Prompt alert - dismiss");
*/
		
		// Another way to handle the alert without using switch command
		// Explicit wait

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		org.openqa.selenium.Alert alert = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
		
		String username = "admin";
		String password = "admin"; 
		//Authentication handled // syntax - http://username:password@url
		driver.get("https://"+ username +":"+ password + "@"+ "the-internet.herokuapp.com/basic_auth"); //injected the admin and password in the url

	}

}
