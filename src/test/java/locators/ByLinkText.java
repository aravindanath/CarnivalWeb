package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByLinkText  extends LaunchBrowserUsingWebDriverManager{

	
	@Test
	public void search() throws InterruptedException {
		
		driver.get("https://www.wikipedia.org/");

		driver.findElement(By.linkText("Wikimedia Foundation")).click();

}}
