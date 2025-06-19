package basicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		// get list of links and image

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		//print the links
		for (WebElement ele : links) {
			System.out.print(ele.getText()+",");
		}
		System.out.println();
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		

	}

}
