package Day6_SeleniumFunctions_Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTables {

    public static void tableExample1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.eviltester.com/styled/tag/table.html");
        //identifying the entire table
        WebElement table = driver.findElement(By.xpath("//div[@id='tablehere']"));
        System.out.println(table.getText());
        //identifying the cell within the table
        WebElement cell = driver.findElement(By.xpath("//td[text()='Bob']"));
        System.out.println(cell.getText());
        Thread.sleep(2000);
        driver.quit();
    }

    public static void tableExample2() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.eviltester.com/styled/tag/table.html");
        java.util.List<WebElement> tableHeaders = driver.findElements(By.xpath("//th"));
        for(WebElement header :tableHeaders){
            System.out.println(header.getText());
        }
        System.out.println("--------------------------------");
        java.util.List<WebElement> tableData = driver.findElements(By.xpath("//td"));
        for(WebElement table :tableData){
            System.out.println(table.getText());
        }
        driver.quit();
    }

    public static void tableExample3(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testpages.eviltester.com/styled/tag/table.html");
        java.util.List<WebElement> tableRows = driver.findElements(By.xpath("//tr"));
        System.out.println(tableRows.get(0).getText());//printing with the exact index of the row
        System.out.println(tableRows.get(1).getText());
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        //tableExample1();
        //tableExample2();
        tableExample3();
    }
}
