package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
/*
HW: Checkboxes & Radio Buttons
1. Go to https://the-internet.herokuapp.com/
2. Find the Checkboxes link, click on it
3. Once you are on the Checkboxes homepage you will see two Checkboxes:
      - checkbox 1
      - checkbox 2

4. Using your Selenium knowledge. Please check and verify if each checkbox is:
        1. isDisplayed (True or False) ?
        2. isEnabled (T or F) ?
        3. isSelected (T or F) ?

5. Print the results to the console.
6. Exit the browser.
 */

public class HM_DifferentSolution {
    public static void main(String[] args) {
        setUp(); //https://the-internet.herokuapp.com/

        WebElement checkboxes = driver.findElement(By.linkText("Checkboxes"));
        checkboxes.click();

        List<WebElement> chkbx = driver.findElements(By.cssSelector("*[type='checkbox']"));

        int chkbxNumber = 1;
        for (WebElement ch : chkbx){
            System.out.println(ch.isDisplayed() ? "Checkbox " + chkbxNumber + " is displayed"
                    : "Checkbox " + chkbxNumber + " is not displayed" );
            System.out.println(ch.isEnabled() ? "Checkbox " + chkbxNumber + " is enabled"
                    : "Checkbox " + chkbxNumber + " is not enabled" );
            System.out.println(ch.isSelected() ? "Checkbox " + chkbxNumber + " is selected"
                    : "Checkbox " + chkbxNumber + " is not selected" );
            System.out.println("============================================");
            chkbxNumber++;
        }

        tearDown();
    }
}
