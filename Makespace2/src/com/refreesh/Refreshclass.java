package com.refreesh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Refreshclass {
    public static void main(String args[]) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Ram");

        Thread.sleep(3000);

        //driver.get(driver.getCurrentUrl());

        /*JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("location.reload()");//history.go(0)*/



        Robot robot  =new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_META);

        Thread.sleep(3000);


        driver.close();



    }
}
