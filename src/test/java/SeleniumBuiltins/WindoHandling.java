package SeleniumBuiltins;

import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Genaric;

import java.util.Set;

public class WindoHandling extends LaunchChromeUseingWebDriverManager {


    @Test
    public void frames() throws InterruptedException {

    driver.get("https://www.canarabank.com/english/");

    System.out.println("Title of Parent window ---> "+ driver.getTitle());
    System.out.println("Parent First -->  "+ driver.getWindowHandle());
    String first =  driver.getWindowHandle();
    driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

    Set<String>allWin = driver.getWindowHandles();

    for(String handle : allWin){
        driver.switchTo().window(handle);
    }
    System.out.println("Title of child window ---> "+ driver.getTitle());
    driver.close();
    Thread.sleep(3000);
    driver.switchTo().window(first);
    Thread.sleep(3000);
    System.out.println("Title of Parent window ---> "+ driver.getTitle());
    driver.quit();

    }
}