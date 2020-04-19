import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ramsubramaniansenthilnathan/Selenium Server/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.mksp.co/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10038");
        //driver.findElement(By.class("dark city-zip-input js-address-input js-zip"))
        driver.findElement(By.xpath("//div[@class='zip-input js-standalone-zip-input']//div//button[@class='e10p5ni92 makespace-ui-library-6tq67u emakht90'][contains(text(),'Get pricing')]")).click();
        //Thread.sleep(8000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[1]//div[3]//button[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='0']")).sendKeys("4");
        driver.findElement(By.xpath("//button[contains(text(),\"Continue with 5'x5'\")]")).click();

        driver.findElement(By.xpath("//button[@class='epfibpa8 makespace-ui-library-ctdhjf emakht90']")).click();
        Thread.sleep(8000);

        driver.findElement(By.xpath("//label[@name='large-items']//span[@class='css-79elbk css-1ebch5r8'][contains(text(),'Yes')]")).click();
        driver.findElement(By.xpath("//div[@class='makespace-ui-library-1ybsplp css-14f9sk52']//div[2]//div[1]//div[2]//label[2]")).click();
        driver.findElement(By.xpath("//label[@name='walk-up']//span[@class='css-79elbk css-1ebch5r8'][contains(text(),'Yes')]")).click();
        driver.findElement(By.xpath("//div[4]//div[1]//div[2]//label[2]")).click();
        driver.findElement(By.xpath("//div[5]//div[1]//div[2]//label[1]")).click();
        driver.findElement(By.xpath("//button[@class='css-1oldnow css-1a3l4121 makespace-ui-library-1gxqmnr emakht90']")).click();


        driver.findElement(By.xpath("//div[@class='makespace-ui-library-9vc4al css-1ncucz70']//div[1]//div[2]//div[1]//input[1]")).sendKeys("RamSenthil");
        driver.findElement(By.xpath("//div[@class='makespace-ui-library-a6bymx css-3iwqpr0']//div[2]//div[2]//div[1]//input[1]")).sendKeys("9995556633");
        driver.findElement(By.xpath("//div[@class='css-105ote54 makespace-ui-library-kaob2o e1y4z9ke0']//div//input[@placeholder='Required']")).sendKeys("test@test.com");

        driver.findElement(By.xpath("//label[@label='Yes']")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//button[@class='css-105ote56 makespace-ui-library-1gd3jm6 emakht90']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter a street address']")).sendKeys("123 William Street, New York, NY, USA");
        driver.findElement(By.xpath("//input[@placeholder='Enter a street address']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter a street address']")).sendKeys("123 William Street, New York, NY, USA");
        driver.findElement(By.xpath("//input[@placeholder='Enter a street address']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder='Enter a street address']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@class='css-nv2uc43 makespace-ui-library-m8ddco emakht90']")).click();
        Thread.sleep(6000);

        driver.findElement(By.xpath("//button[@class='css-nv2uc43 makespace-ui-library-m8ddco emakht90']")).click();

        driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).click();
        driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys("02/02/2020");
        driver.findElement(By.xpath("//input[@placeholder='Time']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Time']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder='Time']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder='Time']")).sendKeys(Keys.ENTER);
        Thread.sleep(6000);


        driver.findElement(By.xpath(("//button[@class='css-wkjcpv1 makespace-ui-library-1ggztnq emakht90']"))).click();
        //
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame5']")).sendKeys("4111111111111111");
        driver.findElement(By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame6']")).sendKeys("02/22");
        driver.findElement(By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame7']")).sendKeys("222");
        driver.findElement(By.name("card-name")).sendKeys("Test");

        driver.findElement(By.xpath("//span[@class='makespace-ui-library-14ovu1w e1ovri130']")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//button[@class='css-nlchn23 makespace-ui-library-r4lnp8 emakht90']")).click();
        driver.findElement(By.xpath("//button[@class='css-nlchn23 makespace-ui-library-r4lnp8 emakht90']")).click();
        Thread.sleep(9000);




        /*driver.findElement(By.cssSelector("div.makespace-ui-library-1c6voyp.css-14f9sk50 div.makespace-ui-library-1ybsplp.css-14f9sk52 div.makespace-ui-library-lj55qq.css-nlchn21 div.makespace-ui-library-xu1rqo.css-nlchn20 div.makespace-ui-library-9vc4al.css-1ncucz70:nth-child(4) div.makespace-ui-library-178yklu.css-1ond9p70:nth-child(1) div.css-1ond9p71.makespace-ui-library-gbbwyj.css-3iwqpr0:nth-child(1) form.makespace-ui-library-kiqkqc.css-1ond9p73 div.makespace-ui-library-8atqhb.css-16zeaun0:nth-child(1) div.makespace-ui-library-1t7bk36.e1y4z9ke0 div:nth-child(2) div.makespace-ui-library-79elbk.e1ws5ted0 > div.makespace-ui-library-1r2yix9.makespace-ui-library-18luru.StripeElement.StripeElement--empty")).sendKeys("4222222222222222");
        driver.findElement(By.cssSelector("div.makespace-ui-library-1c6voyp.css-14f9sk50 div.makespace-ui-library-1ybsplp.css-14f9sk52 div.makespace-ui-library-lj55qq.css-nlchn21 div.makespace-ui-library-xu1rqo.css-nlchn20 div.makespace-ui-library-9vc4al.css-1ncucz70:nth-child(4) div.makespace-ui-library-178yklu.css-1ond9p70:nth-child(1) div.css-1ond9p71.makespace-ui-library-gbbwyj.css-3iwqpr0:nth-child(1) form.makespace-ui-library-kiqkqc.css-1ond9p73 div.makespace-ui-library-8atqhb.css-16zeaun0:nth-child(1) div.makespace-ui-library-1t7bk36.e1y4z9ke0 div:nth-child(2) div.makespace-ui-library-79elbk.e1ws5ted0 > div.makespace-ui-library-1r2yix9.makespace-ui-library-18luru.StripeElement.StripeElement--empty")).sendKeys("02/21");
        driver.findElement(By.cssSelector("div.makespace-ui-library-1c6voyp.css-14f9sk50 div.makespace-ui-library-1ybsplp.css-14f9sk52 div.makespace-ui-library-lj55qq.css-nlchn21 div.makespace-ui-library-xu1rqo.css-nlchn20 div.makespace-ui-library-9vc4al.css-1ncucz70:nth-child(4) div.makespace-ui-library-178yklu.css-1ond9p70:nth-child(1) div.css-1ond9p71.makespace-ui-library-gbbwyj.css-3iwqpr0:nth-child(1) form.makespace-ui-library-kiqkqc.css-1ond9p73 div.makespace-ui-library-8atqhb.css-16zeaun0:nth-child(1) div.makespace-ui-library-1t7bk36.e1y4z9ke0 div:nth-child(2) div.makespace-ui-library-79elbk.e1ws5ted0 > div.makespace-ui-library-1r2yix9.makespace-ui-library-18luru.StripeElement.StripeElement--empty")).sendKeys("02/21");

        driver.findElement(By.name("cvc")).sendKeys("323");
        driver.findElement(By.name("card-name")).sendKeys("Test");*/



        //driver.quit();



    }
}
