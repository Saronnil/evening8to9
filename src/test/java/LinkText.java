import Framework.BrowserTypes;
import Framework.BrowserUtils;
import Framework.SeleniumUtils;
import org.openqa.selenium.WebDriver;

public class LinkText {
    static WebDriver driver;  // initializing the driver

    public static void main (String [] args){
            driver = BrowserUtils.getDriver(BrowserTypes.CHROME.getBrowser());

            SeleniumUtils seleniumUtils = new SeleniumUtils(driver);
             seleniumUtils.Launchapplication("https://www.amazon.se");





    }
}
