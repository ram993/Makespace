package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testleafhyperlink {
    public  static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://leafground.com/pages/Link.html");

        WebElement firstlink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
        firstlink.click();

        WebElement hyperlinkicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img"));
        hyperlinkicon.click();

        WebElement secondlink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
        String where =  secondlink.getAttribute("href");
        System.out.println("Where am igoing" + where);




        WebElement Thirdlink = driver.findElement(By.partialLinkText("Verify am I broken?"));

        Thirdlink.click();
        String title = driver.getTitle();

        if (title.contains("404")){
            System.out.println("Link is broken");
        }
        driver.navigate().back();

        WebElement fourthlink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
        fourthlink.click();
        driver.navigate().back();

        List<WebElement> totalinks = driver.findElements(By.tagName("a"));
        int linkcount = totalinks.size();

        System.out.println("total links in page"+ linkcount);






    }
}
