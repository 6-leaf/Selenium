package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _03_DropdownTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        List<WebElement> months = driver.findElements(By.cssSelector("select[name=Month] option"));

        for (WebElement month : months) {
            String actualMonth = month.getAttribute("value");
            if (actualMonth.equalsIgnoreCase("June")){
                month.click();break;
            }
        }

        selectDdValue(months, "value", "Sept");

        tearDown();
    }
}
