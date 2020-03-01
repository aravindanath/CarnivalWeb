package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ChromeBrowser {

   protected WebDriver driver;
    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

    }


    @AfterClass
    public void close(){

        driver.quit();

    }



}
