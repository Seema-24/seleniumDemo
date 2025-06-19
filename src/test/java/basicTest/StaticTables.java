package basicTest;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int val = driver.findElements(By.tagName("tr")).size(); // find all the tagname from all the table 
		System.out.println("Shows for All the tables \n"+ val);
		int val2 = driver.findElements(By.tagName("th")).size(); //not for specific table
		System.out.println(val2);
		
		//find the exact row and column size
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Shows for particular table sizes ");
		System.out.println(rows);
		System.out.println(column);

		
		//Read Particular data of specific row and column
		String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[1]")).getText();
		System.out.println(data);
		
		for (int r = 1; r <= rows; r++) {
			for (int c = 1; c <= column; c++) {
				// only print for table header so cond given for it
				if(r==1) {
					String header = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/th["+c+"]")).getText();
					System.out.print(header +"\t      ");
				} else {
					String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
					System.out.print(value +"\t      ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("================================================");
		
		int total = 0;
		for (int r = 2; r <= rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(authorName.contains("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName + " written by "+ authorName);
			}
			
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
		
			total += Integer.parseInt(price);
		}
		
		System.out.println("Total price "+ total);
		
	}

}
