package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFramesTask1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/frames");
        driver.switchTo().frame("iframe1");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("First Name");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Last Name");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Current Address");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("City");
        WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='state' and @class='form-select']"));
        Select selectState = new Select(selectDropdown);
        selectState.selectByIndex(9);
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("123456");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement radioButtonGender = driver.findElement(By.xpath("//input[@type='radio' and @name='gender' and @id='male']"));
        wait.until(ExpectedConditions.elementToBeClickable(radioButtonGender));
        js.executeScript("arguments[0].click();", radioButtonGender);
        WebElement checkMeOut = driver.findElement(By.xpath("//input[@type='checkbox' and @id='gridCheck']"));
        wait.until(ExpectedConditions.elementToBeClickable(checkMeOut));
        js.executeScript("arguments[0].click();", checkMeOut);
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click();", submitButton);
        WebElement messageAppeared = driver.findElement(By.xpath("//h3[text()='You have submited below information:']"));
        if(messageAppeared.getText().equals("You have submitted below information:")){
            System.out.println("Correct message appeared.");
        }else{
            System.out.println("Message is incorrect.");
        }
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        WebElement headerText = driver.findElement(By.tagName("h3"));
        if(headerText.getText().equals("Frames")){
            System.out.println("Correct header.");
        }else{
            System.out.println("Incorrect header.");
        }
    }
}
