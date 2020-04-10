package testScripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.Genaric;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void setup() throws IOException {

        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--disable-notifications");
            ops.addArguments("--incognito");
            ops.setAcceptInsecureCerts(true);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(ops);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions fio = new FirefoxOptions();
            fio.setAcceptInsecureCerts(true);
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().fullscreen();
        driver.get(Genaric.getVal("url"));
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() throws IOException {

        driver.quit();

    }


}
