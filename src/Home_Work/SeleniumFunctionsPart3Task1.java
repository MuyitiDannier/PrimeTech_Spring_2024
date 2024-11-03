package Home_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SeleniumFunctionsPart3Task1 {

    public static void Solution1(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='drop1' and @name='SiteMap' and @class='combobox']"));
        System.out.println(selectDropdown.isSelected());
        Select selectItem = new Select(selectDropdown);
        System.out.println(selectItem.getFirstSelectedOption().getText());
        System.out.println(selectDropdown.isSelected());
        List<WebElement> allOptions = selectItem.getOptions();
        ArrayList<String> allOptionsArrayList = new ArrayList<>();
        allOptionsArrayList.add("Older Newsletters");
        allOptionsArrayList.add("doc 1");
        allOptionsArrayList.add("doc 2");
        allOptionsArrayList.add("doc 3");
        allOptionsArrayList.add("doc 4");
        for(int i=0; i<=allOptions.size()-1; i++){
            String textOfAllOptions = allOptions.get(i).getText();
            System.out.println(textOfAllOptions);
            if(textOfAllOptions.equals(allOptionsArrayList)){
                System.out.println("match");
            }
        }
        //System.out.println(allOptions.equals(allOptionsArrayList));//Cannot compare element to String.

    }

    public static void Solution2(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://omayo.blogspot.com/");
        WebElement selectDropdown = driver.findElement(By.xpath("//select[@id='drop1' and @name='SiteMap' and @class='combobox']"));
        System.out.println(selectDropdown.isSelected());
        Select selectItem = new Select(selectDropdown);
        selectItem.selectByIndex(0);
        System.out.println(selectDropdown.isSelected());//isSelected Method works with check boxes.
        List<WebElement> allOptions = selectItem.getOptions();
        for(WebElement eachOptions : allOptions){
            System.out.println(eachOptions.getText());
            int i=1;
            if (eachOptions.getText() == "doc"+i){
                System.out.println("List matches the requirement.");
            }else{
                System.out.println("List does not match the requirement.");
            }
        }
    }

    public static void Solution3(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='drop1']"));
        Select select = new Select(dropDown);
        WebElement defaultSelected = select.getFirstSelectedOption();
        System.out.println(defaultSelected.getText());
        System.out.println("-------------------------");
        List<WebElement> list = select.getOptions();
        List<String> actualListOfDropDownFromUI = new ArrayList<>();
        for (WebElement element : list){
            String textOfTheDropDown = element.getText();
            System.out.println(textOfTheDropDown);//printing the text of the element
            actualListOfDropDownFromUI.add(textOfTheDropDown);//we adding the text of the element into the array
        }

        select.selectByValue("def"); //selecting a different value than the default one


        //All options that are coming from requirement document
        List<String> expectedListOfDropDowns = List.of("Older Newsletters","doc 1","doc 2","doc 3","doc 4");

        for (int i = 0; i < expectedListOfDropDowns.size() ; i++) {
            if (expectedListOfDropDowns.get(i).equals(actualListOfDropDownFromUI.get(i))){
                System.out.println("Option " + i + " is matching");
            }else{
                System.out.println("Option " + i + " is not matching" +
                        " Actual Options is["+ actualListOfDropDownFromUI.get(i) + "] vs the Expected [" +
                        expectedListOfDropDowns.get(i) +"]");
            }
        }
    }

    public static void main(String[] args)  {
        //Solution1();
        //Solution2();
        Solution3();
        //Questions:
        //Is Select didn't work, even with the index(0), which is the name of the select button;
        //Even with an ArrayList with exact values from UI, still showing false.
    }
}
