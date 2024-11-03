package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/text-box");
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@type='text' and @id='firstName']"));
        firstName.sendKeys("DAN");
        Thread.sleep(3000);
        driver.close();

    }
}
