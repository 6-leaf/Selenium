package Class14;

import org.openqa.selenium.By;

import java.util.Set;

import static utils.BaseClass.*;

public class _04_Task {

    /**
     *  Task: Go to this URL: https://the-internet.herokuapp.com/windows
     *     1. Identify and print parent window ID and Title
     *     2. Click on the link where it says 'Click Here' three times
     *     3. Switch to new tabs and print their title to the console as well.
     *          Bonus: Load facebook website in all children pages.
     */
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/windows");

        String parentWindowId = driver.getWindowHandle();
        String mainWindowTitle = driver.getTitle();
        System.out.println("Parent Window Id: " + parentWindowId + " ; Title: " + mainWindowTitle);

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.linkText("Click Here")).click();
        }
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.contains(parentWindowId)) {
                driver.switchTo().window(window).get("https://www.facebook.com");
                System.out.println(driver.getTitle());
            }

        }


        tearDown();
    }

}
