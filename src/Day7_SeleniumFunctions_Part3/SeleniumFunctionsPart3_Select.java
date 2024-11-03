package Day7_SeleniumFunctions_Part3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumFunctionsPart3_Select {

    public static void usingSelect() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        Thread.sleep(2000);
        WebElement selectDropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select selectItem = new Select(selectDropdown);
        selectItem.selectByIndex(0);//Select by Index
        Thread.sleep(2000);
        selectItem.selectByIndex(3);
        Thread.sleep(2000);
        selectItem.selectByValue("dd6");//Select by value - Accept String - Value Attribute
        Thread.sleep(2000);
        selectItem.selectByVisibleText("Drop Down Item 1");//Select by Visible Text
        Thread.sleep(2000);
        WebElement option = selectItem.getFirstSelectedOption();//Get First Selected Option
        System.out.println(option.getText());
        Thread.sleep(2000);
        java.util.List<WebElement> allOption = selectItem.getOptions();//Get All Options
        for(WebElement eachOption : allOption){
            System.out.println(eachOption.getText());
        }
        Thread.sleep(2000);
        WebElement selections = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
        Select multiSelect = new Select(selections);
        List<WebElement> listOfSelections = multiSelect.getAllSelectedOptions();//Get All Selected Options
        for(WebElement eachSelection : listOfSelections){
            System.out.println(eachSelection.getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        usingSelect();
    }
}
