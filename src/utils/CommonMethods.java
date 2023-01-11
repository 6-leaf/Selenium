package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utils.BaseClass.driver;

public class CommonMethods {

    /**
     * Method will switch focus to next window/tab based on the window title and Set of titles
     * @param windowTitle String
     * @param windows Set of String
     */
    public static void switchToWindow(String windowTitle, Set<String> windows) {
        for (String window : windows) {
            String title = driver.switchTo().window(window).getTitle();
            if (title.contains(windowTitle))
                System.out.println("Window is found: " + driver.getTitle() + "\nURL is: " + driver.getCurrentUrl());
        }
    }

    /**
     * Method will switch focus to next window/tab based on the window title
     * @param windowTitle String
     */
    public static void switchToWindow(String windowTitle) {
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            String title = driver.switchTo().window(window).getTitle();
            if (title.contains(windowTitle))
                System.out.println("Window is found: " + driver.getTitle() + "\nURL is: " + driver.getCurrentUrl());
        }
    }

    /**
     * Send text to WebElement
     * @param element WebElement
     * @param value String
     */
    public static void sendText(WebElement element, String value){
        element.sendKeys(value);
    }

    /**
     * Simple click method
     * @param element WebElement
     */
    public static void click(WebElement element){element.click();}

    public static WebDriverWait waitForElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        return wait;
    }

    public static void waitForClickability(WebElement element){
        waitForElement().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickButWaitForClickable(WebElement element){
        waitForClickability(element);
        click(element);
    }

    public static void waitForVisibility(WebElement element){
        waitForElement().until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForVisibility(By by){
        waitForElement().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void clickButWaitForVisibility(WebElement element){
        waitForVisibility(element);
        click(element);
    }

    public static void clickRadioOrCheckBox(List<WebElement> elementList, String attribute, String expectedValue){
        for (WebElement element : elementList) {
            String colorValue = element.getAttribute(attribute);
            if (colorValue.equalsIgnoreCase(expectedValue)){
                element.click();break;
            }
        }
    }

    public static void selectDdValue(List<WebElement> months, String attribute, String expectedValue){
        for (WebElement month : months) {
            String actualMonth = month.getAttribute(attribute);
            if (actualMonth.equalsIgnoreCase(expectedValue)){
                month.click();break;
            }
        }
    }


}
