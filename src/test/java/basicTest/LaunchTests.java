package basicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromiumDriver driver = new ChromeDriver();
		ChromiumDriver  drivere = new EdgeDriver();
		driver.quit();
	}

}
