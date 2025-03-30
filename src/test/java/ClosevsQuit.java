import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ClosevsQuit {

    static WebDriver driver;
    public static void main (String [] args) throws InterruptedException {
        driver = new ChromeDriver();
        System.out.println(driver);
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        Launchapplication("https://www.yahoo.com");
        createnewTabandlaunchapplication("https://www.gmail.com");
        createnewWindowandlaunchapplication("https://www.instagram.com");
        switchToAllWindow();


    }

    public static String  createnewTabandlaunchapplication(String url )
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public static void switchToAllWindow() throws InterruptedException {
       closerespectivetaborwindow("yahoo");
        driver.quit();
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public static void closerespectivetaborwindow(String urlTitle) throws InterruptedException {
       Set<String> Handles = driver.getWindowHandles();
       for (String Handle : Handles){
           driver.switchTo().window(Handle);
           if(driver.getCurrentUrl().contains(urlTitle) || driver.getTitle().contains(urlTitle))
           {
             driver.close();
           }
Thread.sleep(3000);
       }
    }


    public static String  createnewWindowandlaunchapplication(String url )
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public static String Launchapplication(String url)
    {
        driver.get(url);
        return driver.getWindowHandle();
    }
}
