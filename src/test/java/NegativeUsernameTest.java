import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class NegativeUsernameTest {

    public static String URL = "https://practicetestautomation.com/practice-test-login/";
    public static String username =  "incorrectUser";
    public static String password = "Password123" ;
    public static String error_message = "Your username is invalid!";

    public static void main (String []args) {

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement Uname = driver.findElement(By.id("username"));
        Uname.sendKeys(username);

        WebElement Pword = driver.findElement(By.id("password"));
        Pword.sendKeys(password);

        WebElement Submit = driver.findElement(By.id("submit"));
        Submit.click();

        WebElement error = driver.findElement(By.xpath("//div[@id='error']"));
        if (error.isDisplayed()) {
            System.out.println("Error message is displayed.");
        }

        String err = error.getText();
        System.out.println(err);

    }
      }
