package Day6_SeleniumFunctions_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBox {

    public static void isSelected(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        WebElement checkBox3 = driver.findElement(By.xpath("//input[@value='cb3']"));
        System.out.println(checkBox3.isSelected());//isSelect returns Boolean value.
    }

    public static void isDisplayed(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        WebElement title = driver.findElement(By.xpath("//h1[text()='Basic HTML Form Example']"));
        System.out.println(title.isDisplayed());//isDisplayed returns Boolean value.
    }

    public static void main(String[] args) {
        //isSelected();
        isDisplayed();
    }
}
