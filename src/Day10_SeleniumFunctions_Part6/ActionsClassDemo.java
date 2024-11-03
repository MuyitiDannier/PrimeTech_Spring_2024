package Day10_SeleniumFunctions_Part6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static void doubleClickExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        //To Double Click on Element
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='ondoubleclick']"));
        Actions action1 = new Actions(driver);
        action1.doubleClick(doubleClickButton).build().perform();//Recommended Way.
    }

    public static void dragAndDropExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
        Thread.sleep(2000);
        WebElement from = driver.findElement(By.xpath("//div[@id='draggable1']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='droppable1']"));
        Actions action2 = new Actions(driver);
        action2.dragAndDrop(from, to).build().perform();
        Thread.sleep(2000);
        WebElement from2 = driver.findElement(By.xpath("//div[@id='draggable2']"));
        WebElement to2 = driver.findElement(By.xpath("//div[@id='droppable2']"));
        //action2.dragAndDrop(from2, to2).build().perform();//Option 1;
        action2.clickAndHold(from2).moveToElement(to2).release().build().perform();//Option 2 - Click and hold.
    }

    public static void onContextExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        Thread.sleep(2000);
        WebElement onContextButton = driver.findElement(By.xpath("//button[@id='oncontextmenu']"));
        Actions action3 = new Actions(driver);
        action3.contextClick(onContextButton).build().perform();
    }

    public static void onMouseOverExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        Thread.sleep(2000);
        WebElement onMouseOver = driver.findElement(By.xpath("//button[@id='onmouseover']"));
        Actions action3 = new Actions(driver);
        action3.moveToElement(onMouseOver).build().perform();
    }

    public static void onMouseLeaveExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        Thread.sleep(2000);
        WebElement onMouseLeave = driver.findElement(By.xpath("//button[@id='onmouseleave']"));
        Actions action3 = new Actions(driver);
        //action3.moveToElement(onMouseLeave).build().perform();
        WebElement blankSpace = driver.findElement(By.xpath("//html"));
        //action3.moveToElement(blankSpace).build().perform();
        action3.moveToElement(onMouseLeave).moveToElement(blankSpace).build().perform();//moveToElement can keep moving to multiple elements.
    }

    public static void scrollToExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        Thread.sleep(2000);
        WebElement onMouseOver = driver.findElement(By.xpath("//button[@id='onmouseover']"));
        Actions action3 = new Actions(driver);
        action3.scrollToElement(onMouseOver).build().perform();
    }

    public static void main(String[] args) throws InterruptedException {
        //doubleClickExample();
        //dragAndDropExample();
        //onContextExample();
        //onMouseOverExample();
        //onMouseLeaveExample();
        scrollToExample();
    }
}
