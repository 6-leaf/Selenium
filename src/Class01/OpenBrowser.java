package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        // 1. Establish a connection with the drivers
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        
        // 2. Open the browser using the ChromeDriver's class constructor
        WebDriver driver = new ChromeDriver(); // Launch browser for us

        // 3. Navigate to Google website
        driver.get("https://google.com");

        //4. Retrieve the title of the current website and store it in a String
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        System.out.println("Current URL = " + driver.getCurrentUrl());

        driver.quit();
    }
}
