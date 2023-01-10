package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class _05_ImplicitWait {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        try {
            driver.findElement(By.cssSelector("button.dropbtn")).click();
            driver.findElement(By.linkText("Facebook")).click();
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Element is not found");
        }
        
        tearDown();
    }
}
