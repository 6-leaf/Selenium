package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
    TC 4.3: Print visible links from the Exelenter Homepage
     1. Open the Chrome browser
     2. Go to Exelenter Website
     3. Iterate through the links until you find "Enroll Now"
     4. Once expected keyword is found, print it and exit
     5. Close the browser
 */
public class Task2 {

    static String url = "https://www.exelenter.com";
    static String wantedLink = "Enroll Now";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

        for (WebElement link : listOfLinks){
            if (link.getText().equalsIgnoreCase(wantedLink)){
                System.out.println("link found : " + link.getText());break;
            }
        }


        Thread.sleep(2000);
        driver.close();

    }
}
