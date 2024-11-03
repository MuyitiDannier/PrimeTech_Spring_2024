package Day13_SeleniumFrameWork_Part2.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    //Constructor for the Login Page
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);//Selenium 4.19 supports "this" but not "LoginPage.class".
    }

    //Find the Elements which are part of the Login Page

    //Username
    @FindBy(xpath = "//input[@id='user-name']")//this line is to find the element,
    public WebElement userName;//declaring the element object

    //Password
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    //Login Button
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButton;
}
