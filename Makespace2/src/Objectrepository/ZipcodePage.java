package Objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZipcodePage {
    WebDriver driver;

    public ZipcodePage(WebDriver driver) {

        this.driver = driver;
    }



    By Zip = By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]") ;
    By GetStarted = By.xpath("//div[@class='zip-input js-standalone-zip-input']//div//button[@class='e10p5ni92 makespace-ui-library-6tq67u emakht90'][contains(text(),'Get pricing')]");


    public WebElement code(){
        return driver.findElement(Zip);
    }

    public WebElement started(){
        return  driver.findElement(GetStarted);
    }

}
