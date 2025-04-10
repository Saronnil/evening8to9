package Framework;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// In this class every method and variable  is Static
// we need to ensure that no one create object of this class
@UtilityClass


public class BrowserUtils {
@SneakyThrows
    public void KillBrowser(){
        Runtime.getRuntime().exec("TASKKILL -f -im chromedriver.exe /T");
    }

    public WebDriver getDriver(String Browsername){
        return switch (Browsername.toUpperCase())
        {
            case "CHROME" -> new ChromeDriver();
            case "FIREFOX" -> new FirefoxDriver();
            case "EDGE" -> new EdgeDriver();

            default -> throw new RuntimeException("The given "+ Browsername + "doesnot exist ");
        };

    }
}
