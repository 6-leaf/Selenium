package utils;
//This class load FIS, and reads from the properties file.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

    static Properties properties = new Properties();

    /** This method will locate and prepare (load) the Propertise file
     * @param filePath specify file path/location here **/
    public static void loadProperties( String filePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
        //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
        //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

    /**
     * This method will return value of the specified key from the properties file
     * @param key accepted as a String
     * @return value of the given key (from the Properties file)
     */
    public static String getProperties(String key){
        return properties.getProperty(key);
    }
}
