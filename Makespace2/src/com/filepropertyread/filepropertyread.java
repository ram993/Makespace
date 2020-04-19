package com.filepropertyread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class filepropertyread {

    public static void main(String[] args) throws IOException {
        WebDriver driver;
        FileInputStream stream = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(stream);

        String browser = properties.getProperty("browser");

        String driverLocation = properties.getProperty("DriverLocation");

        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", driverLocation);
            driver = new ChromeDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", driverLocation);
            driver = new FirefoxDriver();
        }



    }
}
