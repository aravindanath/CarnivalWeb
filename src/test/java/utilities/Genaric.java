package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

public class Genaric {


    public static void alertAccept(WebDriver driver) throws InterruptedException {

        Alert alert = driver.switchTo().alert();
        System.out.println("ALert title : " + alert.getText());
        Thread.sleep(2000);
        alert.accept();

    }


    public static void alertDismiss(WebDriver driver) throws InterruptedException {

        Alert alert = driver.switchTo().alert();
        System.out.println("ALert title : " + alert.getText());
        Thread.sleep(2000);
        alert.dismiss();

    }


    public static void sendTextAlert(WebDriver driver, String value) throws InterruptedException {

        Alert alert = driver.switchTo().alert();
        System.out.println("ALert title : " + alert.getText());
        Thread.sleep(2000);
        alert.sendKeys(value);
        Thread.sleep(2000);
        alert.accept();

    }


    public static void getMsg(WebDriver driver) {
        String text = driver.findElement(By.cssSelector("#result")).getText();
        System.out.
                println("Message " + text);

    }


    public static void selectByindex(WebElement element, int index) {
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }

    public static void selectByvalue(WebElement element, String val) {
        Select sel = new Select(element);
        sel.selectByValue(val);
    }

    public static void selectByvisiableText(WebElement element, String text) {
        Select sel = new Select(element);
        sel.selectByVisibleText(text);
    }

    public static void deselectByvisiableText(WebElement element, String text) {
        Select sel = new Select(element);
        sel.deselectByVisibleText(text);
    }

    public static void deselectAllVal(WebElement element) {
        Select sel = new Select(element);
        sel.deselectAll();
    }


    public static void deselectByval(WebElement element, String text) {
        Select sel = new Select(element);
        sel.deselectByValue(text);
    }

    public static void deSelectByIndex(WebElement element, int index) {
        Select sel = new Select(element);
        sel.deselectByIndex(index);
    }


    public static void mouseHover(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.moveToElement(ele).build().perform();
    }


    public static void clickAction(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.click(ele).build().perform();
    }

    public static void dragNDrop(WebDriver driver, WebElement src, WebElement tgt) {
        Actions act = new Actions(driver);
        act.dragAndDrop(src, tgt).build().perform();
    }


    public static void rightClick(WebDriver driver, WebElement tgt) {
        Actions act = new Actions(driver);
        act.contextClick(tgt).build().perform();
    }


    public static void switchToFrame(WebDriver driver, String frameName) {

        driver.switchTo().frame(frameName);
    }


    public static int usdInr(String doller) {
        String price = doller.replace("$", "").replace(",", "");

        if (doller.contains(".")) {
            String doll = doller.split(".")[0];
        }
        int doll = Integer.parseInt(price);
        int rs = doll * 75;
        return rs;
    }


    public void littleScrollVertical(WebDriver driver, String num) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, " + num + ");");
    }


    public void littleScrollHorizontal(WebDriver driver, String num) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy( " + num + ",0);");
    }
//scrollHeight

    public void ScrollTillEnd(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollHeight");
    }


    public static void jsClick(WebDriver driver, WebElement ele) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);

    }

    public static void scrollTillElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

    }

    public static void highlightElement(WebDriver driver, WebElement element, String colour) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='5px solid " + colour.toLowerCase() + "'", element);
    }


    public static String fullName() {
        Faker faker = new Faker(new Locale("en-IND"));
        String fName = faker.name().fullName();
        return fName;
    }

    public static String email() {
        Faker faker = new Faker(new Locale("en-IND"));
        String fName = faker.name().fullName();
        return fName.replace(".", "").replace(" ", "") + "@testmail.com";
    }


    public static String getVal(String key) throws IOException {

        FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir") + File.separator + "config.properties"));
        Properties prop = new Properties();
        prop.load(fis);
        String val = prop.getProperty(key);
        return val;
    }


    public static int genRollNumber() {

        int result = (int) (Math.random() * 78476);

        return result;

    }


    public static String getDate() {
        Date d = new Date();
        String dt = d.toString().replace(":", "_").replace(" ", "_");
        return dt;

    }


    public static String getOs() {

        String os = System.getProperty("os.name");
        return os;
    }


    public static String getHostName() {
        InetAddress ip;
        String hostname = "";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);

        } catch (Exception e) {

        }
        return hostname;
    }



}
