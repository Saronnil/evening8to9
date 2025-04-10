package Framework;

import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Set;
@AllArgsConstructor // based on variable it can create parameterized constructor
public class SeleniumUtils {
     WebDriver driver ;

//    public SeleniumUtils(WebDriver driver){
//        this.driver= driver;
//    }

    public String  createnewTabandlaunchapplication(String url )
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public void Element_Click(WebElement element , String Labelname ){
        if (element == null){
            throw new RuntimeException("Element is not found"+ Labelname);
        }
        element.click();
    }

    public void EnterData(WebElement element ,String Data, String Labelname ){
        if (element == null){
            throw new RuntimeException("Element is not found"+ Labelname);
        }
        element.sendKeys(Data);
    }

    public void  switchToAllWindow() throws InterruptedException {
        closerespectivetaborwindow("yahoo");
        driver.quit();
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public void  closerespectivetaborwindow(String urlTitle) throws InterruptedException {
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




    public String  createnewWindowandlaunchapplication(String url )
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public String Launchapplication(String url)
    {
        driver.manage().window().maximize();
        driver.get(url);
        return driver.getWindowHandle();
    }


    }