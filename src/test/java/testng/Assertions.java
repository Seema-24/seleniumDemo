package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class Assertions {
	
  @Test
  public void HardAssertion() {
	  System.out.println("Testing 1");
	  System.out.println("Testing 2");
	  Assert.assertEquals(1,2);
	  System.out.println("Testing 3");
	  System.out.println("Testing 4");
  }
  
  @Test
  public void SoftAssertion() {
	  System.out.println("Testing 1");
	  System.out.println("Testing 2");
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(true, false);
	  
	  System.out.println("Testing 3");
	  System.out.println("Testing 4");
	  
	  sa.assertAll(); //mandatory to add this method otherwise error will not show
  }

}
