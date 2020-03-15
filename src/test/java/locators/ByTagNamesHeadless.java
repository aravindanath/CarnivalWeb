package locators;


import browsers.LaunchBrowserUsingWebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagNamesHeadless  {

	WebDriver driver;

	@BeforeTest
	public void setup(){
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.addArguments("--incognito");
		ops.addArguments("--headless");
		ops.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(ops);
	}


	@Test
	public void search() throws InterruptedException {

		driver.get("https://www.myntra.com/");
		System.out.println("Title "+driver.getTitle());

		List<WebElement> links =  driver.findElements(By.tagName("a"));

		System.out.println("Total no of links "+links.size());

		for(WebElement ele : links){
			System.out.println(ele.getText() +" ---->> " + ele.getAttribute("href"));

		}

		driver.get("https://www.facebook.com");
		System.out.println("Title "+driver.getTitle());

	}
}
