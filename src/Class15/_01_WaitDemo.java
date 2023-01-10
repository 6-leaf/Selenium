package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utils.BaseClass.*;

public class _01_WaitDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));  //new way
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //old way

        try {
            driver.findElement(By.xpath("//button[text()='Start']")).click();
            WebElement helloWorld = driver.findElement(By.cssSelector("div#finish h4"));
            System.out.println(helloWorld.getText());
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Element is not found");
        }





        tearDown();
    }
}
