package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testleafframes {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/frame.html");

        driver.switchTo().frame(0);

        WebElement firstframe = driver.findElement(By.id("Click"));
        firstframe.click();

        String firsttect =  driver.findElement(By.id("Click")).getText();
        System.out.println(firsttect);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
         driver.switchTo().frame("frame2");

        WebElement nestedlop = driver.findElement(By.id("Click1"));
        nestedlop.click();

        String firsttect2 =  driver.findElement(By.id("Click1")).getText();
        System.out.println(firsttect2);

        driver.switchTo().defaultContent();



        List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
        int size =totalframe.size();

        System.out.println(size);

        driver.close();
    }
}
