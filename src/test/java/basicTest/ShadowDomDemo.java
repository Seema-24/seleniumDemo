package basicTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomDemo {

	public static void main(String[] args) throws InterruptedException {
		// shadow dom  shadow root shadow root elements
		//This Element is inside single shadow DOM.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		//Shadow Element 
		String cssSelectorForHost01 = "#shadow-root";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#shadow-element"));
		
		//Nested Shadow ELement
		//This Element is inside 2 nested shadow DOM.
		String cssSelectorForHost_1 = "#shadow-root";
		String cssSelectorForHost_2 = "#inner-shadow-dom";
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#nested-shadow-element"));
		
		//Multi nested shadow elements
		//This Element is inside 3 nested shadow DOM.
		String cssSelectorForHost1 = "#shadow-root";
		String cssSelectorForHost2 = "#inner-shadow-dom";
		String cssSelectorForHost3 = "#nested-shadow-dom";
		Thread.sleep(1000);
		SearchContext shadow_0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow_1 = shadow_0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2 = shadow_1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));
		
		
		
		
	}

}
