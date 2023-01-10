package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _03_HM_ExplicitWait {
    public static void main(String[] args) {
        setUp("http://uitestpractice.com/students/contact");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try{
            driver.findElement(By.linkText("This is a Ajax link")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ContactUs")));
            WebElement element = driver.findElement(By.cssSelector("div.ContactUs"));
            System.out.println(element.getText());
        }catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found");
        }

        tearDown();
    }
}
