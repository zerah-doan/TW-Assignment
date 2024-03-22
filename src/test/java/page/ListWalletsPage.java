package page;

import org.openqa.selenium.By;

public class ListWalletsPage extends BasePage {

    private final By btnEditCur = By.xpath("//android.widget.TextView[@text='✔']/following-sibling::android.widget.Button");
    private final By btnDeleteWallet = By.xpath("//android.widget.TextView[contains(@text,'Main Wallet')]/following-sibling::android.widget.Button");
    private final By btnConfirmDelete = By.xpath("//android.widget.TextView[@text='Delete']");
    private  final  By btnProceedAnyway = By.xpath("//android.widget.TextView[@text='Proceed anyway']");

    private void EditCurrentWallet() {
        tap(btnEditCur);
    }

    public PasscodePage deleteCurrentWallet() {
        EditCurrentWallet();
        tap(btnDeleteWallet);
        tap(btnConfirmDelete);
        tap(btnProceedAnyway);
        return new PasscodePage();
    }
}
