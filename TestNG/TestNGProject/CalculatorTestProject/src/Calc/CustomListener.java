package Calc;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Required implementation for handling cases where the test fails but within the success percentage
        System.out.println("Test Failed but within success percentage: " + result.getName());
    }

    
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());
    }

    
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished: " + context.getName());
    }
}
