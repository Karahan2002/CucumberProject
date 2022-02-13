package com.finworkserp.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try{
            FileInputStream inputStream = new FileInputStream("configuration.properties");
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        }catch(Exception e){
            System.out.println("error : "+e.getMessage());
        }
    }
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }
}
