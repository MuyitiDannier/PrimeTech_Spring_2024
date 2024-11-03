package Day9_SeleniumFunctions_Part5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowHandleDemo {

    public static void example1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement linkElement = driver.findElement(By.xpath("//a[@id='gobasicajax']"));
        linkElement.click();

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);

        Set<String> allWindowHandles = driver.getWindowHandles();//Get all window handles.

        for (String eachWindowHandle : allWindowHandles) {
            if (!eachWindowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(eachWindowHandle);//Switching to the other tabs - Complex.
            }
        }

        WebElement h1Element = driver.findElement(By.xpath("//h1[text()='Basic Ajax Example']"));
        System.out.println(h1Element.getText());

        driver.switchTo().window(mainWindowHandle);//Switching back to the main tab.
        Thread.sleep(2000);
        WebElement h1MainTabElement = driver.findElement(By.xpath("//h1[text()='Windows Links and Examples']"));
        System.out.println(h1MainTabElement.getText());
    }

    public static void example2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement linkElement = driver.findElement(By.xpath("//a[@id='gobasicajax']"));
        linkElement.click();

        String mainWindowHandle = driver.getWindowHandle();
        ArrayList<String> allWindowHandle = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindowHandle.get(1));//Switching to a specific tab - Simple way.

        WebElement h1Element = driver.findElement(By.xpath("//h1[text()='Basic Ajax Example']"));
        System.out.println(h1Element.getText());
    }

    public static void main(String[] args) throws InterruptedException {
        //example1();
        example2();
    }
}
