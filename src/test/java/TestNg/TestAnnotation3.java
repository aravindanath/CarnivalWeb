package TestNg;


import org.testng.annotations.Test;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestAnnotation3 extends  BaseClass{


    @Test
    public void openUrl() {
        System.out.println("open url");
        driver.get("https://www.amazon.com");
    }


    @Test
    public void search() {
        System.out.println("search");
    }

    @Test
    public void addtoCard() {


        System.out.println("add to cart");

        throw  new SkipException("Imskipping");
    }


}