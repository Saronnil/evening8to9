import Framework.BrowserTypes;
import Framework.BrowserUtils;
import Framework.PathUtils;
import Framework.SeleniumUtils;
import lombok.SneakyThrows;
import org.openqa.selenium.*;

import java.io.File;
import java.nio.file.Files;

public class LinkText {
    static WebDriver driver;  // initializing the driver

    public static void main (String [] args){
            BrowserUtils.KillBrowser();
            driver = BrowserUtils.getDriver(BrowserTypes.CHROME.getBrowser());

            SeleniumUtils seleniumUtils = new SeleniumUtils(driver);
             seleniumUtils.Launchapplication("https://www.cricbuzz.com");
            // Linktext It will work when the text is surrounded by Anchor tags

        WebElement Link_Text = driver.findElement(By.linkText("Teams"));
        seleniumUtils.Element_Click(Link_Text,"Teams");

        PathUtils.applySleep(4000);

        WebElement Link_Text1 = driver.findElement(By.linkText("Australia"));
        seleniumUtils.Element_Click(Link_Text1,"Australia");

        capturescreenshot();



    }

@SneakyThrows
    public static String capturescreenshot(){
        File srcy = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        System.out.println(src.getPath());

        File dest = new File(System.getProperty("user.dir")+"//Image.png");

        Files.copy(srcy.toPath(), dest.toPath());
    return dest.getPath();
    }
}
