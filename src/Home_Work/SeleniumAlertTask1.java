package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlertTask1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement button3 = driver.findElement(By.xpath("//button[@id='confirmButton' and text()='Click me']"));
        button3.click();
        String textOfButton3 = driver.switchTo().alert().getText();
        if(textOfButton3.equals("Do you confirm action?")){
            System.out.println("Condition is true.");
        }else{
            System.out.println("Condition is not true.");
        }
        driver.switchTo().alert().dismiss();
        WebElement mySelection = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        if(mySelection.getText().equals("You selected Cancel")){
            System.out.println("Correct text displayed.");
        }else{
            System.out.println("Incorrect text displayed.");
        }

    }
}
