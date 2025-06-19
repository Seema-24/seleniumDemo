package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
	
		//Broken link is a link which doesnpot have resource in the server which return the STATUS CODE more  than 400
		//Link href="https://www.xyz.com"
		//Status code>= 400 broken link 
		//Status code <400 not broken link
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total No of Links available = " + links.size());
		
		for (WebElement link : links) {
			String hrefVal = link.getAttribute("href");

			if (hrefVal == null || hrefVal.isEmpty()) {
			System.err.println("Link is null and empty");
				continue;  //skip the further process if null value
			}
			
			//hit the URL to server
			try {
				
				URL linkUrl = new URL(hrefVal); // convert href value from String to URL format
				HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection(); // open connection to the server
				conn.connect(); // connect to the server and sent the request to server
				
				
				if(conn.getResponseCode() >= 400) {
					System.err.println("Broken Link = "+ hrefVal);
					
				} else {
					System.out.println("Link not broken = "+ hrefVal + " with response Code: "+ conn.getResponseCode());
				}
				
			} catch (Exception e) {
				System.out.println("Got Exception => " +e);
			}
			
			
		}
		
	}

}
