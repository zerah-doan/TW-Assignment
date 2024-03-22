package test;

import quangdoan.driver.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateWalletTest extends BaseTest {

    @Test(description = "Sample description")
    public void sampleTest() {
        Driver.get().findElement(By.xpath("//android.view.View[@text='Create new wallet']"));
    }

}
