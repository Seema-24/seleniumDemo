package basicTest;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleBowser {

	public static void main(String[] args) {
		
		String word = "Selenium";
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(word);
		 driver.findElement(By.className("wikipedia-search-button")).click();
		 
		 List<WebElement> results = driver.findElements(By.id("wikipedia-search-result-link"));
		 
		for (WebElement result : results) {
			System.out.print(result.getText()+",");
			result.click();
			
		}
		Set<String> window = driver.getWindowHandles();
		
		
		//Approach 2 
		
		 List<String> windowList = new ArrayList(window);
		
		String parent = windowList.get(0);
		String child = windowList.get(1);
		System.err.println(parent);
		System.err.println(child);
		

	}

}
