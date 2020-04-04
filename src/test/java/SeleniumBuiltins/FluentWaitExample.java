package SeleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class FluentWaitExample extends LaunchBrowserUsingWebDriverManager {



    @Test
    public void explicit() throws Exception{
        driver.get("https://www.expedia.co.in/");

        driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();

        driver.findElement(By.cssSelector("#flight-type-one-way-label-hp-flight")).click();

        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("Bengaluru, India (BLR-Kempegowda Intl.)", Keys.TAB);

        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys("Delhi, India (DEL-Indira Gandhi Intl.)",Keys.TAB);

            driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys("22/03/2020", Keys.ENTER);


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){

            public WebElement apply(WebDriver driver ) {
                return driver.findElement(By.xpath("(//button[contains(@class,'btn-secondary btn-action t-select-btn')])[1]"));
            }

        });

    }



}
