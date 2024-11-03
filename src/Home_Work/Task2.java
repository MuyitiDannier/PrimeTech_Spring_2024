package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot pas"));
        forgotPassword.click();
        Thread.sleep(3000);
        driver.close();

    }
}
