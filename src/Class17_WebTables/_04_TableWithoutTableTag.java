package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _04_TableWithoutTableTag {
    public static void main(String[] args) {
        setUp("https://demoqa.com/webtables");

        List<WebElement> columns = driver.findElements(By.cssSelector("div.rt-resizable-header-content"));
        System.out.println("Number of columns : " + columns.size());
        columns.forEach(k-> System.out.println(k.getText()));

        List<WebElement> rows = driver.findElements(By.cssSelector("div.rt-tr-group"));
        System.out.println("Number of Rows : " + rows.size());

        int counter=0;
        for (WebElement row : rows) {
            if (!row.getText().isBlank())
                counter++;
        }
        System.out.println("Total of non-blank rows : " + counter);


        WebElement addNewRecordButton = driver.findElement(By.id("addNewRecordButton"));
        addNewRecordButton.click();


        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement salary = driver.findElement(By.id("salary"));
        WebElement department = driver.findElement(By.id("department"));

        String fname="John", lname="Smith";

        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        userEmail.sendKeys(fname + "." + lname + "@gmail.com");
        age.sendKeys("25");
        salary.sendKeys("99999");
        department.sendKeys("HR");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        tearDown();
    }
}
