package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class testleafaction1 {

    public static void main (String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Window.html");
        String oldWindow = driver.getWindowHandle();

        WebElement firstButton=driver.findElement(By.id("home"));

        firstButton.click();


        Set<String> handles = driver.getWindowHandles();

        for (String newWindow: handles) {
            driver.switchTo().window(newWindow);
        }

        WebElement Editbox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
        Editbox.click();

        driver.close();

        driver.switchTo().window(oldWindow);

        WebElement OpenMultiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));

        OpenMultiple.click();

        int numberofwindows = driver.getWindowHandles().size(); //No of Windows open

         System.out.println("No of windows opened:"+numberofwindows);


         WebElement dontcloseme = driver.findElement(By.id("color"));
        dontcloseme.click();

        Set<String> newWindowhandles = driver.getWindowHandles();

        for (String allWindows: newWindowhandles
             ) { if (!allWindows.equals(oldWindow)){
                 driver.switchTo().window(allWindows);
                 driver.close();


        }

        }





    }

}
