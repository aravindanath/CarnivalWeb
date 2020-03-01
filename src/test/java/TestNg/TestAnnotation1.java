package TestNg;


import org.testng.annotations.Test;
import org.testng.annotations.*;

@Listeners(RepoList.class)
public class TestAnnotation1  extends  BaseClass{


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }


    @Test
    public void openUrl() {
        System.out.println("open url");
        driver.get("https://www.myntra.com");
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