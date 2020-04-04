package SeleniumBuiltins;


import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Genaric;

public class ExplicitWaitExample extends LaunchBrowserUsingWebDriverManager {



    @Test
    public void explicit() throws Exception{
        driver.get("https://www.expedia.co.in/");

        driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();

        driver.findElement(By.cssSelector("#flight-type-one-way-label-hp-flight")).click();

        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("Bengaluru, India (BLR-Kempegowda Intl.)", Keys.TAB);

        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys("Delhi, India (DEL-Indira Gandhi Intl.)",Keys.TAB);

        driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys("22/04/2020", Keys.ENTER);



        WebDriverWait wait  = new WebDriverWait(driver,60);//this max

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'btn-secondary btn-action t-select-btn')])[1]"))).click();


        //https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver

    }
}
