package Class14;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _03_WindowHandle {
    public static void main(String[] args) {
        setUp("https://demoqa.com/browser-windows");

        String parentWindow = driver.getWindowHandle();

        for (int i = 0; i < 3; i++) {
//            driver.findElement(By.id("tabButton")).click();
            driver.findElement(By.id("windowButton")).click();
        }

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            driver.get("https://www.google.com");
            System.out.println("Window ID: " + window + " ; Title: " + driver.getTitle());
        }

        System.out.println("=== With Iterator ===");

        Iterator<String> iterator = allWindows.iterator();

        while (iterator.hasNext()){
            String window1 = iterator.next();
            driver.switchTo().window(window1);
            System.out.println("Window ID: " + window1 + " ; URL: " + driver.getCurrentUrl());
        }


        tearDown();
    }
}
