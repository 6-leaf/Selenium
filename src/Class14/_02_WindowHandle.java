package Class14;

import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _02_WindowHandle {
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

        System.out.println("How many tabs open : " + allWindows.size());


       // Let's iterate thorough all windows/tabs
        Iterator<String> iterator = allWindows.iterator();

        int count = 1;
        while (iterator.hasNext()){
            String window = iterator.next();
            System.out.println(window);
            driver.switchTo().window(window);
            String title = driver.getTitle();
            System.out.println("Window " + count + " title is : " + title);
            System.out.println("============================");
            count++;

            if (title.contains("Exelenter")){
                System.out.println("Switched to " + driver.getTitle());
                System.out.println(window);
                System.out.println("============================");
            }
        }
        tearDown();
    }
}
