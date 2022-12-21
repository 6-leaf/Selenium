package Class12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01_AlertDemo {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");

        //Handling Simple Alert
        WebElement simpleAlert = driver.findElement(By.cssSelector("input[id='simple']"));
        simpleAlert.click();

//        WebElement search = driver.findElement(By.xpath("//div[text()='Search']"));
//        search.click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        //Handling Confirmation Alert
        driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();

        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.accept();


        //Handling Promt Alert

        driver.findElement(By.cssSelector("button#prompt")).click();

        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("John");
        promptAlert.accept();

        String enteredText = driver.findElement(By.xpath("//div[contains(text(), 'Hello John')]")).getText();

        String expectedText = "Johnn";
        if (enteredText.contains(expectedText))
            System.out.println("Text added successfully. Test passed");
        else
            System.err.println("Test failed");


        tearDown();
    }
}
