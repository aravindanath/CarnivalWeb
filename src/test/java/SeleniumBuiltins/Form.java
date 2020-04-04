package SeleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Genaric;

import java.util.List;

public class Form extends LaunchBrowserUsingWebDriverManager {




    @Test

    public void formAutomation() throws InterruptedException {

        driver.get("https://demoqa.com/automation-practice-form/");

        driver.findElement(By.xpath("//strong[text()='Partial Link Test']")).click();

        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vetri");

        driver.findElement(By.cssSelector("#buttonwithclass")).click();

        WebElement lastName = driver.findElement(By.xpath("//strong[text()='Last name:']"));

        Genaric.scrollTillElement(driver,lastName);

        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));

        for(int i=0; i<radio.size();i++){
            radio.get(i).click();
            Thread.sleep(1000);
        }



        Thread.sleep(2000);

        String gender = "Male";
        String xpath = "//input[@type='radio' and @value='GENDER']".replace("GENDER",gender);

        driver.findElement(By.xpath(xpath)).click();


        WebElement male = driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
        Thread.sleep(2000);
        if(male.isSelected()){

            driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
        }
        Thread.sleep(2000);


        List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("Total no of Check box: "+cb.size());


        for(WebElement ele : cb){
            ele.click();
            Thread.sleep(1000);
        }


       WebElement continent = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));

        for(int i=0;i<4;i++){
        Genaric.selectByindex(continent,i);
            Thread.sleep(1000);
            }
        Thread.sleep(2000);
        for(int i=5;i>1;i--){
            Genaric.deSelectByIndex(continent,i);
            Thread.sleep(1000);
        }


    }
}
