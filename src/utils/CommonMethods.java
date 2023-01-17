package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
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

    /**
     * Wait for element for Explicit Wait Time which is defined in Constants
     * @return
     */
    public static WebDriverWait waitForElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        return wait;
    }

    /**
     * wait for clickacility of element
     * @param element WebElement
     */
    public static void waitForClickability(WebElement element){
        waitForElement().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Click but wait for clickability of element
     * @param element WebElement
     */
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

    public static void clickRadioOrCheckBox(List<WebElement> elementList, String expectedValue){
        for (WebElement element : elementList) {
            String colorValue = element.getAttribute("value");
            if (element.isEnabled()
                    && !element.isSelected()
                    && colorValue.equalsIgnoreCase(expectedValue)){
                element.click();break;
            }
        }
    }

    public static void clickRadioOrCheckBox(WebElement element){
        if (element.isEnabled() && !element.isSelected()){
            element.click();
        }
    }

    public static void selectDdValue1(List<WebElement> DdList, String expectedValue){
        for (WebElement element : DdList) {
            String actualMonth = element.getText();
            if (actualMonth.toLowerCase().contains(expectedValue.toLowerCase())
            && !actualMonth.equalsIgnoreCase("month...")){
                element.click();
            }else {
                try {
                    throw new NoSuchElementException("There is no such a month includes " + expectedValue);
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println(expectedValue + " not included in any months");
                }
            }
        }
    }


    /**
     * Method selects from dropdown or multi-select by text value.
     *
     * @param dropdownList  list of WebElement
     * @param expectedValue String
     */
    public static void selectDdValue(List<WebElement> dropdownList, String expectedValue) {
        for (WebElement element : dropdownList) {
            String actualValue = element.getText();
            if (actualValue.equals(expectedValue)) {
                element.click();
                break;
            }
        }
    }

    /**
     * Method selects from a dropdown by visible text.
     *
     * @param element       WebElement
     * @param expectedValue String
     */
    public static void selectDdValue(WebElement element, String expectedValue) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(expectedValue)) {
                select.selectByVisibleText(expectedValue);
                break;
            }
        }
    }

    /**
     * Method will select a dropdown or multi-select by index.
     *
     * @param element WebElement
     * @param index   int
     */
    public static void selectDdValue(WebElement element, int index) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        if (index < options.size()) {
            select.selectByIndex(index);
        } else {
            try {
                throw new IndexOutOfBoundsException(index);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Incorrect Index used. Please use a number between 1 and " + options.size());
            }
        }
    }


    public static void acceptAlert() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
            System.out.println("Alert is not present.");
        }
    }

    public static void dismissAlert(){
        try {
            driver.switchTo().alert().dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
            System.out.println("Alert is not present.");
        }
    }

    public static void sendAlertText(String text){
        try {
            driver.switchTo().alert().sendKeys(text);
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
            System.out.println("Alert is not present.");
        }
    }

    public static String getAlertText(){
        String alertText=null;
        try {
            alertText = driver.switchTo().alert().getText();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
                    }
        return alertText;
    }

    /**
     * Static wait for element as long as given second
     * @param second int
     */
    public static void waitInSeconds(int second){
        try {
            Thread.sleep(second *1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
