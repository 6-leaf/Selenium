package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _01_FramesDemo {
    public static void main(String[] args) {
        setUp("http://www.uitestpractice.com/Students/Switchto");

        WebElement element = driver.findElement(By.xpath("//p[contains(text(),\"©\")]"));
        System.out.println(element.getText());

        //switchTo() by index
        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("John");

        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),\"©\")]")).getText());

        //switchTo() by name or id
        driver.switchTo().frame("iframe_a");
        textBox.sendKeys("Rose");

        driver.switchTo().defaultContent();

        //switchTo() by Web element
        WebElement frame = driver.findElement(By.cssSelector("iframe[src='/Demo.html']"));
        driver.switchTo().frame(frame);
        textBox.sendKeys("Wick");


        tearDown();
    }
}
