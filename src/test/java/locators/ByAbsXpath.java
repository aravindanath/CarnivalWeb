package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByAbsXpath extends LaunchBrowserUsingWebDriverManager{
	
	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.google.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div/div/div[2]/input")).sendKeys("selenium jobs",Keys.ENTER);
		//input[@name='q']
		Thread.sleep(2000);
	}
	
	

}
