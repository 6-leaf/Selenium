package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _02_FrameDemo2 {
    public static void main(String[] args) {
        setUp("https://ui.vision/demo/webtest/frames/");

        //How to know how many links (or frames) in a given webpage

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());

        List<WebElement> allFrames = driver.findElements(By.tagName("frame"));
        System.out.println(allFrames.size());

        List<WebElement> alliFrame = driver.findElements(By.tagName("iframe"));
        System.out.println(alliFrame.size());


        //switching to Frame1
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_1.html']")));
        driver.findElement(By.name("mytext1")).sendKeys("John");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_5.html']")));
        driver.findElement(By.name("mytext5")).sendKeys("Wick");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_3.html']")));



        tearDown();
    }
}
