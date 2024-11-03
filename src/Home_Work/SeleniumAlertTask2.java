package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumAlertTask2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement button4 = driver.findElement(By.xpath("//button[@id='promtButton' and text()='Click me']"));
        button4.click();
        driver.switchTo().alert().sendKeys("PrimeTech");
        driver.switchTo().alert().accept();
        WebElement promptResult = driver.findElement(By.xpath("//span[@id='promptResult']"));
        if (promptResult.getText().equals("You entered PrimeTech")){
            System.out.println("Correct text displayed.");
        }else{
            System.out.println("Incorrect text displayed.");
        }
    }
}

