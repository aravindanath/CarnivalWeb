package SeleniumBuiltins;

import jdk.nashorn.internal.scripts.JS;
import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Genaric;

public class AlertHandling  extends LaunchChromeUseingWebDriverManager {



    @Test
    public void alets() throws InterruptedException {

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


        driver.findElement(By.cssSelector(".signinbtn")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.findElement(By.cssSelector("#login1")).sendKeys("aravind@gmail.com");




    }



    @Test

    public void alerts1() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        Genaric.alertAccept(driver);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        Genaric.alertDismiss(driver);

        Genaric.getMsg(driver);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Genaric.sendTextAlert(driver,"Hello Janatha Bundh");
        Genaric.getMsg(driver);

    }

}
