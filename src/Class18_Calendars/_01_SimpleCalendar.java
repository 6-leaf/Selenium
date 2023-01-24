package Class18_Calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _01_SimpleCalendar {
    public static void main(String[] args) {
        setUp("https://demoqa.com/date-picker");

        WebElement selectDate = driver.findElement(By.id("datePickerMonthYearInput"));
        selectDate.click();

        //select October 17, 1985
        WebElement monthDd = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        selectDdValue(monthDd, "October");

        WebElement yearDd = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
        selectDdValue(yearDd,"2018");

        List<WebElement> dayDd = driver.findElements(By.cssSelector(".react-datepicker__week div"));
        selectDdValue(dayDd, "17");




        tearDown();
    }
}
