package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static utils.BaseClass.*;

public class _04_DD_ArrayList {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select monthS = new Select(months);

        List<WebElement> totalMonths = monthS.getOptions();
        System.out.println("totalMonths.size() = " + totalMonths.size());

        //This is the list we are given for test case, required by the company/project.
        //Let's assume the customer wants to see these mentioned months in the application
        List<String> expectedMonths = new ArrayList<>();
        expectedMonths.add("July");
        expectedMonths.add("May");
        expectedMonths.add("October");

        List<String> actualMonths = new ArrayList<>();
        for (WebElement month : totalMonths) {
            actualMonths.add(month.getText());
        }

        if (actualMonths.containsAll(expectedMonths)){
            System.out.println("The list does match. Test passed");
        }else{
            System.out.println("The list does NOT match. Test failed");
        }

        tearDown();
    }
}
