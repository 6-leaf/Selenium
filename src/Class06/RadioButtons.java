package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//input[@value='Mozilla']")).click();
        WebElement mozilla = driver.findElement(By.xpath("//input[@value='Mozilla']"));


        String isDisplayed = mozilla.isDisplayed() ? "Mozilla is displayed" : "Mozilla is not displayed";
        System.out.println(isDisplayed);

        String isEnabled = mozilla.isEnabled() ? "Mozilla is enabled" : "Mozilla is not enabled";
        System.out.println(isEnabled);

        String isSelected = mozilla.isSelected() ? "Mozilla is selected" : "Mozilla is not selected";
        System.out.println(isSelected);


        Thread.sleep(2000);
        driver.close();
    }
}
