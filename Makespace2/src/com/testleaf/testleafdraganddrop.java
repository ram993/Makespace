package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class testleafdraganddrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/drop.html");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
        Thread.sleep(2000);

        String verify = driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]")).getText();
        String Expectedresult = "Dropped!";
        Assert.assertEquals(verify,Expectedresult);

        System.out.println(verify);


        driver.close();
    }

}
