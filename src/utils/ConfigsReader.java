package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/configs/config.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);
    }
}
