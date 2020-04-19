package com.Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Robotclass {
    public static void main(String args[]) throws AWTException, IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/Browser/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().window().maximize();

        Robot robot = new Robot();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle  = new Rectangle(screensize);

        BufferedImage source = robot.createScreenCapture(rectangle);

        File destfile = new File("/Users/ramsubramaniansenthilnathan/Downloads/Capture/output.png");

        ImageIO.write(source,"png", destfile);

        Thread.sleep(3000);

        driver.close();


    }
}
