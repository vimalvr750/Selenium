package listeners;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestNGlisteners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("***** Test Started: " + result.getName() );
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("***** Test is successful: " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("***** Test Failed: " + result.getName() );
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("***** Test skipped: " + result.getName());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("***** Test Completed: " + context.getName());
	}

}
