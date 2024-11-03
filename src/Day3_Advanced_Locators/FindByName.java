package Day3_Advanced_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByName {

    public static void main(String[] args) throws InterruptedException {
        //Creating the instance/object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Navigate to bing.com
        driver.get("http://www.bing.com");
        //Finding element by Name
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation");
        Thread.sleep(3000);
        //Finding element by LinkText
        WebElement imageLink = driver.findElement(By.linkText("Images"));
        imageLink.click();
        Thread.sleep(3000);
        //Finding element by Partial LinkText
        //WebElement shoppingLink = driver.findElement(By.partialLinkText("Shoppi"));
        //shoppingLink.click();
        //Thread.sleep(3000);
        driver.quit(); //Will clear the object and all related information from Heap.

    }
}
