package openBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeUseingWebDriverManager {
	
	protected WebDriver driver;

	/**
	 * https://sites.google.com/a/chromium.org/chromedriver/capabilities
	 */
	@BeforeClass
	public void openBrowser() {
	
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(ops);
		
	}

	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	

}
