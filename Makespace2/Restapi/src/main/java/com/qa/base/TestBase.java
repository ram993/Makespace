package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public Properties prop;

    public TestBase(){
        try {
            //To read properties file
            prop = new Properties();
            //Create file input stream class
            FileInputStream ip = new FileInputStream("/Users/ramsubramaniansenthilnathan/Downloads/Makespace2/Restapi/src/main/java/com/qa/config/config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //System.out.println(prop.getProperty("browser"));

    }
}
