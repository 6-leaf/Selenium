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

public class _05_DD_DDMMYYYY_Refactor2 {

    public static void main(String[] args) {
        setUp("https://vitalets.github.io/combodate/");

        findDay(4, "13", "1995");

        tearDown();
    }

    static void findDay(int month, String day, String year){
        WebElement monthDD = driver.findElement(By.xpath("(//select[@class='month ']) [1]"));
        Select selectMonthDD = new Select(monthDD);
        selectMonthDD.selectByIndex(month);
        System.out.println(month);

        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day ']) [1]"));
        Select selectDayDD = new Select(dayDD);
        selectDayDD.selectByVisibleText(day);
        System.out.println(day);

        WebElement yearDD = driver.findElement(By.xpath("(//select[@class='year ']) [1]"));
        Select selectYearDD = new Select(yearDD);
        selectYearDD.selectByValue(year);
        System.out.println(year);
    }
}
