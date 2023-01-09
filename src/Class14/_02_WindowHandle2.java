package Class14;

import org.openqa.selenium.WindowType;
import utils.ConfigsReader;

import java.util.Set;

import static utils.BaseClass.*;

public class _02_WindowHandle2 {
    public static void main(String[] args) {
        setUp("https://www.google.com");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Id : " + parentWindow);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://about.google");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://store.google.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.exelenter.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");


        Set<String> allWindows = driver.getWindowHandles();
        allWindows.forEach(System.out::println);

        switchToWindow(ConfigsReader.getProperties("expectedTitle"), allWindows);

        tearDown();
    }

    public static void switchToWindow(String windowTitle, Set<String> windows) {
        for (String window : windows) {
            String title = driver.switchTo().window(window).getTitle();
            if (title.contains(windowTitle))
                System.out.println("Window is found: " + driver.getTitle() + "\nURL is: " + driver.getCurrentUrl());
        }

    }
}
