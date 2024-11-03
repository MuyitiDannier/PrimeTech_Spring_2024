package Day11_SeleniumUtilitiesAndFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
    //Usually, utility methods are static because they do not need a separate instance everytime to call them;
    //they can just be called using Class Name.
    public static void moveToElement(WebDriver driver, WebElement elementToMoveTo){
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToMoveTo);
    }

    public static void doubleClickElement(WebDriver driver, WebElement elementToDoubleClick){
        Actions actions = new Actions(driver);
        actions.doubleClick(elementToDoubleClick);
    }

    public static void testCase1(){
        WebDriver driver = new ChromeDriver();
        driver.get("");
        WebElement element = driver.findElement(By.xpath("//"));
        moveToElement(driver, element);
        doubleClickElement(driver, element);
    }

    public static void selectElementByValue(WebElement element, String valueToSelect){
        Select select = new Select(element);
        select.selectByValue(valueToSelect);
    }

    public static void dragAndDropExercise(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/drag-and-drop");
        WebElement element1 = driver.findElement(By.xpath("//a[@id='text']"));
        WebElement element2 = driver.findElement(By.xpath("//a[@id='textarea']"));
        WebElement element3 = driver.findElement(By.xpath("//a[@id='textarea']"));
        WebElement droppingArea = driver.findElement(By.xpath("//div[@id='dropzone']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(element1, droppingArea).build().perform();
        actions.dragAndDrop(element2, droppingArea).build().perform();
        actions.dragAndDrop(element3, droppingArea).build().perform();
    }

    public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    public static void main(String[] args) {

    }
}
