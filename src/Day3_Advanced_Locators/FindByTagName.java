package Day3_Advanced_Locators;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByTagName {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        //Finding element using Tag Name
        WebElement element = driver.findElement(By.tagName("h2"));
        //Retrieving the text from the h2 element
        String h2Text = element.getText();
        //Printing the text
        System.out.println(h2Text);

    }
}
