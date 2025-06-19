package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*Drag and Drop */
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement DebtAcc = driver.findElement(By.id("shoppingCart1"));
		
		
		WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'][normalize-space()='5000'])[1]"));
		WebElement DebtAmt = driver.findElement(By.xpath("(//div[@id=\"shoppingCart4\"])[1]"));
		WebElement credAmt = driver.findElement(By.xpath("(//div[@id=\"shoppingCart4\"])[2]"));
		
		WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement credAcc = driver.findElement(By.id("shoppingCart3"));		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(bank, DebtAcc).perform();
		act.dragAndDrop(amount, DebtAmt).perform();
		act.dragAndDrop(sales, credAcc).perform();
		act.dragAndDrop(amount, credAmt).perform();
		
		
		/* Slider actions by using Drag and DropBy*/
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement sliderMin = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Before slider min range "+sliderMin.getLocation()); // (59, 293)

		act.dragAndDropBy(sliderMin, 100, 0).perform();
		System.out.println("After slider min range"+sliderMin.getLocation()); 
		
		WebElement sliderMax = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("Before slider max Range "+sliderMax.getLocation()); // (59, 293)

		act.dragAndDropBy(sliderMax, -50, 0).perform();
		System.out.println("After slider max Range "+sliderMax.getLocation()); 
	}
}
