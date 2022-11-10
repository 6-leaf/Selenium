package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        //new tab
//        driver.switchTo().newWindow(WindowType.TAB);

        //new window
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.quit();

    }
}
