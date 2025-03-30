import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Set;

public class HandlingWindowsandTabs {
    public static void main (String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // syntax of creating a new Tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.instagram.com");
        String InstaHandle = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.yahoo.com");
        Thread.sleep(3000);
        driver.switchTo().window(InstaHandle);

        Set<String> Handle = driver.getWindowHandles();

        for(String handle: Handle)
        {
            driver.switchTo().window(handle);
            Thread.sleep(1000);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
        }






    }
}
