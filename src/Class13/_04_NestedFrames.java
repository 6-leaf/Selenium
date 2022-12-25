package Class13;

import org.openqa.selenium.By;

import static utils.BaseClass.*;

public class _04_NestedFrames {
    public static void main(String[] args) {
        setUp("https://ui.vision/demo/webtest/frames/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src=\"frame_3.html\"]")));

        driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("john");

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src*='doc']")));
        System.out.println(driver.findElement(By.cssSelector("div[class*='F9yp7e']")).getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src=\"frame_4.html\"]")));

        driver.findElement(By.cssSelector("input[name='mytext4']")).sendKeys("john");


        tearDown();
    }
}
