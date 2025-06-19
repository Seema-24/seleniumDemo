package tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fleekitsolutions.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		
		/* Mouse Hover */
		WebElement about = driver.findElement(By.xpath("//a[normalize-space()='ABOUT']"));
		WebElement fleekITSol = driver.findElement(By.xpath("//a[normalize-space()='Why Fleek IT Solutions?']"));
		
		act.moveToElement(about).moveToElement(fleekITSol).click();
		act.build();    //create an action 
		act.perform();	//complete an action	but in new version of selenium only perform() work for create and complete

		
		/*Right click Actions*/
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		act.contextClick(rightClickBtn).perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		
		//Another way to store the actions and perfrom actions later Actions vs Action
		
	}

}
