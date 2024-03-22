package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BackUpPage extends BasePage {
    private final By btnSkip = By.xpath("//android.view.View[./*[@text='SKIP']]");
    private final By btnBackupManually = By.xpath("//android.view.View[./*[@text='Back up manually']]");
    private final By btnBackupCloud = By.xpath("//android.view.View[./*[@text='Back up to Google Drive']]");


    public PasscodePage skip() {
        tap(btnSkip);
        return new PasscodePage();
    }

    public void backupManually() {
        tap(btnBackupManually);
        for (WebElement ele : findElements(By.xpath("//android.widget.ScrollView/android.view.View"))) {
            ele.click();
        }
        //TODO: confirm secret phrase
    }

    public PasscodePage backupOnCloud(String backupName, String password, String confirmPassword) {
        tap(btnBackupCloud);
        input(By.xpath("//android.widget.EditText"), backupName);
        tap(By.xpath("//android.view.View[./*[@text='Continue']]"));
        tap(By.xpath("//*[@resource-id='com.google.android.gms:id/account_display_name']"));
        input(By.xpath("//android.widget.EditText"), password);
        tap(By.xpath("//android.widget.TextView[@text='Set encryption password']"));
        input(By.xpath("//android.widget.EditText"), confirmPassword);
        tap(By.xpath("//android.widget.TextView[@text='Trust Wallet cannot recover my secret phrase encryption password.']"));
        tap(By.xpath("//android.widget.TextView[@text='I understand that if I lose or forget this password I will lose access to my crypto.']"));
        tap(By.xpath("//android.widget.TextView[@text='Confirm']"));
        tap(By.id("com.google.android.gms:id/touch_outside"));
        return new  PasscodePage();
    }
}
