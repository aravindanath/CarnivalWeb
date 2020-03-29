package SeleniumBuiltins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandlingPagination1 {
    public WebDriver driver;
    @Test
    //Created A method
   public void  openBrowser() throws InterruptedException {
        //LAUNCHING OF BROWSER
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
        driver.manage().window().fullscreen();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");

//        List<WebElement>namesElements=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
//        //Empty list
//        List<String>names=new ArrayList<String>();
//        for (WebElement namesElement:namesElements) {
//            names.add(namesElement.getText());

        //  }
        Thread.sleep(2000);
        String nextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");
        while (!nextButtonClassName.contains("disabled")) {
            driver.findElement(By.id("example_next")).click();

        }
    } }


