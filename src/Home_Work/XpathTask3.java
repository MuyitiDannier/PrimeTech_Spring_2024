package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/radio-button");
        Thread.sleep(2000);
        WebElement buttonUSA = driver.findElement(By.xpath("//label[@class='form-check-label' and @for='USA']"));
        buttonUSA.click();
        Thread.sleep(3000);
        driver.close();

    }
}
