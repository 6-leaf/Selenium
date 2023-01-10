package utils;

import org.openqa.selenium.WebElement;

import java.util.Set;

import static utils.BaseClass.driver;

public class CommonMethods {

    /**
     * Method will switch focus to next window/tab based on the window title and Set of titles
     * @param windowTitle String
     * @param windows Set of String
     */
    public static void switchToWindow(String windowTitle, Set<String> windows) {
        for (String window : windows) {
            String title = driver.switchTo().window(window).getTitle();
            if (title.contains(windowTitle))
                System.out.println("Window is found: " + driver.getTitle() + "\nURL is: " + driver.getCurrentUrl());
        }
    }

    /**
     * Method will switch focus to next window/tab based on the window title
     * @param windowTitle String
     */
    public static void switchToWindow(String windowTitle) {
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            String title = driver.switchTo().window(window).getTitle();
            if (title.contains(windowTitle))
                System.out.println("Window is found: " + driver.getTitle() + "\nURL is: " + driver.getCurrentUrl());
        }
    }

    /**
     * Send text to WebElement
     * @param element WebElement
     * @param value String
     */
    public static void sendText(WebElement element, String value){
        element.sendKeys(value);
    }
}
