package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;
/*
W: Go to this website https://vitalets.github.io/combodate/
and select your DOB (example: DD/MM/YYYY, "25/04/1985"), and exit the browser
 */

public class _05_DD_DDMMYYYY {
    public static void main(String[] args) {
        setUp();

        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day ']) [1]"));
        Select selectDayDD = new Select(dayDD);
        selectDayDD.selectByVisibleText("16");

        WebElement monthDD = driver.findElement(By.xpath("(//select[@class='month ']) [1]"));
        Select selectMonthDD = new Select(monthDD);
        selectMonthDD.selectByIndex(6);

        WebElement yearDD = driver.findElement(By.xpath("(//select[@class='year ']) [1]"));
        Select selectYearDD = new Select(yearDD);
        selectYearDD.selectByValue("1981");

        //Loop through the dayDD, find a specific date, select it, and print it to the console
        List<WebElement> dayList = selectDayDD.getOptions();
        for (WebElement day : dayList){
            String dayText = day.getText();
            day.click();
            if (dayText.equals("16")){
                System.out.println(dayText);break;
            }

        }



        tearDown();
    }
}
