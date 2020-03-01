package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo extends ChromeBrowser {



    @Test(priority = 2)
    public void hardAssertion(){

    driver.get("https://www.google.com");
    String title = driver.getTitle();

    System.out.println(title);
    Assert.assertEquals(title,"Google","Actual vs Excepted mismatch");

    WebElement ele = driver.findElement(By.name("q"));

    Assert.assertEquals(ele.isDisplayed(),false,"Button is not displayed");

    ele.sendKeys("Learning selenium", Keys.ENTER);



    }





    @Test(priority = 1)
    public void softAssertion(){


        driver.get("https://www.google.com");
        String title = driver.getTitle();

        System.out.println(title);
        SoftAssert sf = new SoftAssert();
        sf.assertEquals(driver.getTitle(),"Facebook");

        WebElement ele = driver.findElement(By.name("q"));

        ele.sendKeys("Learning selenium", Keys.ENTER);

        sf.assertAll();
    }

}
