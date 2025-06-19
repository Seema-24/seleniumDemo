package basicTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);

		
		  driver.get("https://text-compare.com/");
		  driver.findElement(By.id("inputText1")).
		  sendKeys("My Name is Seema. I'm Automating the script");
		  
		  //Ctrl + A, Ctrl+C, Tab, Ctrl+V
		  
		  act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		  
		  act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		  
		  act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		  
		  act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		 

		
		/* Control + Register Link */
		
		/*
		 * driver.get("https://demo.nopcommerce.com/"); WebElement registerLink =
		 * driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		 * 
		 * act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();
		 * 
		 * // switching to other window Set<String> win = driver.getWindowHandles(); for
		 * (String window : win) { driver.switchTo().window(window); //if there is more
		 * window so difficult to switch others } // List<String> ids = new
		 * ArrayList<String>(win); // we have use the List to get the index value so
		 * convert into List collection // driver.switchTo().window(ids.get(1)); //
		 * handle switch to window by get index value
		 */
		
		
		/* Two url/windows handles by New window Selenium 4.x version */

		/*
		 * driver.get("https://www.facebook.com/"); //
		 * driver.switchTo().newWindow(WindowType.TAB); //For open new Tab in same //
		 * window driver.switchTo().newWindow(WindowType.WINDOW); // For open new Window
		 * 
		 * driver.get("https://www.google.com/");
		 */
	}

}
