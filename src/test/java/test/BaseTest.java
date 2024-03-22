package test;

import quangdoan.driver.Driver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Driver.init();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        Driver.quit();
    }
}
