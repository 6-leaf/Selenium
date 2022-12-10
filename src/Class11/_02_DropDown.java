package Class11;
import org.bouncycastle.crypto.engines.EthereumIESEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utils.BaseClass.*;

public class _02_DropDown {
    public static void main(String[] args) throws InterruptedException {
        setUp();

        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(countryDD);

        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("CA");
        Thread.sleep(1000);
        select.selectByVisibleText("Bahamas");






        tearDown();

    }

}
