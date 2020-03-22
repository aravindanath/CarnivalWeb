package SeleniumBuiltins;

import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Genaric;

public class MouseActions extends LaunchChromeUseingWebDriverManager {






    @Test

    public void mouse() throws InterruptedException {

        driver.get("http://www.myntra.com");


        WebElement ele = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
        WebElement kid = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
        Thread.sleep(2000);

        Actions act = new Actions(driver);

        act.moveToElement(ele).build().perform();
        Thread.sleep(2000);

        Genaric.mouseHover(driver,kid);

        Thread.sleep(2000);


    }

}
