package utils;
//NOTE: This class is used to Launch and Quit the browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    public static WebDriver driver;
    public static void setUp(){
        // 1. way : Hard-Coding way (Not recommended).
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get(url);

        //2. Soft Coding(Recommended)
        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperties("browser").toLowerCase()){
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                WebDriver driver = new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.geckodriver.driver", Constants.GECKO_DRIVER_PATH);
                WebDriver driver = new FirefoxDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.msedgedriver.driver", Constants.EDGE_DRIVER_PATH);
                WebDriver driver = new EdgeDriver();
            }
            default -> throw new RuntimeException("Browser is not supported");
        }
        driver.get(ConfigsReader.getProperties("url"));
    }
}
