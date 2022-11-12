package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    1. Open the chrome browser
    2. Navigate to “https://www.exelenter.com/"
    3. Navigate to “https://www.google.com/"
    4. Navigate back to Exelenter Page
    5. Refresh the current page
    6. Verify URL contains word “exelenter”
    7. Close the browser
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.exelenter.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().refresh();

        String actualURL = driver.getCurrentUrl();
        String expexted = "Exelenter";

        if (actualURL.contains(expexted.toLowerCase())){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}
