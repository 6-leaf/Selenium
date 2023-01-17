package Class16_DevelopFunctions;

import org.openqa.selenium.By;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;


public class _05_AlertTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");

        driver.findElement(By.id("simple")).click();
        System.out.println(getAlertText());
        acceptAlert();
        waitInSeconds(2);

        driver.findElement(By.id("confirm")).click();
        waitInSeconds(1);
        System.out.println(getAlertText());
        dismissAlert();

        waitInSeconds(2);
        driver.findElement(By.id("prompt")).click();
        waitInSeconds(1);
        sendAlertText("john");
        System.out.println(getAlertText());
        acceptAlert();


        waitInSeconds(2);


        tearDown();
    }
}
