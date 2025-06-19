package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependMethod {
	
	  @Test(priority = 1)
	  public void open() {
		  
		 System.out.println("Open app");
		 Assert.assertTrue(true);
	  }
	  
	  @Test(priority = 2, dependsOnMethods = "open")
	  public void login() {
		  
			 Assert.assertTrue(false);
			 System.out.println("Login successfully..");
	  }
	  
	  @Test(priority = 3, dependsOnMethods=  {"login", "open"})
	  public void search() {
		  
			 Assert.assertTrue(true);
			 System.out.println("Search ");
	  }
	  
	  @Test(priority = 4, dependsOnMethods = {"search"})
	  public void advanceSearch() {
		  
			 Assert.assertTrue(true);
			 System.out.println("Advance Search ");
	  }
	  
	  @Test(priority = 5, dependsOnMethods = {"login"})
	  public void logout() {
		  
			 Assert.assertTrue(true);
			 System.out.println("Logout ");
	  }
}
