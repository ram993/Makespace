package com.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUsername {
    @Test
    @Parameters({"Username","password"})
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
