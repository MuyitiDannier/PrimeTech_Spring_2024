package Day12_SeleniumFrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SauceDemoLogin {

    //We can call out getDriver method on top with static key word,
    //and also, we can call the getDriver method separately in each test case.
    static WebDriver driver = Driver.getDriver();

    /**
     *     Test Case 1:
     *     Navigate to https://www.saucedemo.com/
     *     Enter "standard_user" into username and "secret_sauce" into passwords
     *     Verify that "Swag Labs" lable is displayed
     */

    public static void verifyMainLabel() {
        driver.get(ConfigurationReader.getPropertyValue("baseUrl"));//Now we are navigating to website with Configuration Reader by Property Value.
        //enter username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //verify that label
        WebElement label = driver.findElement(By.xpath("(//div[.='Swag Labs'])[2]"));
        if (label.isDisplayed()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        Driver.closeDriver();//Now the driver is null, we have to call the getDriver method again in the following methods.
    }

    /**
     *     Test Case 2:
     *     Navigate to https://www.saucedemo.com/
     *     Enter "locked_out_user" into username and "secret_sauce" into passwords
     *     Verify that The Error message "Epic sadface: Sorry, this user has been locked out." is displayed
     */

    public static void verifyLockedOutUser(){
        driver = Driver.getDriver();//Since we are already within the method, we don't need static keyword here.
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //Error locked element
        WebElement errorLockedOutMessage = driver.findElement(By.xpath("//h3[.='Epic sadface: Sorry, this user has been locked out.']"));
        String lockedOutText = errorLockedOutMessage.getText();
        if (lockedOutText.equals("Epic sadface: Sorry, this user has been locked out.")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        boolean lockedOutMessageDisplayed = errorLockedOutMessage.isDisplayed();
        if (lockedOutMessageDisplayed) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        Driver.closeDriver();
    }

    public static void main(String[] args) {
        verifyMainLabel();
        verifyLockedOutUser();
    }
}








