package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _01_WindowHandleDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/windows");

        /**
         * How to handle new tabs and windows in Selenium?
         * We have 2 methods for handling new tabs//windows.
         *  1. getWindowHandle()    ==> handles main window only
         *  1. getWindowHandles()   ==> handles ALL windows
         */

        String mainWindowTitle = driver.getTitle();
        System.out.println("main Window Title : " + mainWindowTitle);

        String windowHandle = driver.getWindowHandle();         //returns unique ID for main window
        System.out.println("Main Window ID : " + windowHandle);

        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getTitle());
        System.out.println("================================");

        Set<String> allWindows = driver.getWindowHandles();  //returns unique IDs for All windows
        int allOpenWindows = allWindows.size();
        System.out.println("All open windows : " + allOpenWindows);

        System.out.println("================================");

//        allWindows.forEach(System.out::println);

        Iterator<String> iterator = allWindows.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();
        System.out.println("Main Window ID : " + mainWindow);
        System.out.println("Child Window ID : " + childWindow);

        System.out.println("================================");

        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());

        tearDown();
    }
}
