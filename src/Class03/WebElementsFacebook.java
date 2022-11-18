package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsFacebook {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigate facebook page
        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        //Let's practice using locators to locate web elements on Facebook page
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("qwerty");

        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);
//        driver.findElement(By.className("_97w4")).click();
//        driver.findElement(By.linkText("Forgot Password?")).click();
//        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.findElement(By.partialLinkText("password?")).click();




        Thread.sleep(2000);
//        driver.close();

    }
}
