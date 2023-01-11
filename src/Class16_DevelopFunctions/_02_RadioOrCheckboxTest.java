package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _02_RadioOrCheckboxTest {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");

        List<WebElement> colorList = driver.findElements(By.name("color"));
        List<WebElement> browserList = driver.findElements(By.name("browser"));

//        for (WebElement color : colorList) {
//            String colorValue = color.getAttribute("value");
//            if (colorValue.equalsIgnoreCase("Green")){
//                color.click();break;
//            }
//        }

        clickRadioOrCheckBox(colorList, "value", "YELLOW");
        clickRadioOrCheckBox(browserList, "value", "mozilla");


        tearDown();
    }
}
