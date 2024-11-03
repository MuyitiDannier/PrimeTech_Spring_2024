package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementFunctionPart2Task2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.ebay.com");
        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input' and @aria-label='Search for anything']"));
        searchBox.sendKeys("Coffee Mug", Keys.ENTER);
        Thread.sleep(1000);
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='s-item__wrapper clearfix']"));
        List<WebElement> itemsPrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));
        int index = 0;
        for(WebElement eachItemPrice : itemsPrice){
            index++;
            System.out.println("Price for item " +index +" is " +eachItemPrice.getText());
        }
        Thread.sleep(3000);
        driver.quit();



    }
}
