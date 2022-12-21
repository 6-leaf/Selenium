package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.ConfigsReader;

import java.util.List;

import static utils.BaseClass.*;

/*
HW: Check if 'United States of America' is present in the CountryDD,
         if it is (or not) then print the result to the console and stop the search(exit loop).
 */

public class HM_Countries {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(countryDD);

        //1st way
        List<WebElement> countryList = select.getOptions();

        for (WebElement country : countryList) {
            country.click();
            if (country.getText().equals(ConfigsReader.getProperties("country"))){
                country.click();break;
            }
        }

        //2nd way
        select.selectByVisibleText("United States of America");


        tearDown();
    }
}
