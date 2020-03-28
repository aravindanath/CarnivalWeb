package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingTextFunction extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='New Releases']")).click();
		/*
		//a[text()='New Releases']
		//a[contains(text(),'New Rele')]
		 */
		Thread.sleep(2000);
	}

}