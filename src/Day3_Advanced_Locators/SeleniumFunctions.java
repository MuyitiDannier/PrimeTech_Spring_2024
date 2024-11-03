package Day3_Advanced_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(2000);
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println("_________");
        System.out.println(driver.getCurrentUrl());

        driver.close();//this will close the current opening browser, but will keep the driver Object.
    }
}
