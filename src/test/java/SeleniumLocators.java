import Framework.BrowserUtils;
import Framework.GenericException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumLocators {

    static WebDriver driver ;

    public static void main (String [] args){
        // There are 9 diff types of ID Locators
//        driver = new ChromeDriver();
        driver = BrowserUtils.getDriver("CHROME");
//        1. ID
//            2.Name
//            3.CSS
//            4.Linktext
//            5.partiallinktext
//            6.xpath
//            7.relative locators from Sel 4
//                8.tagname
//                9.Class

        //driver.findelement driver -< browser and Findelemtn - search element accross the web page
        driver = BrowserUtils.getDriver("CHROME");
        Launchapplication("https://practicetestautomation.com/practice-test-login/");

        WebElement txt_Username = driver.findElement(By.id("username"));
        EnterData(txt_Username,"student","Username");

        WebElement txt_Password = driver.findElement(By.id("password"));
        EnterData(txt_Password,"Password123","Password");

        WebElement btn_Submit = driver.findElement(By.id("submit"));
        Element_Click(btn_Submit,"Submit");





    }

    public static String  createnewTabandlaunchapplication(String url )
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public static void Element_Click(WebElement element , String Labelname ){
       if (element == null){
           throw new RuntimeException("Element is not found"+ Labelname);
       }
       element.click();
    }

    public static void EnterData(WebElement element ,String Data, String Labelname ){
        if (element == null){
            throw new RuntimeException("Element is not found"+ Labelname);
        }
        element.sendKeys(Data);
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
        if (url.isBlank() || url.isEmpty())
            throw new GenericException("URL is Empty or Blank");
        else if (!url.contains("https"))
            throw  new GenericException("URL doesnot contain https");
        else if (!url.startsWith("https"))
            throw new GenericException("URL doesnot starts with https");

        driver.manage().window().maximize();
        driver.get(url);
        return driver.getWindowHandle();
    }
}

