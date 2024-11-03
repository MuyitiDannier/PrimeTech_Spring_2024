package Day13_SeleniumFrameWork_Part2;
import Day13_SeleniumFrameWork_Part2.Pages.LandingPage;
import Day13_SeleniumFrameWork_Part2.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SauceDemoLogin {

    //We can call out getDriver method on top with static key word,
    //and also, we can call the getDriver method separately in each test case.
    static WebDriver driver = Driver.getDriver();

    static LoginPage loginPage;

    static LandingPage landingPage;

    /**
     *     Test Case 1:
     *     Navigate to https://www.saucedemo.com/
     *     Enter "standard_user" into username and "secret_sauce" into passwords
     *     Verify that "Swag Labs" lable is displayed
     */

    public static void verifyMainLabel() {
        loginPage = new LoginPage();
        landingPage = new LandingPage();
        driver.get(ConfigurationReader.getPropertyValue("baseUrl"));//Now we are navigating to website with Configuration Reader by Property Value.
        //enter username - using loginPage(instance of LoginPage Class)
        loginPage.userName.sendKeys("standard_user");
        //enter password
        loginPage.password.sendKeys("secret_sauce");
        //click on login button
        loginPage.loginButton.click();
        //verify that label
        if (landingPage.mainLabel.isDisplayed()) {
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
        loginPage = new LoginPage();
        driver = Driver.getDriver();//Since we are already within the method, we don't need static keyword here.
        driver.get("https://www.saucedemo.com/");
        loginPage.userName.sendKeys("locked_out_user");
        //enter password
        loginPage.password.sendKeys("secret_sauce");
        //click on login button
        loginPage.loginButton.click();
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








