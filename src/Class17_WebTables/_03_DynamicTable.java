package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import java.util.List;

import static utils.BaseClass.*;

public class _03_DynamicTable {
    public static void main(String[] args) {
        setUp("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));

        username.sendKeys(ConfigsReader.getProperties("username"));
        password.sendKeys(ConfigsReader.getProperties("password"));
        login.click();


        List<WebElement> rows = driver.findElements(By.cssSelector("table.SampleTable tbody tr"));
        System.out.println("number of Rows : " + rows.size());

        String expectedValue = "Charles Dodgeson";
        List<WebElement> actualValues = driver.findElements(By.cssSelector("table.SampleTable tbody tr td:nth-child(2)"));

        WebElement deleteBtn = driver.findElement(By.id("ctl00_MainContent_btnDelete"));

        for (int i = 1; i < actualValues.size(); i++) {
            if (actualValues.get(i).getText().equalsIgnoreCase(expectedValue)){
                driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i+1) + "]")).click();
                deleteBtn.click();break;
            }
        }



//        tearDown();
    }
}
