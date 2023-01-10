package Class14;

import org.openqa.selenium.WindowType;
import utils.ConfigsReader;

import java.util.Set;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _02_WindowHandle2_Refactored {
    public static void main(String[] args) {
        setUp("https://www.google.com");

        String parentWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://about.google");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://store.google.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.exelenter.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");


        Set<String> allWindows = driver.getWindowHandles();

        switchToWindow(ConfigsReader.getProperties("expectedTitle"), allWindows);
        switchToWindow("Exelenter");

        tearDown();
    }


}
