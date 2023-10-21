package TestNGPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomeListener extends BaseTest implements ITestListener{
  @Override
	public void onTestStart(ITestResult result) {
	Reporter.log("Test Stareted", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	Reporter.log("Test Exceuted sucessfully", true);	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	String failedMethod = result.getMethod().getMethodName();
	Reporter.log("this Method failed taken screenshot :"+failedMethod, true);
	failedMethod(failedMethod);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	Reporter.log("Test Skipped", true);	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Actual Test Started", true);	
	}

	@Override
	public void onFinish(ITestContext context) {
	Reporter.log("Test finished", true);	
	}


}
