package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static utils.BaseClass.*;

public class _02_HM_ImplicitWait {
    public static void main(String[] args) {
        setUp("http://uitestpractice.com/students/contact");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        try{
            driver.findElement(By.linkText("This is a Ajax link")).click();
            WebElement element = driver.findElement(By.cssSelector("div.ContactUs"));
            System.out.println(element.getText());
        }catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found");
        }

        tearDown();
    }
}
