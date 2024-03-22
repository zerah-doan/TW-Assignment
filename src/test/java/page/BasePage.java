package page;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import quangdoan.driver.Driver;

import java.time.Duration;
import java.util.List;

public class BasePage {


    protected WebElement findElement(By by) {
        return Driver.get().findElement(by);
    }

    protected List<WebElement> findElements(By by) {
        return Driver.get().findElements(by);
    }

    protected void tap(By by) {
        findElement(by).click();
    }

    protected void input(By by, String input, boolean clear) {
        WebElement ele = findElement(by);
        if (clear) {
            ele.clear();
        }
        ele.sendKeys(input);
    }

    protected void input(By by, String input) {
        input(by, input, true);
    }

    protected boolean isElementDisplayed(By by) {
        try {
            new WebDriverWait(Driver.get(), Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }
}
