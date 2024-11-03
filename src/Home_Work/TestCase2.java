package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.indeed.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String homeURL = driver.getCurrentUrl();
        System.out.println("This is the Home URL: " +homeURL);
        String homeTitle = driver.getTitle();
        System.out.println("This is the Home Title " +homeTitle);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("SDET");
        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
        searchButton.click();
        Thread.sleep(2000);

        String newSearchURL = driver.getCurrentUrl();
        System.out.println("This is New Home URL: " +newSearchURL);
        String newTitle = driver.getTitle();
        System.out.println("This is New Title: " +newTitle);

        if(!homeURL.equals(newSearchURL) && !homeURL.contains("SDET")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if(!homeTitle.equals(newTitle) && newTitle.toLowerCase().contains("SDET".toLowerCase())){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        driver.close();

    }
}
