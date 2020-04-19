package com.makespace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makespace {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.mksp.co/");


        driver.quit();
    }
}
