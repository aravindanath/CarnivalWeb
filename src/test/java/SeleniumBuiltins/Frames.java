package SeleniumBuiltins;

import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Genaric;

public class Frames extends LaunchChromeUseingWebDriverManager {


    @Test
    public void frames() throws InterruptedException {

        driver.get("https://docs.oracle.com/javase/8/docs/api/");

        driver.switchTo().frame("packageListFrame");

        driver.findElement(By.linkText("java.awt.color")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("packageFrame");

        driver.findElement(By.linkText("ColorSpace")).click();

        driver.switchTo().defaultContent();

        Genaric.switchToFrame(driver,"classFrame");
        driver.findElement(By.linkText("Serializable")).click();

    }
}