package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/");

        driver.findElement(By.linkText("REGISTER")).click();

        driver.findElement(By.name("firstName")).sendKeys("Michael");
        driver.findElement(By.name("lastName")).sendKeys("Jordan");
        driver.findElement(By.name("phone")).sendKeys("5555555555");
        driver.findElement(By.id("userName")).sendKeys("MichaelJordan@gmail.com");
        driver.findElement(By.id("email")).sendKeys("MichaelJordan");
        driver.findElement(By.name("submit")).click();

        driver.quit();
    }
}
