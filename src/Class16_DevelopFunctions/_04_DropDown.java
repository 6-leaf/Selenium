package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;


public class _04_DropDown {
    public static void main(String[] args) {
        setUp("https://vitalets.github.io/combodate/");

        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        WebElement monthDD = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        WebElement yearDD = driver.findElement(By.xpath("(//select[@class='year '])[1]"));

        selectDdValue(dayDD, "15");
        selectDdValue(monthDD, "Apr");
        selectDdValue(yearDD, "2014");

        List<WebElement> daysDD = driver.findElements(By.xpath("(//select[@class='day '])[1]/option"));
        selectDdValue(daysDD, "17");


        tearDown();
    }
}
