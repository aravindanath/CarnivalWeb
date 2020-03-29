package SeleniumBuiltins;

import openBrowser.LaunchChromeUseingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


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

       // pickup.get(5).click();
        for(WebElement ele : pickup){
            if(ele.getText().equals("Yelahanka, Bangalore")){
                ele.click();
            }

           // System.out.println(ele.getText());
        }

        Thread.sleep(2000);


        dest.sendKeys("Hyd");
        Thread.sleep(2000);
        List<WebElement> drop = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));

        System.out.println("Total no of Drop points are "+drop.size());

        drop.get(5).click();

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

        List<WebElement> onward = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
        Thread.sleep(2000);
        for(WebElement ele : onward){
            if(!ele.getText().equals("Apr 2020")){
                driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
                break;
            }
        }

        List<WebElement> onward1 = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
        for(WebElement ele : onward1){
            if(ele.getText().equals("16")){
                ele.click();
                break;
            }
        }



        Thread.sleep(3000);


        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-return-calendar.icon")).click();


        Thread.sleep(3000);


        //

        List<WebElement> return1 = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));
        for(WebElement ele : return1){
            if(!ele.getText().equals("May 2020")){
                driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
                break;
            }
        }

        List<WebElement> return2 = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));
        for(WebElement ele : return2){
            if(ele.getText().equals("16")){
                ele.click();
                break;
            }
        }





        driver.findElement(By.cssSelector(".fl.button")).click();


        Thread.sleep(3000);



    }
}