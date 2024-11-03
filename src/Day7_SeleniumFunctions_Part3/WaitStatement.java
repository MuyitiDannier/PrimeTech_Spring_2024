package Day7_SeleniumFunctions_Part3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WaitStatement {

    public static void ImplicitWait(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//If the element is found, implicit wait will NOT happen.
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf' and @id='APjFqb']"));
        searchBox.sendKeys("Animation");
        driver.quit();
    }

    public static void ExplicitWait(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));//Explicit Wait is specific to an element and condition.
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//textarea[@class='gLFyf' and @id='APjFqb']"))));
        driver.quit();
    }

    public static void FluentWait(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))//Extra conditions can be checked in Fluent Wait.
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//textarea[@class='gLFyf' and @id='APjFqb']"))));
        driver.quit();
    }

    public static void main(String[] args) {
        //ImplicitWait();
        //ExplicitWait();
        FluentWait();
    }
}
