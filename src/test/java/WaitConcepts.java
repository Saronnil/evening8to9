import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitConcepts {

    // wait
    // Implicit wait - Thread.Sleep(2000);
    // Explicit wait - Implicit wait , Explicit wait , Fluent wait
public static void main (String []args) {

    RemoteWebDriver driver = new ChromeDriver();

    System.out.println(driver.getCapabilities());

    //Default Wait time of Selenium Driver

//    Implicit wait = 0 sec
////            Pageload time = 300 secs
////            Script timeout = 30 Secs


    // Implicit wait 1. It is applied at a driver/global level , it wait for stipulated time if it dont get the element .
//if element is not found it throws No such exeception error

    // Drawback of Implicit wait
//    1.We cannot apply different wait times for different elements
//    2. Find elements if it is not loaded immediately.


//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
try {
    driver.get("https://www.google.com");
}
    catch (Exception e)
    {

    }

    driver.findElement(By.id("fgv"));

    // Explicit Wait
    // We are here to wait for a Stipulated amount of time until the condition is satisfied.
    // We have many expected condition in the Selenium Library
//    It throws TimeoutException
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("qws")));

    // Combination of Exp + Imp = Total time

}


}
