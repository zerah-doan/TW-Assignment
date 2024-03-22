package page;

import org.openqa.selenium.By;

public class PasscodePage extends BasePage {
    private String numpadPattern = "//android.widget.TextView[@text='<number>']";

    public void inputPasscode(String passcode, String confirmPasscode) {
        for (String n : passcode.split("")) {
            tap(By.xpath(numpadPattern.replace("<number>", n)));
        }
        for (String n : confirmPasscode.split("")) {
            tap(By.xpath(numpadPattern.replace("<number>", n)));
        }
    }

    public void inputPasscode(String passcode) {
        for (String n : passcode.split("")) {
            tap(By.xpath(numpadPattern.replace("<number>", n)));
        }
    }
}
