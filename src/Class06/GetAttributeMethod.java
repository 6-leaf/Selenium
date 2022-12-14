package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
    private static String url = "https://exelentersdet.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.name("txtUsername"));
        System.out.println(username.getAttribute("id"));
        System.out.println(username.getAttribute("type"));

        username.sendKeys("Tester");
        System.out.println(username.getAttribute("value"));
        Thread.sleep(2000);
        driver.close();
    }
}
