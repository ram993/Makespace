package com.makespace;


import Objectrepository.CheckoutPage;
import Objectrepository.PlansPage;
import Objectrepository.ServicePage;
import Objectrepository.ZipcodePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;
public class Makespacetest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public  void Zipcode() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.mksp.co/");
        driver.manage().window().maximize();



        ZipcodePage zp = new ZipcodePage(driver);
        zp.code().sendKeys("10038");
        Assert.assertFalse(zp.started().isSelected());
        System.out.println("Navigation Element:- Is the Zip Code Valid?");
        //System.out.println(zp.started().isSelected());
        //softAssert.assertEquals();
        System.out.println("The Zip Code is Valid");
        zp.started().click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        PlansPage pp = new PlansPage(driver);
        pp.Plans().click();
        pp.Noofbins().sendKeys("4");
        pp.Continue().click();
        pp.Gotit().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ServicePage sp = new ServicePage(driver);
        sp.Q1().click();
        sp.Q2().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sp.Q3().click();
        sp.Q4().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sp.Q5().click();
        sp.Continue().click();

        CheckoutPage cp = new CheckoutPage(driver);
        cp.Fullname().sendKeys("Ram Senthil");
        cp.Phonenum().sendKeys("9995556633");
        cp.Email().sendKeys("test@test.com");
        cp.Vetran().click();
        cp.Continue().click();
        cp.Address().sendKeys("123 William Street, New York, NY, USA");
        cp.Address().clear();
        Thread.sleep(3000);
        cp.Address().sendKeys("123 William Street, New York, NY, USA");
        cp.Address().sendKeys(Keys.ARROW_DOWN);
        cp.Address().sendKeys(Keys.ENTER);
        cp.Continue2().click();
        Thread.sleep(6000);
        cp.Continue2().click();
        Thread.sleep(3000);




        cp.AppmtDate().click();
        cp.AppmtDate().sendKeys("02/02/2020");
        Assert.assertFalse(cp.AppmtDate().isSelected());
        System.out.println("Is the Appointment Date Selected?");
        System.out.println(cp.AppmtDate().isSelected());
        //System.out.println(cp.AppmtDate().isSelected());
        cp.Time().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cp.Time().sendKeys(Keys.ARROW_DOWN);
        cp.Time().sendKeys(Keys.ARROW_DOWN);
        cp.Time().sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cp.Continue3().click();

        //cp.Cardnumber().click();
        //cp.Cardnumber().sendKeys("4444111111111111111");
        driver.findElement(By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame5']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame5']")).sendKeys("4111111111111111");

        cp.Expdate().sendKeys("02/22");
        cp.SecurityCode().sendKeys("222");
        cp.CardName().sendKeys("Test");

        cp.Terms().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cp.Continue4().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[@class='makespace-ui-library-14ovu1w e1ovri130']")).click();
        Thread.sleep(3000);
        cp.Continue4().click();

        //driver.quit();

    }
}
