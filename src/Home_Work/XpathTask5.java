package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@type='text' and @id='firstName']"));
        firstName.sendKeys("Dan");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.xpath("//input[@type='text' and @id='lastName']"));
        lastName.sendKeys("Muyiti");
        Thread.sleep(2000);
        WebElement addressField = driver.findElement(By.xpath("//input[@type='text' and @id='address']"));
        addressField.sendKeys("10th street");
        Thread.sleep(2000);
        WebElement cityField = driver.findElement(By.xpath("//input[@type='text' and @id='city']"));
        cityField.sendKeys("New York City");
        Thread.sleep(2000);
        WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='state' and @class='form-select']"));
        stateDropdown.click();
        Thread.sleep(2000);
        WebElement stateNewYork = driver.findElement(By.xpath("//option[@value='New York']"));
        stateNewYork.click();
        Thread.sleep(2000);
        WebElement zipField = driver.findElement(By.xpath("//input[@type='text' and @id='zipCode']"));
        zipField.sendKeys("123456");
        Thread.sleep(2000);
        WebElement maleGenderRadioButton = driver.findElement(By.xpath("//label[@class='form-check-label' and @for='male']"));
        maleGenderRadioButton.click();
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']"));
        submitButton.click();
        Thread.sleep(5000);
        driver.close();

    }

}

