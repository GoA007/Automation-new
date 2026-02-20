package com.automation.base;

import com.automation.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        if (!Boolean.parseBoolean(System.getProperty("runUi", "false"))) {
            throw new SkipException("UI tests are skipped by default. Use -DrunUi=true to execute browser tests.");
        }
        driver = DriverFactory.createChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
