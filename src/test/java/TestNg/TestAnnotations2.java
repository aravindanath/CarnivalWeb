package TestNg;


import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations2 extends BaseClass{



    @Test
    public void openUrl() {
        System.out.println("open url");
        driver.get("https://www.google.com");
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