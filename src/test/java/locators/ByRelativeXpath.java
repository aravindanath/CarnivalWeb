package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByRelativeXpath extends LaunchBrowserUsingWebDriverManager{
	
	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium jobs in bangalore",Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	

}
