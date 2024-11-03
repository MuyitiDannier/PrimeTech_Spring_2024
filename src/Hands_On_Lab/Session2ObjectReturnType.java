package Hands_On_Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2ObjectReturnType {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");//Return Type matters. Since "get()" does not have a return type, we don't have access to further actions.
        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @aria-label='Email or phone number']")).sendKeys("Automation");
        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi' and @placeholder='Password']")).sendKeys("Automation");
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy' and @name='login']")).click();
        driver.close();
    }
}
