package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _03_DD_Multiple {
    public static void main(String[] args) {
        setUp(); //https://selenium08.blogspot.com/2019/11/dropdown.html
        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select month = new Select(months);

        List<WebElement> totalMonths = month.getOptions();
        System.out.println("totalMonths.size() = " + totalMonths.size());

        //Task: Print all months

        //1st way
        for (WebElement monthList : totalMonths ){
            System.out.println(monthList.getText());
        }

        //2nd way
        totalMonths.forEach(m -> System.out.println(m.getText()));

        //3rd way
        Iterator<WebElement> it = totalMonths.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getText());
        }

        //Task: Print only a specific (selected) months from list.
        //1st way
//        for (WebElement monthList : totalMonths ){
//            if (monthList.getText().equals("March")
//                    ||monthList.getText().equals("September")
//                    ||monthList.getText().equals("May")){
//                monthList.click();
//            }
//        }
        //2nd way
        if (month.isMultiple()){
            month.selectByIndex(3);
            month.selectByVisibleText("May");
            month.selectByValue("Sept");
        }

        tearDown();
    }
}
