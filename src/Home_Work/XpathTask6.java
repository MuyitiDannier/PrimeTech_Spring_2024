package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.primetech-apps.com/practice/select-menu");
        Thread.sleep(2000);
        WebElement favLanguageDropdown = driver.findElement(By.xpath("//select[@id='language' and @class='form-select form-select-lg mb-3']"));
        favLanguageDropdown.click();
        Thread.sleep(1000);
        WebElement uyghurOption = driver.findElement(By.xpath("//option[@value='Uyghur']"));
        uyghurOption.click();
        Thread.sleep(1000);
        WebElement favCityDropdown = driver.findElement(By.xpath("//select[@class='form-select form-select-sm' and @aria-label='.form-select-sm example']"));
        favCityDropdown.click();
        Thread.sleep(1000);
        WebElement newYorkOption = driver.findElement(By.xpath("//option[@value='New York']"));
        newYorkOption.click();
        Thread.sleep(3000);
        driver.close();


    }
}
