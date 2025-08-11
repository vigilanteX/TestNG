package org.example.P10Listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " is success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " is failing" );
    }

}
