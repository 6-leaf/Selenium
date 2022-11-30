package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class hm {

    static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> colors = driver.findElements(By.name("color"));
        
        for (WebElement color : colors){
            String value = color.getAttribute("value");
            if (value.equalsIgnoreCase("Yellow") || value.equalsIgnoreCase("orange")){
                color.click();
                System.out.println("value = " + value);
            }
        }

        Thread.sleep(2000);
        driver.close();
    }
}
