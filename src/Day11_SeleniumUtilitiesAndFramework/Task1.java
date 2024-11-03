package Day11_SeleniumUtilitiesAndFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.SeleniumUtils;

public class Task1 {

    public static void testCase1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        WebElement dropDownField = driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select selectItem = new Select(dropDownField);
        selectItem.selectByValue("dd4");
    }

    public static void testCase2(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");
        WebElement dropDownField = driver.findElement(By.xpath("//select[@id='state']"));
        Select selectState = new Select(dropDownField);
        selectState.selectByValue("California");
    }

    public static void main(String[] args) throws InterruptedException {
        //testCase1();
        //testCase2();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");
        Thread.sleep(2000);
        WebElement dropDownField = driver.findElement(By.xpath("//select[@id='state']"));
        SeleniumUtils.selectByValueFromDropdown(dropDownField, "California");

    }
}
