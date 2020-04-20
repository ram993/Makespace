package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Game of thrones");
        Thread.sleep(3000);

        List<WebElement> searchsuggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
        //int position = 0;
        for( WebElement webElement : searchsuggestions){
            String text = webElement.getText();
            System.out.println(text);
            //position++;
            /*if (position ==3)
            {
                webElement.click();
                break;
            }*/

            if (text.contains("cast")){
                webElement.click();
                break;
            }
        }




        driver.close();

    }
}
