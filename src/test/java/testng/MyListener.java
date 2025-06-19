package testng;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyListener extends TestListenerAdapter {

	public void onStart(ITestContext context) {
		System.out.println("Test execution is started..."); // only one time start trigger
	}

	public void onTestStart(ITestResult result) {  //every time trigger of each tests execution
		System.out.println("Test started...");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution is finished.."); //only one time trigger at the end
	}
}
