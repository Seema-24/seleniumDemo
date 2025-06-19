package basicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.cssSelector("input[name='mytext1']"))
		.sendKeys("WElcome");
		
		driver.switchTo().defaultContent(); //first come back to orignal page then going to next frame
		//directly can't switch the one frame to another frame
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Second frame welcom");
		driver.switchTo().frame(0);
		WebElement radioBtn = driver.findElement(By.xpath("(//div[@class='rseUEf nQOrEb'])[1]")); // not clickable directly then use javascriptexecutor
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", radioBtn);
		driver.switchTo().defaultContent();
	}
}
