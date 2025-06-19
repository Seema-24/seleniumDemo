package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String word = "Selenium";

		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys(word);
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"] "));
		System.out.println(list.size());
		for (WebElement elemt : list) {
			System.out.println(elemt.getText());
		}

	}

}
