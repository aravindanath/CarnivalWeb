package testScripts;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Genaric;

import java.io.IOException;

public class Tc001  extends BaseTest{


    @Test
    public void Tc001() throws IOException, InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.login("AM_LG01");
    }


}
