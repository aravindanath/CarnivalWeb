package SeleniumBuiltins;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSLCertificate_Handled {



    @Test
    public void SSLCertificateHandled() throws InterruptedException {
        WebDriver driver;
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        ops.addArguments("--incognito");
        ops.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
        driver.get("https://cacert.org/");

        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);

    }



}
