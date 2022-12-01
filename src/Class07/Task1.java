package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {

    private static String url = "https://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver  = new ChromeDriver();
        driver.get(url);

        //IQ: Find all existing links in a given website. ==> by using the tag name

        List<WebElement> listOfAllLinks = driver.findElements(By.tagName("a"));
//        listOfAllLinks.forEach(name -> System.out.println("listOfAllLinks = " + listOfAllLinks.size()));
        System.out.println("listOfAllLinks = " + listOfAllLinks.size());


        //Count and print all links have text
        int linksWithText = 0;
        for (WebElement link : listOfAllLinks){
            if (!link.getText().isEmpty()|| !link.getText().isBlank()){
                System.out.println(link.getText());
                linksWithText++;
            }
        }

        System.out.println("Links with text : " + linksWithText);
        System.out.println("All links = " + listOfAllLinks.size());

        Thread.sleep(2000);
        driver.close();
    }
}
