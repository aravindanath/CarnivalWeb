package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

public class ByRelativeXpathWithANd extends LaunchBrowserUsingWebDriverManager{
	
	@Test
	public void absXpath() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text'and @name='firstname']")).sendKeys("Arvind");
		Thread.sleep(2000);


		////input[@type='text' and @name ='firstname' or @id='u_0_m']
		//*[@type='text' and @name ='firstname' or @id='u_0_m']
	}
	
	

}
