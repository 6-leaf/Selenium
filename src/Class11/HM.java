package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class HM {
    public static void main(String[] args) {
        setUp();

        driver.findElement(By.partialLinkText("Checkboxes")).click();

        WebElement chkbx1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement chkbx2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));


        System.out.println(chkbx1.isDisplayed() ? "Checkbox 1 is displayed" : "Checkbox 1 is not displayed");
        System.out.println(chkbx2.isDisplayed() ? "Checkbox 2 is displayed" : "Checkbox 2 is not displayed");

        System.out.println(chkbx1.isEnabled() ? "Checkbox 1 is enabled" : "Checkbox 1 is not enabled");
        System.out.println(chkbx2.isEnabled() ? "Checkbox 2 is enabled" : "Checkbox 2 is not enabled");

        System.out.println(chkbx1.isSelected() ? "Checkbox 1 is selected" : "Checkbox 1 is not selected");
        System.out.println(chkbx2.isSelected() ? "Checkbox 2 is selected" : "Checkbox 2 is not selected");


        tearDown();


    }
}
