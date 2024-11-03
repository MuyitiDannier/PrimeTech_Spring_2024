package Day3_Advanced_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivities {

    public static void testCase1(){
        //Codes for Test Case 1 Activity - We can call this method later in the main method by its name.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("Automation");
        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("Automation");
        WebElement logInButton = driver.findElement(By.name("login"));
        logInButton.click();
    }

    public static void testCase2() throws InterruptedException {
        //Codes for Test Case 2 Activity - We can call this method later in the main method by its name.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);//Thread.sleep may also give browser some time to look for the data.
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Automate");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Automate");
        Thread.sleep(2000);
        WebElement emailField = driver.findElement(By.name("reg_email__"));
        emailField.sendKeys("Automate");
        Thread.sleep(2000);
        WebElement passWord = driver.findElement(By.name("reg_passwd__"));
        passWord.sendKeys("Automate");
        Thread.sleep(2000);
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

    }

    public static void main(String[] args) throws InterruptedException {
        //testCase1();
        testCase2();
    }
}
