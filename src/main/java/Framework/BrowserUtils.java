package Framework;

import com.microsoft.edge.seleniumtools.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
    public static WebDriver getDriver(String Browsername){
        return switch (Browsername.toUpperCase())
        {
            case "CHROME" -> new ChromeDriver();
            case "FIREFOX" -> new FirefoxDriver();
            case "EDGE" -> new EdgeDriver();

            default -> throw new RuntimeException("The given "+ Browsername + "doesnot exist ");
        };

    }
}
