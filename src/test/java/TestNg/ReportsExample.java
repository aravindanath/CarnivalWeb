package TestNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsExample extends  BaseClass{


    @Test
    public void openUrl() {

        Reporter.log("User is on home page");
        System.out.println("open url");
        driver.get("https://www.flipkart.com");
        Reporter.log("User is on "+ driver.getCurrentUrl());
    }


    @Test
    public void search() {
        System.out.println("search");
    }

    @Test
    public void addtoCard() {
        System.out.println("add to cart");
    }


}