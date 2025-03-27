import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication {
    public static void main (String [] args){

        WebDriver driver = new ChromeDriver();
        // New User creation
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");

        driver.findElement(By.linkText("New User")).click();
        driver.findElement(By.id("firstname")).sendKeys("John");
        driver.findElement(By.id("lastname")).sendKeys("Smith");
        driver.findElement(By.id("username")).sendKeys("JohnS");
        driver.findElement(By.id("password")).sendKeys("Password");
        driver.findElement(By.xpath("//*[@id=\"signupForm\"]/div[5]/input")).click();
        driver.findElement(By.linkText("Back to Login")).click();

        //Login

        driver.findElement(By.id("email")).sendKeys("Sukh@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password");

        driver.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input")).click();

        driver.close();


        // Pratice form
//        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
//        driver.findElement(By.id("name")).sendKeys("Tommy");
//        driver.findElement(By.id("email")).sendKeys("sukh@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).click();
//        driver.findElement(By.id("mobile")).sendKeys("9876543209");



    }
}
