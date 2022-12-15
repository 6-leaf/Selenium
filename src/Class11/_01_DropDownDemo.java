package Class11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

import static utils.BaseClass.*;

public class _01_DropDownDemo {
    public static void main(String[] args) {
        setUp(); //https://selenium08.blogspot.com/2019/11/dropdown.html

        List<WebElement> elements = driver.findElements(By.cssSelector("*[name='country'] option "));

        elements.forEach(country-> System.out.println(country.getText()));
        System.out.println("Total Count of Countries: " + elements.size());

        //Using Select class which is provided by Selenium
        System.out.println("--- Select Class ---");

        WebElement countryDD = driver.findElement(By.cssSelector("*[name='country']"));
        Select select = new Select(countryDD);
        List<WebElement> options = select.getOptions();
//        options.forEach(k-> System.out.println(k.getText()));
//        int size = select.getOptions().size();
//        System.out.println("size = " + size);


//        elements.forEach(country-> country.click());
        for (WebElement country : options) {
            country.click();
            if (country.getText().equals("Italy")){
                country.click();break;
            }
        }


        WebElement monthDD = driver.findElement(By.cssSelector("*[name='Month']"));
        Select month = new Select(monthDD);
        System.out.println("Month is Multiple: " + month.isMultiple());

        tearDown();
    }
}
