package Day9_SeleniumFunctions_Part5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

    public static void scrollToElementExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        WebElement checkThisButton = driver.findElement(By.xpath("//button[text()='Check this']"));
        //Using scroll down with Keys to reach to the element.
        //checkThisButton.sendKeys(Keys.DOWN);
        //checkThisButton.sendKeys(Keys.DOWN);
        //checkThisButton.sendKeys(Keys.DOWN);
        //checkThisButton.sendKeys(Keys.DOWN);
        //checkThisButton.sendKeys(Keys.DOWN);
        //checkThisButton.sendKeys(Keys.DOWN);

        //Using JavascriptExecutor - Now both driver and jsExecutor are pointing to ChromeDriver inside the memory.
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", checkThisButton);
    }

    public static void clickOnElementExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        WebElement alertButton = driver.findElement(By.xpath("//input[@id='alert1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertButton);
    }

    public static void highlightElementExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        WebElement alertButton = driver.findElement(By.xpath("//input[@id='alert1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", alertButton);
    }

    public static void main(String[] args) throws InterruptedException {
        //scrollToElementExample();
        //clickOnElementExample();
        highlightElementExample();

    }
}
