package Day5_CssSelectorsAndFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFunctions {

    public static void usingGetAttribute(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement facebookImage = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img' and @alt='Facebook']"));
        System.out.println("Getting facebook image text: " +facebookImage.getAttribute("alt"));
    }

    public static void usingGetCssValueAndTagName(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println("The color is " +emailInput.getCssValue("color")
                            +", and the height of the element is " +emailInput.getCssValue("height"));
        System.out.println("The tag name of the email input is " +emailInput.getTagName());
    }

    public static void usingKeyClass() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf' and @title='Search' and @id='APjFqb']"));
        Thread.sleep(1000);
        searchBox.sendKeys(Keys.chord("Selenium"));
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));//Select/Highlight everything.
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.chord(Keys.CONTROL, "x"));//Delete everything.

    }

    public static void navigateFunction() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");//Another way to navigate to a website
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf' and @title='Search' and @id='APjFqb']"));//locating the element by xPath
        Thread.sleep(1000);
        searchBox.sendKeys(Keys.chord("Selenium"));
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        //usingGetAttribute();
        //usingGetCssValueAndTagName();
        //usingKeyClass();
        navigateFunction();



    }
}
