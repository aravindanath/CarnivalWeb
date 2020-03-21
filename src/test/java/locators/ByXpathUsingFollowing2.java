package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByXpathUsingFollowing2 extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void absXpath() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/tables");
		Thread.sleep(2000);
		

		String xpath ="//table[@id='table1']/tbody/tr/td[contains(text(),'FNAME')]//following::td[3]".replace("FNAME","Jason");

		String web = driver.findElement(By.xpath(xpath)).getText();

		System.out.println(web);


	}

}
