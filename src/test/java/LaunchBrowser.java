
import com.microsoft.edge.seleniumtools.EdgeDriver;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.Set;

public class LaunchBrowser {
    public static void main (String [] args){

        // 1st way
        //        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.se");

        // 2nd way

        //SearchContext s1 = new EdgeDriver(); it contains only 2 functions FindElement and FindElements
//
        // 3rd way recommeded approach
//        RemoteWebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver = new FirefoxDriver();
//        driver.get("Https://www.snapdeal.com");

        // 4th way

//        ChromiumDriver driver = new EdgeDriver(); only if client works on chrome and edge browser
//        driver.get("https://www.amazon.se");

        // 5th way

//        RemoteWebDriver driver = new ChromiumDriver(); we can never create an object with chromium driver , it expects arguments
//        driver.get("https://www.google.com");

        // 6th way Not recommended
//SearchContext s3 = new WebDriver() {
//    @Override
//    public void get(String url) {
//
//    }
//
//    @Override
//    public @Nullable String getCurrentUrl() {
//        return "";
//    }
//
//    @Override
//    public @Nullable String getTitle() {
//        return "";
//    }
//
//    @Override
//    public List<WebElement> findElements(By by) {
//        return List.of();
//    }
//
//    @Override
//    public WebElement findElement(By by) {
//        return null;
//    }
//
//    @Override
//    public @Nullable String getPageSource() {
//        return "";
//    }
//
//    @Override
//    public void close() {
//
//    }
//
//    @Override
//    public void quit() {
//
//    }
//
//    @Override
//    public Set<String> getWindowHandles() {
//        return Set.of();
//    }
//
//    @Override
//    public String getWindowHandle() {
//        return "";
//    }
//
//    @Override
//    public TargetLocator switchTo() {
//        return null;
//    }
//
//    @Override
//    public Navigation navigate() {
//        return null;
//    }
//
//    @Override
//    public Options manage() {
//        return null;
//    }
//}


        // 7th way - recommended when using Selenium grid used for remote env

//        WebDriver driver3 = new RemoteWebDriver();
        // 8th way Most recommendeds

//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new EdgeDriver();






    }
}
