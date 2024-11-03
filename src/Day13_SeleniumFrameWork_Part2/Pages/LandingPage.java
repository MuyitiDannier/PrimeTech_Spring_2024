package Day13_SeleniumFrameWork_Part2.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //--------------------WebElements---------------------------

    @FindBy(xpath = "(//div[.='Swag Labs'])[2]")
    public WebElement mainLabel;
}
