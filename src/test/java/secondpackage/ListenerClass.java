package secondpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The name of the successful test case is: " + result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The name of the starting test case is: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The name of the failed test case is: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The name of the skipped test case is: " + result.getName());
    }
}
