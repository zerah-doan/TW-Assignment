package test;

import org.testng.Assert;
import page.CreateWalletFacade;
import page.HomePage;
import org.testng.annotations.Test;

public class Create1stWalletTest extends BaseTest {

    @Test(description = "Create 1st wallet - Skip backup")
    public void create1stWallet_SkipBackup() {
        CreateWalletFacade.Create1stWallet("123456", "123456");
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isWalletCreatedSuccessfully());
        homePage.startUsingWallet();
    }

    @Test(description = "Create 1st wallet - Cloud backup")
    public void create1stWallet_CloudBackup() {
        CreateWalletFacade.Create1stWallet("backup1","Hihi@123", "Hihi@123","123456", "123456");
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isWalletCreatedSuccessfully());
        homePage.startUsingWallet();
    }

}
