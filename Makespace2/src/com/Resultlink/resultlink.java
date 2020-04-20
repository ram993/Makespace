package com.Resultlink;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class resultlink {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Game of thrones");
        driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        List<WebElement> mainlinks = driver.findElements(By.xpath("//div[@id='search']//following::h3//following::div/cite"));

        for(WebElement links: mainlinks){
            System.out.println(links.getText());
        }

        driver.close();





    }
}
