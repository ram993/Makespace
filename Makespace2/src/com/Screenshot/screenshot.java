package com.Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File Sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destfile = new File("/Users/ramsubramaniansenthilnathan/Downloads/Capture/output.png");

        FileHandler.copy(Sourcefile,destfile);

    }
}
