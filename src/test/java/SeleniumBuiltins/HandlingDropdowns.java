package SeleniumBuiltins;

import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.Genaric;

public class HandlingDropdowns extends LaunchChromeUseingWebDriverManager {



    @Test
    public void dropdowns() throws InterruptedException {

        driver.get("https://www.wikipedia.org/");



        WebElement dd = driver.findElement(By.cssSelector("#searchLanguage"));
        Thread.sleep(2000);

        Genaric.selectByindex(dd,6);
        Thread.sleep(2000);
        Genaric.selectByvisiableText(dd,"हिन्दी");
        Thread.sleep(2000);
        Genaric.selectByvalue(dd,"fr");

    }


    @Test
    public void deselectDropdowns() throws InterruptedException {

        driver.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");



        WebElement dd = driver.findElement(By.cssSelector(".custom-select.browser-default"));
        Thread.sleep(2000);

        Genaric.selectByindex(dd,1);
        Thread.sleep(2000);
        Genaric.selectByvisiableText(dd,"Two");
        Thread.sleep(2000);
        Genaric.selectByvalue(dd,"3");
        Thread.sleep(2000);

        Genaric.deSelectByIndex(dd,2);
        Thread.sleep(2000);
        Genaric.deselectAllVal(dd);


    }

}
