package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTask2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.indeed.com");
        Thread.sleep(2000);
        WebElement whereField = driver.findElement(By.cssSelector("input[id='text-input-where']"));
        System.out.println("My current location is: " +whereField.getAttribute("value"));
        System.out.println("The color of this field is: " +whereField.getCssValue("color"));
        if(whereField.getTagName().equals("input")){
            System.out.println("Tag name equals to 'input'.");
        }else{
            System.out.println("Tag name doesn't equal to 'input'.");
        }

    }
}
