package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingContains extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Tod')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Refurbished & Open Box')]")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 11 pro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
	}

}
