package com.ryanair.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {
	
    public static Properties properties;
    private final static String PROP_FILE_PATH = "application.properties";

    public PropUtils() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(PROP_FILE_PATH));
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public String getProperty(String key){
        return  properties.getProperty(key);
    }


}
