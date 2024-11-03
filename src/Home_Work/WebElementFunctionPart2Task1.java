package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementFunctionPart2Task1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.saucedemo.com");
        Thread.sleep(1000);
        WebElement nameField = driver.findElement(By.xpath("//input[@id='user-name']"));
        nameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Thread.sleep(2000);
        List<WebElement> itemsPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        Thread.sleep(1000);
        for(int i=0; i<=itemsPrice.size()-1; i++){
            System.out.println("Price for item " +(i+1) +" is " +itemsPrice.get(i).getText());
        }
        Thread.sleep(5000);
        driver.quit();



    }
}
