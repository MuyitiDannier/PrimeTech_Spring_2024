package Day8_SeleniumFunctionsContinued;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertExamples {

    public static void alertExample1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        WebElement button1 = driver.findElement(By.xpath("//input[@value='Show alert box']"));
        button1.click();
        //Handle alert by accepting it (Clicking on OK button)
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    public static void alertExample2() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        WebElement button2 = driver.findElement(By.xpath("//input[@value='Show confirm box']"));
        button2.click();
        //Handle alert by dismissing it (Clicking on Cancel button)
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
    }

    public static void alertExample3() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        WebElement button3 = driver.findElement(By.xpath("//input[@value='Show prompt box']"));
        button3.click();
        //Inserting information into alert box.
        Thread.sleep(3000);
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Automation");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    public static void alertExample4() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton' and @class='btn btn-primary']"));
        button1.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

    public static void alertExample5() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement button1 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        button1.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(3000);
        System.out.println(text == "This alert appeared after 5 seconds");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        //alertExample1();
        //alertExample2();
        //alertExample3();
        //alertExample4();
        alertExample5();
    }
}
