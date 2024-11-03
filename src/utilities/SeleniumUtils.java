package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtils {

    /**
     * This method will allow mouse/cursor to move to an element.
     * @param driver
     * @param elementToMoveTo
     */
    public static void moveToElement(WebDriver driver, WebElement elementToMoveTo){
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToMoveTo);
    }

    /**
     * This method will perform double click.
     * @param driver
     * @param elementToDoubleClick
     */
    public static void doubleClickElement(WebDriver driver, WebElement elementToDoubleClick){
        Actions actions = new Actions(driver);
        actions.doubleClick(elementToDoubleClick);
    }

    /**
     * This method will select an element by value from a dropdown.
     * @param element
     * @param valueToSelect
     */
    public static void selectByValueFromDropdown(WebElement element, String valueToSelect){
        Select select = new Select(element);
        select.selectByValue(valueToSelect);
    }

    /**
     * This method will move one element(source) to another element(target).
     * @param driver
     * @param source
     * @param target
     */
    public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    /**
     * This method will refresh a page.
     * @param driver
     */
    public static void refreshPage(WebDriver driver){
        driver.navigate().refresh();
    }
}


