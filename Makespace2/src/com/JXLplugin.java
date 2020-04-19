package com;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class JXLplugin {

    String data[][] =null;

    public String[][] getexceldata() throws IOException, BiffException {
        FileInputStream excel = new FileInputStream("/Users/ramsubramaniansenthilnathan/Downloads/Makespace2/JXL_Datadriven.xls");

        Workbook workbook = Workbook.getWorkbook(excel);

        Sheet sheet = workbook.getSheet(0);

        int rowcoutn = sheet.getRows();

        int columncount = sheet.getColumns();

        String testData [][] = new String [rowcoutn-1][columncount];

        for (int i = 1; i< rowcoutn; i++){
            for (int j =0; j<columncount; j++){
                testData[i-1][j]=sheet.getCell(j,i).getContents();
            }
        }

        return testData;



    }



    @DataProvider(name = "loginData")
    public String[][] logindataprovider() throws IOException, BiffException {
        data = getexceldata();
        return data;
    }

    @Test(dataProvider = "loginData")
    public void loginwithcorrectUsernameandpwd(String Uname, String pword) {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys(Uname);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(pword);

        WebElement loginbtn = driver.findElement(By.id("btnLogin"));
        loginbtn.click();
    }
}
