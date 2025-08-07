package org.example.tests;

import org.example.driver.DriverManager;
import org.example.driver.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.example.navigation.ApplicationUrl.APPLICATION_URL;

public class TestBase {
    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);

    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        DriverManager.disposeDriver();
    }
}
