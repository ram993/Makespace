package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class testleaftable {
    public  static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://leafground.com/pages/table.html");

        List<WebElement> column =  driver.findElements(By.tagName("th"));
        int columncount = column.size();
        System.out.println("no of columns"+ columncount);

        List<WebElement> rows =  driver.findElements(By.tagName("tr"));
        int rowscount = rows.size();
        System.out.println("no of rows"+ rowscount);

        List<WebElement> data =  driver.findElements(By.tagName("td"));
        int datacount = data.size();
        System.out.println("no of data"+ datacount);

        WebElement getpercentage =  driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

        String percentagevalue = getpercentage.getText();
        System.out.println("percentagevalue" + percentagevalue);

        List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));

        List<Integer> numberlist = new ArrayList<Integer>();

        for (WebElement webElement :  allprogress){
             String indvidalvalue = webElement.getText().replace("%","");
             numberlist.add(Integer.parseInt(indvidalvalue));


        }

        System.out.println("Final list" + numberlist);

        int smallvalue = Collections.min(numberlist);
        System.out.println(smallvalue);

        String finalstingvalue = Integer.toString(smallvalue)+"%";
        String finalxpath =  "//td[normalize-space()="+"\""+ finalstingvalue +"\""+"]"+"//following::td[1]";

        WebElement check = driver.findElement(By.xpath(finalxpath));
        check.click();





        driver.close();


    }
}

