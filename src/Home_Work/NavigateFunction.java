package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFunction {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys(Keys.chord("Coffee Mug"), Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.chord(Keys.CONTROL,"x"));
        Thread.sleep(2000);
        searchBox.sendKeys("Pretty Coffee Mug", Keys.ENTER);
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();


    }
}
