package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mdbootstrap.com/docs/jquery/javascript/tooltips/");

        WebElement tooltip = driver.findElement(By.xpath("//button[contains(text(),'Tooltip on top')]"));

        String tooltiptext = tooltip.getAttribute("data-original-title");
        System.out.println(tooltiptext);

        WebElement tooltip2 = driver.findElement(By.xpath("//button[contains(text(),'Tooltip on bottom')]"));
        String tooltiptext2 = tooltip2.getAttribute("data-original-title");
        System.out.println(tooltiptext2);

    }

}
