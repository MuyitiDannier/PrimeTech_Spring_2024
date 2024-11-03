package Day9_SeleniumFunctions_Part5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class DriverQuitVsDriverClose {

    public static void example1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement linkElement = driver.findElement(By.xpath("//a[@id='gobasicajax']"));
        linkElement.click();
        ArrayList<String> allWindowHandle = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindowHandle.get(1));
        driver.close();
    }

    public static void main(String[] args) {

    }
}
