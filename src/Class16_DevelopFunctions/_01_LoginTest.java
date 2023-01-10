package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _01_LoginTest {
    public static void main(String[] args) {
        setUp("https://www.exelentersdet.com");

        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
//        username.sendKeys("Admin");

        sendText(username, ConfigsReader.getProperties("username"));
        sendText(password, ConfigsReader.getProperties("password"));




        tearDown();
    }

}
