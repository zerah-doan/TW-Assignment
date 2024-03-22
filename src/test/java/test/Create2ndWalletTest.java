package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CreateWalletFacade;
import page.HomePage;

public class Create2ndWalletTest extends BaseTest {

    @BeforeMethod
    public void setUp1stWallet() {
        CreateWalletFacade.Create1stWallet("123456", "123456");
        new HomePage().startUsingWallet().allowNotification();
    }

    @Test(description = "Create nth wallet - Skip backup")
    public void create2ndWallet_SkipBackup() {
        CreateWalletFacade.Create2ndWallet();
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isWalletCreatedSuccessfully());
        homePage.startUsingWallet();
    }

    @Test(description = "Create nth wallet - Cloud backup")
    public void create2ndWallet_CloudBackup() {
        CreateWalletFacade.Create2ndWallet("backup1","Hihi@123", "Hihi@123");
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isWalletCreatedSuccessfully());
        homePage.startUsingWallet();
    }
}
