package basicTest;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Navigation {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://develop.bookings.vacayou.com/co-test-13/2013");
		
		URL myurl = new URL("https://develop.bookings.vacayou.com/co-test-13/90"); 

	}

}
