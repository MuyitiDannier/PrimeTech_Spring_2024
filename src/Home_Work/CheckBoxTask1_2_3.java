package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTask1_2_3 {

    public static void Task1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://indeed.com");
        WebElement jobSearchField = driver.findElement(By.xpath("//input[@id='text-input-what' and @aria-label='search: Job title, keywords, or company']"));
        System.out.println(jobSearchField.isEnabled());
        System.out.println(jobSearchField.isDisplayed());
        Thread.sleep(2000);
        WebElement addressSearchField = driver.findElement(By.xpath("//input[@id='text-input-where']"));
        System.out.println(addressSearchField.isEnabled());
        System.out.println(addressSearchField.isDisplayed());
        Thread.sleep(3000);
        driver.quit();
    }

    public static void Task2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://designsystem.digital.gov/components/radio-buttons/");
        Thread.sleep(1000);
        WebElement radioButton = driver.findElement(By.xpath("//label[@class='usa-radio__label' and @for='historical-douglass']"));
        System.out.println(radioButton.isEnabled());
        System.out.println(radioButton.isDisplayed());
        Thread.sleep(2000);
        System.out.println(radioButton.isSelected());
        Thread.sleep(2000);
        radioButton.click();
        Thread.sleep(3000);
        System.out.println(radioButton.isSelected());
        Thread.sleep(2000);
        driver.quit();
    }

    public static void Task3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://designsystem.digital.gov/components/checkbox/");
        WebElement checkBox = driver.findElement(By.xpath("//label[@class='usa-checkbox__label' and @for='check-historical-truth']"));
        Thread.sleep(1000);
        System.out.println(checkBox.isDisplayed());
        Thread.sleep(1000);
        System.out.println(checkBox.isDisplayed());
        Thread.sleep(1000);
        System.out.println(checkBox.isSelected());
        Thread.sleep(1000);
        checkBox.click();
        checkBox.click();
        Thread.sleep(1000);
        System.out.println(checkBox.isSelected());
        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        //Task1();
        Task2();
        //Task3();
    }

}
