package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Genaric {



    public static void alertAccept(WebDriver driver) throws InterruptedException {

      Alert alert =  driver.switchTo().alert();
      System.out.println("ALert title : "+alert.getText());
        Thread.sleep(2000);
      alert.accept();

    }


    public static void alertDismiss(WebDriver driver) throws InterruptedException {

        Alert alert =  driver.switchTo().alert();
        System.out.println("ALert title : "+alert.getText());
        Thread.sleep(2000);
        alert.dismiss();

    }


    public static void sendTextAlert(WebDriver driver,String value) throws InterruptedException {

        Alert alert =  driver.switchTo().alert();
        System.out.println("ALert title : "+alert.getText());
        Thread.sleep(2000);
        alert.sendKeys(value);
        Thread.sleep(2000);
        alert.accept();

    }


    public static void getMsg(WebDriver driver){
        String text = driver.findElement(By.cssSelector("#result")).getText();
        System.out.
                println("Message "+text);

    }


    public static void selectByindex(WebElement element,int index){
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }

    public static void selectByvalue(WebElement element,String val){
        Select sel = new Select(element);
        sel.selectByValue(val);
    }

    public static void selectByvisiableText(WebElement element,String text){
        Select sel = new Select(element);
        sel.selectByVisibleText(text);
    }

    public static void deselectByvisiableText(WebElement element,String text){
        Select sel = new Select(element);
        sel.deselectByVisibleText(text);
    }

    public static void deselectAllVal(WebElement element){
        Select sel = new Select(element);
        sel.deselectAll();
    }


    public static void deselectByval(WebElement element,String text){
        Select sel = new Select(element);
        sel.deselectByValue(text);
    }

    public static void deSelectByIndex(WebElement element,int index){
        Select sel = new Select(element);
        sel.deselectByIndex(index);
    }


    public static void mouseHover(WebDriver driver, WebElement ele){
        Actions act = new Actions(driver);
        act.moveToElement(ele).build().perform();
    }




}
