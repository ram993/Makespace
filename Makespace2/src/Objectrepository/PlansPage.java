package Objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlansPage {
    WebDriver driver;

    public PlansPage(WebDriver driver) {

        this.driver = driver;
    }

    By Plans = By.xpath("//li[2]//div[1]//div[1]//div[1]//div[3]//button[1]");
    By Noofbins = By.xpath("//input[@placeholder='0']");
    By Continue = By.xpath("//button[contains(text(),\"Continue with 5'x5'\")]");
    By Gotit = By.xpath("//button[@class='epfibpa8 makespace-ui-library-ctdhjf emakht90']");

    public WebElement Plans(){
        return driver.findElement(Plans);
    }

    public WebElement Noofbins(){
        return driver.findElement(Noofbins);
    }

    public WebElement Continue(){
        return driver.findElement(Continue);
    }

    public WebElement Gotit(){
        return driver.findElement(Gotit);
    }



}
