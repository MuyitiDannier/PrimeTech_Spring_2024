package Day5_CssSelectorsAndFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

    public static void main(String[] args) {
        //Basically, CSS Selector is just a shorter way of Xpath, like we don't need "//" and "@"
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-web-page-test.html");
        //For ID: "#para1" could be a shortcut for "p[id='para1']
        WebElement usingShortId = driver.findElement(By.cssSelector("#para1"));
        System.out.println("Using Id short cut : paragraph is: " +usingShortId.getText());

        WebElement usingLongId = driver.findElement(By.cssSelector("p[id='para1']"));
        System.out.println("Using Long Id : paragraph is: " +usingLongId.getText());

        WebElement usingLongClass = driver.findElement(By.cssSelector("p[class='main']"));
        System.out.println("Using Long Class : paragraph is: " +usingLongClass.getText());
        //For Class: ".main" could be a shortcut for "p[class='main']
        WebElement usingShortClass = driver.findElement(By.cssSelector(".main"));
        System.out.println("Using Short Class : paragraph is: " +usingShortClass.getText());


    }
}
