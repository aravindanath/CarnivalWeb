package openBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LaunchChrome {
	
	WebDriver driver;

	String macpath = "/Users/aravindanathdm/Documents/driver/chromedriver";
	String winpath = System.getProperty("user.dir")+File.separator+"driver"+File.separator+"chromedriver.exe";
	
	@BeforeClass
	public void openBrowser() {
	
		if(System.getProperty("os.name").contains("Windows")) {
			System.out.println("Windows");
			System.setProperty("webdriver.chrome.driver", winpath);
		} else if(System.getProperty("os.name").equals("Mac OS X")) {
			System.err.println("Mac");
			System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/driver/chromedriver");
		}
		driver = new ChromeDriver();
		
	}
	
	
	
	

}
