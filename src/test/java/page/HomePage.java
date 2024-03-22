package page;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final By btnCreateWallet = By.xpath("//android.view.View[./*[@text='Create new wallet']]");
    private final By btnStartUsing = By.xpath("//android.widget.TextView[@text='Start using Trust Wallet']");
    private final By btnListWallet = By.xpath("//android.widget.TextView[contains(@text,'Main Wallet')]");

    private final By btnAllowNotification = By.id("com.android.permissioncontroller:id/permission_allow_button");

    public BackUpPage createFirstWallet() {
        tap(btnCreateWallet);
        return new BackUpPage();
    }

    public BackUpPage create2ndWallet() {
        viewWallets();
        tap(By.xpath("//android.widget.TextView[@text=\"Wallets\"]//following-sibling::android.widget.Button"));
        tap(btnCreateWallet);
        return new BackUpPage();
    }

    public ListWalletsPage viewWallets() {
        tap(btnListWallet);
        return new ListWalletsPage();
    }

    public boolean isWalletCreatedSuccessfully() {
        return findElement(btnStartUsing).isDisplayed();
    }

    public HomePage startUsingWallet() {
        tap(btnStartUsing);
        return this;
    }

    public HomePage allowNotification() {
        if (isElementDisplayed(btnAllowNotification)) {
            tap(btnAllowNotification);
        }
        return this;
    }


}
