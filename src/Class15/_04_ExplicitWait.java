package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _04_ExplicitWait {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.findElement(By.cssSelector("button.dropbtn")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
            driver.findElement(By.linkText("Facebook")).click();
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Element is not found");
        }

        tearDown();
    }
}
