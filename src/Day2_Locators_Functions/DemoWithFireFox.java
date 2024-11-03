package Day2_Locators_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWithFireFox {

    public static void main(String[] args) throws InterruptedException {
        //Interface   referenceType(object)  =  new object constructor();
        WebDriver     fireFoxDriver          =  new FirefoxDriver();
        //Maximizing The Window:
        fireFoxDriver.manage().window().maximize();
        //Navigation:
        fireFoxDriver.get("http://www.google.com");
        //Get title of the webpage
        System.out.println("We are now visiting: " +fireFoxDriver.getTitle());
        //Interact with the website using the related elements:
        WebElement searchBox = fireFoxDriver.findElement(By.id("APjFqb"));
        //id is an element we grabbed from website inspect, we can also grab other elements are available
        searchBox.sendKeys("Selenium Automation");

        fireFoxDriver.get("https://ca.yahoo.com/");
        WebElement searchBoxYahoo = fireFoxDriver.findElement(By.id("ybar-sbq"));
        searchBoxYahoo.sendKeys("Donald Trump");
        //Stay on the website for a certain amount of time:
        Thread.sleep(3000);
        //Quit a website:
        fireFoxDriver.quit();


    }
}
