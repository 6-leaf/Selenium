package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsWriter {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/configs/config.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);

        properties.setProperty("Phone", "555-555-5555");
        properties.setProperty("email", "test@gmail.com");

        FileOutputStream fos = new FileOutputStream(filePath);
        properties.store(fos, "Add phone, and email");

    }
}
