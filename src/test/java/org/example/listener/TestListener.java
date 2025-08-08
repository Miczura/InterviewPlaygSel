package org.example.listener;

import org.example.driver.DriverManager;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener  implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShot.takeScreenshot(DriverManager.getWebDriver(),result.getName());
    }
}
