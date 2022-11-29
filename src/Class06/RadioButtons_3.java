package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons_3 {

    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> browsers = driver.findElements(By.xpath("//input[@name='browser']"));

        int browserCount = browsers.size();
        System.out.println("browserCount = " + browserCount);

        for (int i = 0; i < browsers.size(); i++) {
            System.out.println((i + 1) + "." + browsers.get(i).getAttribute("value"));
        }

        System.out.println("=====================================");

        int count = 1;
        for (WebElement element : browsers){
            System.out.println(count + "." + element.getAttribute("value"));
            count++;
        }

        System.out.println("=====================================");

        //Select only elements which are enabled, but not selected

        for (WebElement element : browsers){
            if (element.isEnabled() && !element.isSelected()){
                System.out.println("element = " + element.getAttribute("value"));
            }
        }

        //when find Opera select it.
        for (WebElement element : browsers){
            if (element.getAttribute("value").equalsIgnoreCase("Opera")){
                element.click();break;
            }
        }

        Thread.sleep(2000);
        driver.close();
    }
}
