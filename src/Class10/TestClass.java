package Class10;

import static utils.BaseClass.*;

public class TestClass {
    public static void main(String[] args) {
        setUp("ttps://selenium08.blogspot.com/2019/11/dropdown.html");

        System.out.printf(driver.getTitle());

        tearDown();
    }
}
