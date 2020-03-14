package openBrowser;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.*;

 
public class SeleniumBuiltins  extends LaunchFireFox  {


   

 
    @Test
    public void search() {
    	driver.get("https://www.icicibank.com/");
        driver.findElement(By.className("pl-login-ornage-box")).click();
    }

   

}