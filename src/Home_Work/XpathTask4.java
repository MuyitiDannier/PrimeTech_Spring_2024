package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/text-box");
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@type='text' and @id='firstName']"));
        firstName.sendKeys("Dan");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//input[@class='form-control' and @id='lastName']"));
        lastName.sendKeys("Muyiti");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email' and @id='email']"));
        email.sendKeys("123@gmail.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("//input[@type='password' and @class='form-control']"));
        password.sendKeys("123456");
        Thread.sleep(2000);
        WebElement clearButton = driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-danger']"));
        clearButton.click();
        Thread.sleep(3000);
        driver.close();

    }

}
