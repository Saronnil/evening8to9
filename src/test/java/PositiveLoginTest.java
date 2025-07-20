import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveLoginTest {

    public static String LoginURL = "https://practicetestautomation.com/logged-in-successfully/";

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

if (driver.getCurrentUrl().equals(LoginURL)){
    System.out.println("The Current URL is correct");
}
else
    System.out.println("The Current URL is incorrect");

if (driver.getPageSource().contains("Congratulations") || driver.getPageSource().contains("successfully logged in")){

    System.out.println("Verification is correct");
}
else
    System.out.println("Verification is incorrect ");

if (driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed()){
    System.out.println("Logout button is present");
}else
    System.out.println("Logout button is not present");

}


}



