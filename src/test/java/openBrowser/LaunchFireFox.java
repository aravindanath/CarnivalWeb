package openBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFireFox {
	
	WebDriver driver;

	 
	@BeforeClass
	public void openBrowser() {
	
		 
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	
	
	
	

}
