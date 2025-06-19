package testng;

import org.testng.annotations.Test;

public class grouping {

	@Test(groups = "sanity")
	public void loginByFacebook() {

		System.out.println("Login facebook");
	}

	@Test(groups = "sanity")
	public void loginByTwitter() {

		System.out.println("Login twitter");
	}

	@Test(groups = "sanity")
	public void loginByEmail() {

		System.out.println("Login email");
	}

	@Test(groups = "regression")
	public void SignupByFacebook() {

		System.out.println("Signup facebook");
	}

	@Test(groups = "regression")
	public void signupByTwitter() {

		System.out.println("Signup twitter");
	}

	@Test(groups = "regression")
	public void signupByEmail() {

		System.out.println("Signup email");
	}

	@Test(groups = {"sanity", "regression"})
	public void PaymentForFacebook() {

		System.out.println("Payment for facebook");
	}
	
	@Test(groups = {"sanity", "regression"})
	  public void paymentForTwitter() {
		  
		  System.out.println("Payment for twitter");
	  }
	
	@Test(groups = {"sanity", "regression"})
	  public void paymentForEmail() {
		  
		  System.out.println("Payment for email");
	  }
}
