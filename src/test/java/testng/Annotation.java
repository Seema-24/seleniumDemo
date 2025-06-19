package testng;

import org.testng.annotations.*;

public class Annotation {


	@BeforeSuite
	void bs() {
		System.out.println("befor suite");
	}
	
	@AfterSuite 
	void as() {
		System.out.println("after suite");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("before Test");
	}
	
	@AfterTest 
	void at() {
		System.out.println("after Test");
	}
	
	@BeforeClass
	void bc() {
		System.out.println("before class");
	}
	
	@AfterClass 
	void ac() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("befor method");
	}
	
	@AfterMethod 
	void am() {
		System.out.println("after method");
	}
	
	@Test
	void tc1() {
		System.out.println("Test case 1");
	}
	
	@Test 
	void tc2() {
		System.out.println("Testcase 2");
	}
}
