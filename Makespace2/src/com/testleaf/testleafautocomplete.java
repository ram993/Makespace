package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testleafautocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/autoComplete.html");

        WebElement input = driver.findElement(By.xpath("//input[@id='tags']"));
        input.sendKeys("S");

        Thread.sleep(4000);

        List<WebElement> Options =  driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
        System.out.println(Options.size());

        for ( WebElement webElement : Options) {
            if (webElement.getText().equals("Web Services")){
                System.out.println("Selecting"+ " " +webElement.getText());
                webElement.click();
                Thread.sleep(4000);

                break;
            }



        }


        driver.close();





    }
}
