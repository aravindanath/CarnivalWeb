package TestNg;


        import org.testng.annotations.Test;

public class DependsOn {

    // Anotation
    @Test()
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @Test(dependsOnMethods = "openBrowser")
    public void openUrl() {
        System.out.println("open url");
    }


    @Test(	priority=4)
    public void search() {
        System.out.println("search");
    }

    @Test(	priority=3)
    public void addtoCard() {
        System.out.println("add to cart");
    }

}