package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class WindowHandleTask1 {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String mainWindowHandle = driver.getWindowHandle();
        String mainTabTitleName = driver.getTitle();
        System.out.println(mainTabTitleName);
        WebElement clickHereButton = driver.findElement(By.xpath("//a[@href=\"../articles_popup.php\"]"));
        clickHereButton.click();

        ArrayList<String> allWindowHandle = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindowHandle.get(1));
        WebElement emailField = driver.findElement(By.xpath("//input[@type='text' and @name='emailid']"));
        emailField.sendKeys("random@email.com");
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']"));
        submitButton.click();

        WebElement userID = driver.findElement(By.xpath("//td[contains(text(),'User ID :')]/following-sibling::td"));
        WebElement userPassword = driver.findElement(By.xpath("//td[text()='Password :']/following-sibling::td"));
        String userIdValue = userID.getText();
        String userPasswordValue = userPassword.getText();
        System.out.println("User ID: " +userIdValue);
        System.out.println("User Password: " +userPasswordValue);
        WebElement textVerification = driver.findElement(By.xpath("//h3[@style='color:#800080;font-size:22px;font-weight:700;']"));

        if(textVerification.getText().equals("This access is valid only for 20 days.")){
            System.out.println("Text has been verified, condition is ture.");
        }else{
            System.out.println("Condition is not true.");
        }

        driver.close();
        driver.switchTo().window(mainWindowHandle);

        if(driver.getTitle().equals(mainTabTitleName)){
            System.out.println("Title matched the main tab title in the memory.");
        }else{
            System.out.println("Title did not match the main tab title in the memory.");
        }

        driver.quit();
    }
}

