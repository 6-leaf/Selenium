package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_2 {

    private static String url = "https://formstone.it/components/checkbox/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement chkbox3 = driver.findElement(By.cssSelector("input#checkbox-3"));
        System.out.println("Is checkbox3 enabled? : " + chkbox3.isEnabled());

        WebElement chkbox1 = driver.findElement(By.cssSelector("input#checkbox-1"));
        System.out.println("Is checkbox1 selected? : " + chkbox1.isSelected());


        Thread.sleep(2000);
        driver.close();
    }
}
