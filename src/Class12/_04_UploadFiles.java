package Class12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _04_UploadFiles {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/upload");
        /**
         * How do we upload files using Selenium?
         * 1. Specify file location - get full path
         * 2. Locate web element for 'Choose file' button and using sendKeys() method, sen tke location of file
         * 3. Locate 'upload' button element and click it
         * This way, we bypass the window pup-up, which is not supported by Selenium. Just like Authentication Alert
         **/

            String fileLocation ="C:\\Users\\Pc\\OneDrive\\Desktop\\Windmill Skilled Immigrant Career Success Guide (SICSG).pdf";

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(fileLocation);
        driver.findElement(By.id("file-submit")).click();

        WebElement confirmation = driver.findElement(By.xpath("//h3[text()=\"File Uploaded!\"]"));
        if (confirmation.isDisplayed())
            System.out.println("File Uploaded Successfully");
        else
            System.out.println("File Uploaded is Failed");


        tearDown();
    }
}
