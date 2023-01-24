package Class18_Calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _02_ExpediaCalendar {
    public static void main(String[] args) {
        setUp("https://www.expedia.com/Flights");

        WebElement departingDate = driver.findElement(By.className("uitk-fake-input uitk-form-field-trigger"));
        departingDate.click();


        tearDown();
    }
}
