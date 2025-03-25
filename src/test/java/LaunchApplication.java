import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main (String [] args){

    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//Drivers//chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.google.com");

    // drawback of above approach
        //1.Need to ensure that the driver remains in the same location
        //2.We have to download manually each driver for browser upgrade
        // suppose if the driver file is corrupted or removed then we have to do this setup again and again
        // when we execute the code in remote machine they might not accept using seperate .exe files for launchin the browsers

        // 2nd way
        // webdrivermanager which is a sister company  to Selenium invesnted by bonigarcia
        // which helps easy setup of browser without System.set property command.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com");

        System.clearProperty("webdriver.chrome.driver");

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
    }

}
