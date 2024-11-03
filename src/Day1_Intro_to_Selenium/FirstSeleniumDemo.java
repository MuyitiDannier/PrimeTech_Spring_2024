package Day1_Intro_to_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumDemo {

    public static void main(String[] args){
        //Set the path to the ChromeDriver executable file:
        System.setProperty("WebDriver.chrome.driver","browsers/chromedriver.exe");

        //Create a ChromeDriver instance
        //WebDriver - is an Interface - Manage the drivers on runtime
        //- it will go to the internet and grab the right browser driver for your system.
        WebDriver chromeDriver = new ChromeDriver();
        //Open a website
        chromeDriver.get("https://www.google.com");



    }
}
