package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _01_WebTableDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/tables");

        List<WebElement> tableRows = driver.findElements(By.cssSelector("table#table1 tbody tr"));
        System.out.println("Number of Rows : " + tableRows.size());

        System.out.println("\n==== Print Rows ===");
        Iterator<WebElement> iterator = tableRows.iterator();
        while (iterator.hasNext()){
            WebElement row = iterator.next();
            System.out.println(row.getText());
        }

        System.out.println("\n==== Print Rows in Another Way ===");
        for (WebElement tableRow : tableRows) {
            System.out.println(tableRow.getText());
        }

        System.out.println("\n==== Print Number of Columns ===");
        List<WebElement> tableColumns = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number of Columns : " + tableColumns.size());



        tearDown();
    }
}
