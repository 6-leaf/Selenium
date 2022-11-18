package Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String title = "Yahoo | Mail, Weather, Search, News, Finance, Sports, Shopping, Entertainment, Video";
        System.out.println(driver.getTitle());

        if (title.equals(driver.getTitle())){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }
        driver.quit();
    }
}
