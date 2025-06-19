package basicTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		/*
		 * driver.get("https://testautomationpractice.blogspot.com/");
		 * WebElement nameInbox = driver.findElement(By.id("name")); 
		 * WebElement radioBtn = driver.findElement(By.xpath("//input[@id='male']"));
		 * 
		 * js.executeScript("arguments[0].setAttribute('value','John');", nameInbox);  //alternate of sendKeys
		 * 
		 * js.executeScript("arguments[0].click();", radioBtn); //alternate of click when get ElementInterceptedException got
		 */

		driver.get("https://demo.nopcommerce.com/");
		/* Scroll Bar Handling */	
		/*
		 * js.executeScript("window.scrollBy(0,2300);"); //by using Pixel number
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 * 
		 * Thread.sleep(4000); WebElement prod =
		 * driver.findElement(By.xpath("//strong[normalize-space()='Featured products']"
		 * )); js.executeScript("arguments[0].scrollIntoView();", prod); //till element
		 * is visible
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 * 
		 * Thread.sleep(4000);
		 * js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 * 
		 * Thread.sleep(4000);
		 * js.executeScript("window.scrollBy(0, -document.body.scrollHeight);");
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 * 
		 * driver.close();
		 */
		
		/* Zoom Level JS executor */
		
		driver.manage().window().minimize();
		Thread.sleep(4000);
		js.executeScript("document.body.style.zoom='50%';");
		Thread.sleep(4000);
		js.executeScript("document.body.style.zoom='80%';");
	}

}
