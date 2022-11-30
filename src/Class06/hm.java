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
            String colorName = color.getAttribute("value");
//            if (colorName.equalsIgnoreCase("Yellow") || colorName.equalsIgnoreCase("orange")){
//                color.click();
//                System.out.println("Color Name = " + colorName);
//            }

            while (colorName.equalsIgnoreCase("Yellow") || colorName.equalsIgnoreCase("orange")){
                color.click();
                System.out.println("Color Name = " + colorName);
                break;
            }
        }

        Thread.sleep(2000);
        driver.close();
    }
}
