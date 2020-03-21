package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByCSSID extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.amazon.com");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("ipad pro 2020",Keys.ENTER);

	}

}
