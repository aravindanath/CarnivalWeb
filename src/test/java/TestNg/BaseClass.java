package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

   protected WebDriver driver;
    // Anotation

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("========= Before Suite ==========");
    }


    @BeforeClass
    public void openBrowser() {
        System.out.println("Opening Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }


    @AfterClass
    public void close(){
        System.out.println("close");
        driver.close();
    }


    @AfterSuite
    public void aftetSuite(){
        System.out.println("========= After Suite ==========");
    }

}
