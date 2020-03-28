package SeleniumBuiltins;

import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Autosuggest extends LaunchChromeUseingWebDriverManager {


    @Test
    public void autosuggest() throws InterruptedException {


        driver.get("https://www.redbus.in/");

        WebElement src = driver.findElement(By.cssSelector("#src"));
        WebElement dest = driver.findElement(By.cssSelector("#dest"));


        src.sendKeys("Banga");

        Thread.sleep(2000);
        List<WebElement> pickup = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

        System.out.println("Total no of pickup points are "+pickup.size());


        pickup.get(5).click();
//        for(WebElement ele : pickup){
//            if(ele.getText().equals("Yelahanka, Bangalore")){
//                ele.click();
//            }
//
//           // System.out.println(ele.getText());
//        }

        Thread.sleep(2000);


    }
}