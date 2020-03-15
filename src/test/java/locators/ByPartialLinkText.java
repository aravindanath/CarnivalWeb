package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByPartialLinkText  extends LaunchBrowserUsingWebDriverManager{

	
	@Test
	public void search() throws InterruptedException {

		driver.get("https://www.google.in");
		driver.findElement(By.partialLinkText("Ima")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("Bangalore city",Keys.ENTER);
		Thread.sleep(2000);

	}

}
