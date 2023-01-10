package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _06_FluentWait {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com/");

        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(15));
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        fluentWait.ignoring(NoSuchElementException.class);

        driver.findElement(By.cssSelector("button.dropbtn")).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));


        driver.findElement(By.linkText("Facebook")).click();


        tearDown();
    }
}
