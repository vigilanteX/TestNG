package org.example.P9Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryer implements IRetryAnalyzer {
    int count = 0;
    int maxCount = 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (count < maxCount) {
            count++;
            return true;
        }
        return false;
    }
}
