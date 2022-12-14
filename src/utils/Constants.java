package utils;

public class Constants {
    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
    public static final String CHROME_DRIVER_PATH_MAC = System.getProperty("user.dir") + "/drivers/chromedriver";
    public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/geckodriver.exe";
    public static final String EDGE_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/msedgedriver.exe";
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/configs/config.properties";
    public static final String TEST_DATA_FILEPATH = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
    public static final int IMPLICIT_WAIT_TIME = 15;
    public static final int EXPLICIT_WAIT_TIME = 40;
}
