package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter reporter; // UI of the report - dark/light theme
	public ExtentReports extent; // populate common info on the report - testername, browser name, oS name,
									// module name, env detail
	public ExtentTest test; // crating testcase enteries inthe report and update status of the test method -
							// pass fail, skip, attach screenshot, test detail etc

	public void onStart(ITestContext context) {
		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html"); // specific
																										// report name
		reporter.config().setDocumentTitle("Automation Report"); // Title of the report
		reporter.config().setReportName("Functional Testing"); // name of the report
		reporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(reporter);

		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Seema");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Browser Name", "Chrome");

	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); // create new entry in the the report
		test.log(Status.PASS, "Test case passed is " + result.getName()); // status update pass fail skip
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed is " + result.getName());
		test.log(Status.FAIL, "Test case Failed caused by " + result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is " + result.getName());

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
