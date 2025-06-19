package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		String file1 = "C:\\Users\\Fleek\\Downloads\\Text1.txt";
		String file2 = "C:\\Users\\Fleek\\Downloads\\Text2.txt";

		/* single file upload */

		driver.findElement(By.id("filesToUpload")).sendKeys(file1);
		String fileName = driver.findElement(By.id("fileList")).getText();

		if (fileName.equals(file1)) {
			System.out.println("Successfully File uploaded");
		} else {
			System.out.println(" File uploaded failed ");
		}

		/* Multiple file uploaded */
		driver.findElement(By.id("filesToUpload")).sendKeys(file1 + "\n" + file2);
		int noOfFile = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

		if (noOfFile == 2) {
			System.out.println("All files are uploaded ");
		} else {
			System.out.println(" files are not uploaded ");
		}
	}

}
