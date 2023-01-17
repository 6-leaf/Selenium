package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.clickButWaitForClickable;
import static utils.CommonMethods.clickRadioOrCheckBox;

public class _02_RadioOrCheckboxTest2 {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/radio-button");

        WebElement noRadioBtn = driver.findElement(By.id("noRadio"));
        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));

//        clickRadioOrCheckBox(noRadioBtn);
        clickRadioOrCheckBox(yesRadioBtn);




        tearDown();
    }
}
