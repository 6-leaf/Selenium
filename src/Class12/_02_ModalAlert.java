package Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _02_ModalAlert {
    public static void main(String[] args) {
        setUp();  //https://demoqa.com/modal-dialogs

        WebElement modalAlert = driver.findElement(By.cssSelector("button#showSmallModal"));
        modalAlert.click();
        System.out.println(modalAlert.getText());

        WebElement closeSmallModal = driver.findElement(By.id("closeSmallModal"));
        closeSmallModal.click();


        tearDown();
    }
}
