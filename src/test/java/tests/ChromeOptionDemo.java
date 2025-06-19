package tests;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		// Headless Testing or test run in headless mode
		/*
		 * options.addArguments("--headless=new"); WebDriver driver = new
		 * ChromeDriver(options);// if we not pass the options then it will run on
		 * headed mode driver.get("https://demo.nopcommerce.com/");
		 * System.out.println("Test case runing");
		 */

		// SSL handling
		/*
		 * options.setAcceptInsecureCerts(false); WebDriver driver = new
		 * ChromeDriver(options); driver.get("https://ignou.ac.in/"); //
		 * https://expired.badssl.com/ System.out.println("Title of the page " +
		 * driver.getTitle()); // Privacy Error
		 */

		// Remove "chrome is being controlled by Automated test software"
		/*
		 * options.setExperimentalOption("excludeSwitches", new String[]
		 * {"enable-automation"}); new ChromeDriver(options);
		 */

		// Run the tests in Incongnito mode
		/*
		 * options.addArguments("--incognito"); ChromeDriver driver = new
		 * ChromeDriver(options); driver.get("https://demo.nopcommerce.com/");
		 */

		// Handling to enable plugin/extensions in browser and remove ads
		// Step1: Add CRX extractor /downloader to chromebrowser manually
		// Step2: Add any plugin like selector hub or ads blocker
		// Step3: Capture CRX file for added plugin/extension
		// Step4: pass crx file path in automation script in chrome option

		String selectorHubPath = "C:\\Users\\Fleek\\eclipse-workspace\\seleniumwebdriver\\src\\test\\resources\\SelectorsHub.crx";
		String adsBlockPath = "C:\\Users\\Fleek\\eclipse-workspace\\seleniumwebdriver\\src\\test\\resources\\uBlock.crx";

		File file = new File(adsBlockPath);
		options.addExtensions(file);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");

	}

}
