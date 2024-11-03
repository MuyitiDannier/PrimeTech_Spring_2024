package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SeleniumActionClassTask1AndTask2 {

    public static void task1(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://testpages.eviltester.com/styled/csspseudo/css-hover.html");
        Actions actions = new Actions(driver);
        WebElement hoverPara = driver.findElement(By.xpath("//p[@id='hoverpara']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(hoverPara));
        actions.moveToElement(hoverPara).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//html")));
        String textHoverPara = hoverPara.getText();
        System.out.println("Text of the first element is: " +textHoverPara);
        WebElement hoverDiv = driver.findElement(By.xpath("//p[@id='hoverdivpara']"));
        wait.until(ExpectedConditions.visibilityOf(hoverDiv));
        actions.moveToElement(hoverPara).moveToElement(driver.findElement(By.xpath("//html")));
        String textHoverDiv = hoverDiv.getText();
        System.out.println("Text of the second element is: " +textHoverDiv);
        driver.close();
    }

    public static void task2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/sortable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//li[text()='Item 3']"))).moveToElement(driver.findElement(By.xpath("//li[text()='Item 1']"))).release().build().perform();
        actions.clickAndHold(driver.findElement(By.xpath("//li[text()='Item 7']"))).moveToElement(driver.findElement(By.xpath("//li[text()='Item 6']"))).release().build().perform();
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        //task1();
        task2();
    }
}
