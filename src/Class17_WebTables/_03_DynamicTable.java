package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import java.util.List;

import static utils.BaseClass.*;

public class _02_DynamicTable {
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

        System.out.println("\n==== Getting rows without header ====\n");

        for (int i = 1; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
        }

        List<WebElement> columns = driver.findElements(By.cssSelector("table.SampleTable tbody tr th"));
        System.out.println("\nNumber of columns : " + columns.size());


        tearDown();
    }
}
