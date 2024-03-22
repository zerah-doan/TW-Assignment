package page;

import org.openqa.selenium.By;

public class GetStartedPage extends BasePage {

    private final By btnGetStarted = By.xpath("//android.widget.TextView[@text='Get Started']");

    public HomePage getStarted(){
        tap(btnGetStarted);
        return new HomePage();
    }
}
