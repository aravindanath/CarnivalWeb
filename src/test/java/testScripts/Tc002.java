package testScripts;

import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

public class Tc002 extends BaseTest{


    @Test
    public void Tc002() throws IOException, InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.login("AM_LG02");
    }


}
