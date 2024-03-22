package test;

import quangdoan.driver.Driver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Driver.init();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        Driver.quit();
    }
}
