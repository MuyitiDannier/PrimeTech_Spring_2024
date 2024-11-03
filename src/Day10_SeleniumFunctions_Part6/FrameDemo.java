package Day10_SeleniumFunctions_Part6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

    public static void frameExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
        //Switching to different frame - Using name or id.
        driver.switchTo().frame("middle");
        WebElement item = driver.findElement(By.xpath("//li[@id='middle0']"));
        System.out.println(item.getText());
        //Switching back to original frame.
        driver.switchTo().defaultContent();//Switching back to original html root;
        driver.switchTo().frame("top");//Then switch to a new frame.
        driver.findElement(By.xpath("//h1[text()='Nested Frames Example']"));
        //Switching to another frame by using WebElement - xPath
        driver.switchTo().defaultContent();
        WebElement frameMiddle = driver.findElement(By.xpath("//frame[@name='middle']"));
        driver.switchTo().frame(frameMiddle);
        driver.switchTo().defaultContent();//switch to the original frame, main page.
        driver.switchTo().parentFrame();//switch to a frame up.
    }

    public static void main(String[] args) {
        frameExample();
    }
}
