package Class09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class _01_ConnectProperties {

    public static void main(String[] args) throws IOException {
        // Locate properties file in the project
//        String filePath = "configs/config.properties";
        String filePath = System.getProperty("user.dir") + "/configs/config.properties";

        FileInputStream fis = new FileInputStream(filePath);

        Properties properties = new Properties();
        properties.load(fis);

        String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);

        String url = properties.getProperty("url");
        System.out.println("url = " + url);

        System.out.println("--- Values Only ---");
        Collection<Object> values = properties.values();
        values.forEach(v-> System.out.println(v));

        System.out.println("\n--- Keys Only ---");
        Set<Object> keys = properties.keySet();
        keys.forEach(k-> System.out.println(k));

        System.out.println("\n--- Keys & Values ---");
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        entries.forEach(k-> System.out.println(k));


    }
}
