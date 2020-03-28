package SeleniumBuiltins;

import com.mysql.cj.exceptions.DataReadException;
import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import utilities.Genaric;

import java.util.Set;

public class Scroll extends LaunchChromeUseingWebDriverManager {


    @Test
    public void frames() throws InterruptedException {


        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.in");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("mens wrist watch", Keys.ENTER);
        Thread.sleep(1000);

        WebElement dial = driver.findElement(By.xpath("//*[text()='Watch Band Colour']"));


        Genaric.scrollTillElement(driver,dial);

        WebElement lether = driver.findElement(By.xpath("//*[text()='Leather']"));
        Genaric.highlightElement(driver,lether,"GreeN");
        Thread.sleep(2000);
        Genaric.clickAction(driver,lether);
        Thread.sleep(2000);

    
    }
}