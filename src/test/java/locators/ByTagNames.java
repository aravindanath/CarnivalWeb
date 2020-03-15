package locators;



import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import browsers.LaunchBrowserUsingWebDriverManager;

import java.util.List;

public class ByTagNames extends LaunchBrowserUsingWebDriverManager {

	@Test
	public void search() throws InterruptedException {

		driver.get("https://www.google.in");

		List<WebElement> links =  driver.findElements(By.tagName("a"));

		System.out.println("Total no of links "+links.size());

		for(WebElement ele : links){
			System.out.println(ele.getText() +" ---->> " + ele.getAttribute("href"));

		}


	}
}
