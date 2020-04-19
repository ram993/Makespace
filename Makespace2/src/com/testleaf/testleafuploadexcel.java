package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testleafuploadexcel {
    public  static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/upload.html");

        String filepath = "/Users/ramsubramaniansenthilnathan/Downloads/testleaf.xlsx";

        WebElement choosefile = driver.findElement(By.xpath("//input[@name='filename']"));
        Thread.sleep(4000);
        choosefile.sendKeys(filepath);



    }
}
