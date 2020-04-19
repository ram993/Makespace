package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class testleafdownloadexcel {
    public  static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/download.html");

        WebElement excellink = driver.findElement(By.xpath("//a[contains(text(),'Download Excel')]"));
        excellink.click();

        Thread.sleep(4000);

        File filelocation = new File("/Users/ramsubramaniansenthilnathan/Downloads");

        File[] totalFiles = filelocation.listFiles();


        for (File file :  totalFiles) {
            if(file.getName().equals("testleaf.xlsx")){
                System.out.println("Excel is downloaded");
                break;
            }

        }


    }
}
