package ListofTestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test case has failed and the test case name is"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test case has been skipped and the test case name is"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The test case has failed within 5% and the test case name is"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The test case has started and the test case name is"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The test case has finished and the test case name is"+context.getName());
		
	}

}
