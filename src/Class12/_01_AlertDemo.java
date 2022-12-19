package Class12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01_AlertDemo {
    public static void main(String[] args) {
        setUp();  //https://selenium08.blogspot.com/2019/07/alert-test.html

        WebElement simpleAlert = driver.findElement(By.cssSelector("input[id='simple']"));
        simpleAlert.click();

        WebElement search = driver.findElement(By.xpath("//div[text()='Search']"));
        search.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


        tearDown();
    }
}
