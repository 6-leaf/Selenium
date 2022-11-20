package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    private static final String uRL = "https://exelentersdet.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(uRL);

        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name=\"txtPassword\"]")).sendKeys("Exelent2022Sdet!");
        driver.findElement(By.xpath("//*[@value=\"LOGIN\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Welcome')]")).click();

        Thread.sleep(2000);
//        driver.navigate().to("https://exelentersdet.com/symfony/web/index.php/auth/logout");
//        driver.findElement(By.xpath("//div[@id='welcome-menu']//a")).click();
        driver.findElement(By.xpath("//a[starts-with(text(), 'Log')]")).click();



        Thread.sleep(2000);
//        driver.close();
    }
}
