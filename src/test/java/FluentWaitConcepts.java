import Framework.BrowserTypes;
import Framework.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitConcepts {

    public static void main (String [] args){
        // Fluent wait is more advanced version of explicit wait
        // Default polling time for selenium is 500 ms
        // 1.Applied at Browser and non browser level'
        // 2.ability to customise the polling time - every 2 secs we check if condition is met or not

        WebDriver driver = BrowserUtils.getDriver(BrowserTypes.CHROME.getBrowser());
        driver.get("https://www.google.com");
        FluentWait <WebDriver> fluentWait =   new FluentWait<>(driver);

        fluentWait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchSessionException.class).ignoring(StaleElementReferenceException.class).withMessage("Element not found");
fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

    }
}
