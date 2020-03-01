package TestNg;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation4 extends  BaseClass{


    @Test
    public void openUrl() {
        System.out.println("open url");
        driver.get("https://www.flipkart.com");
    }


    @Test
    public void search() {
        System.out.println("search");
    }

    @Test
    public void addtoCard() {

        AssertJUnit.fail();
        System.out.println("add to cart");
    }


}