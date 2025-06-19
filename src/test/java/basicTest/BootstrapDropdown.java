package basicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();
		
		//select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the option and find out the size and text
		
		List<WebElement> lists = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect-container\")]//label[@class=\"checkbox\"]"));
		
		System.out.println("Size of List "+lists.size());
		
		for (WebElement opt : lists) {
			System.out.println(opt.getText());
		}
		
		
	}
}
