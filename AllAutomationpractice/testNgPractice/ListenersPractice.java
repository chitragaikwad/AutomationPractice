package testNgPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersPractice implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test case is started");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is run succesfully");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Tes case is skipped");	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test case time out");	
	}

}
