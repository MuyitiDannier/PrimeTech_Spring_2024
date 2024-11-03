package Day6_SeleniumFunctions_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UsingWebElements {

    public static void example1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        List<WebElement> allParagraghs = driver.findElements(By.xpath("//p"));
        for(WebElement element : allParagraghs){
            System.out.println("The paragragh is: " +element.getText());
        }
    }

    public static void example2() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.facebook.com");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        for(WebElement link : allLinks){
            System.out.println(link.getAttribute("href"));
        }
    }

    public static void example3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.saucedemo.com");
        Thread.sleep(2000);
        WebElement nameField = driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']"));
        nameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password' and @name='password']"));
        passwordField.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' and @id='login-button']"));
        loginButton.click();
        Thread.sleep(2000);
        List<WebElement> inventoryItem = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        System.out.println(inventoryItem.size());

    }

    public static void main(String[] args) throws InterruptedException {
        //example1();
        //example2();
        example3();
    }
}
