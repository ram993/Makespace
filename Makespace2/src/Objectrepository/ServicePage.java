package Objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicePage {
    WebDriver driver;

    public ServicePage(WebDriver driver) {

        this.driver = driver;
    }

    By Q1 = By.xpath("//label[@name='large-items']//span[@class='css-79elbk css-1ebch5r8'][contains(text(),'Yes')]");
    By Q2 = By.xpath("//div[@class='makespace-ui-library-1ybsplp css-14f9sk52']//div[2]//div[1]//div[2]//label[2]");
    By Q3 = By.xpath("//div[3]//div[1]//div[2]//label[1]");
    By Q4 = By.xpath("//div[4]//div[1]//div[2]//label[2]");
    By Q5 = By.xpath("//div[5]//div[1]//div[2]//label[1]");
    By Continue = By.xpath("//button[@class='css-1oldnow css-1a3l4121 makespace-ui-library-1gxqmnr emakht90']");


    public WebElement Q1(){
        return driver.findElement(Q1);
    }
    public WebElement Q2(){
        return driver.findElement(Q2);
    }
    public WebElement Q3(){
        return driver.findElement(Q3);
    }
    public WebElement Q4(){
        return driver.findElement(Q4);
    }
    public WebElement Q5(){
        return driver.findElement(Q5);
    }
    public WebElement Continue(){
        return driver.findElement(Continue);
    }


}
