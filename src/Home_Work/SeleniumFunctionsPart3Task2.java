package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumFunctionsPart3Task2 {

    public static void solution1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='btn1' and text()='Add Textbox1']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @id='txt1']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        driver.findElement(By.xpath("//input[@id='txt2' and @placeholder='Textbox2']")).sendKeys("test");
    }

    public static void solution2(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn1' and text()='Add Textbox1']")));
        driver.findElement(By.xpath("//button[@id='btn1' and text()='Add Textbox1']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @id='txt1']")));
        driver.findElement(By.xpath("//input[@type='text' and @id='txt1']")).sendKeys("test");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn2']")));
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Re-assigning the wait time.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt2' and @placeholder='Textbox2']")));
        driver.findElement(By.xpath("//input[@id='txt2' and @placeholder='Textbox2']")).sendKeys("test");
    }

    public static void main(String[] args) throws InterruptedException {
        //solution1();
        solution2();
        //Questions:
        //Explicit Wait didn't work.


    }
}
