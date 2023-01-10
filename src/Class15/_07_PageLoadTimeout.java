package Class15;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;


public class _07_PageLoadTimeout {
    public static void main(String[] args) {
//        setUp("https://www.exelenter.com");

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));

        Instant startTime = Instant.now();
        System.out.println(startTime);

        try {
            driver.get("https://www.amazon.com");
        }catch (TimeoutException e){
            e.printStackTrace();
            System.out.println("Too slow to load");
        }

        Instant endTime = Instant.now();
        System.out.println(endTime);

        Duration pageLoadTime = Duration.between(startTime, endTime);
        System.out.println(pageLoadTime);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
