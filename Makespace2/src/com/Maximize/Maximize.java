package com.Maximize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize {
    public static  void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start--maximized");
        driver.get("http://www.google.com");

       // driver.manage().window().maximize();

       /* Dimension dimension = new Dimension(800,900);

        driver.manage().window().setSize(dimension);*/

        Thread.sleep(3000);

        driver.close();
    }
}
