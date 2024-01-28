package week13.week13_review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

public class MapPractice {

    public static void main(String[] args) throws IOException {

        // step1: opening file
        String path = "src/week13/week13_review/Configurations.properties";
        FileInputStream file = new FileInputStream(path);


        // step2: loading the properties
        Properties properties = new Properties();
        properties.load(file);

        // System.out.println( properties.getProperty("browser") );
        //   System.out.println(properties.stringPropertyNames());

        Map<String, String> map = new HashMap<>();

        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            map.put(key, value);
        }


        System.out.println(map);

        System.out.println(map.get("url"));
        System.out.println(map.get("username"));

        System.out.println("-------------------------------------------------------------");

        Map<String, String> map2 = readPropertiesFile("src/week13/week13_review/Configuration2.properties");

        System.out.println(map2);

    }


    public static Map<String, String> readPropertiesFile(String path) {

        Map<String, String> map = new HashMap<>();

        try {
            FileInputStream file = new FileInputStream(path);

            Properties properties = new Properties();
            properties.load(file);

            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                map.put(key, value);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return map;
    }


}
