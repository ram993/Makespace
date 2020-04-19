package Objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }



    By Fullname = By.xpath("//div[@class='makespace-ui-library-9vc4al css-1ncucz70']//div[1]//div[2]//div[1]//input[1]");
    By Phonenum = By.xpath("//div[@class='makespace-ui-library-a6bymx css-3iwqpr0']//div[2]//div[2]//div[1]//input[1]");
    By Email = By.xpath("//div[@class='css-105ote54 makespace-ui-library-kaob2o e1y4z9ke0']//div//input[@placeholder='Required']");
    By Vetran = By.xpath("//label[@label='Yes']");

    By Continue = By.xpath("//button[@class='css-105ote56 makespace-ui-library-1gd3jm6 emakht90']");
    By Address = By.xpath("//input[@placeholder='Enter a street address']");
    By Continue2 = By.xpath("//button[@class='css-nv2uc43 makespace-ui-library-m8ddco emakht90']");

    By AppmtDate = By.xpath("//input[@placeholder='mm/dd/yyyy']");
    By Time  = By.xpath("//input[@placeholder='Time']");

    By Continue3 = By.xpath(("//button[@class='css-wkjcpv1 makespace-ui-library-1ggztnq emakht90']"));

    By Cardnumber = By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame5']");
    //By Cardnumber = By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
    By Expdate = By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame6']");
    By SecurityCode = By.xpath("//div[@class='makespace-ui-library-1r2yix9 makespace-ui-library-18luru StripeElement StripeElement--empty']//div[@class='__PrivateStripeElement']//iframe[@name='__privateStripeFrame7']");
    By CardName = By.name("card-name");

    By Terms = By.xpath("//span[@class='makespace-ui-library-14ovu1w e1ovri130']");
    By Continue4 = By.xpath("//button[@class='css-nlchn23 makespace-ui-library-r4lnp8 emakht90']");







    public WebElement Fullname(){
        return driver.findElement(Fullname);
    }
    public WebElement Phonenum(){
        return driver.findElement(Phonenum);
    }
    public WebElement Email(){
        return driver.findElement(Email);
    }
    public WebElement Vetran(){
        return driver.findElement(Vetran);
    }

    public WebElement Continue(){
        return driver.findElement(Continue);
    }

    public WebElement Address(){
        return driver.findElement(Address);
    }
    public WebElement Continue2(){
        return driver.findElement(Continue2);
    }
    public WebElement AppmtDate(){
        return driver.findElement(AppmtDate);
    }
    public WebElement Time(){
        return driver.findElement(Time);
    }
    public WebElement Continue3(){
        return driver.findElement(Continue3);
    }

    public WebElement Cardnumber(){
        return driver.findElement(Cardnumber);
    }
    public WebElement Expdate(){
        return driver.findElement(Expdate);
    }
    public WebElement SecurityCode(){
        return driver.findElement(SecurityCode);
    }
    public WebElement CardName(){
        return driver.findElement(CardName);
    }

    public WebElement Terms(){
        return driver.findElement(CardName);
    }

    public WebElement Continue4(){
        return driver.findElement(CardName);
    }


}
