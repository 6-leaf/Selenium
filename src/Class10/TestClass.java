package Class10;

import static utils.BaseClass.*;

public class TestClass {
    public static void main(String[] args) {
        setUp();

        System.out.printf(driver.getTitle());

        tearDown();
    }
}
