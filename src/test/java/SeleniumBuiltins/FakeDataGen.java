package SeleniumBuiltins;

import browsers.LaunchBrowserUsingWebDriverManager;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Genaric;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FakeDataGen {




    @Test

    public void formAutomation() throws InterruptedException {




        Faker faker = new Faker(new Locale("en-IND"));
        String auth =  faker.book().author();
        System.out.println(auth);

        System.out.println(Genaric.fullName());
        System.out.println(Genaric.email());

        List<String> data = new ArrayList<String>();

        for(int i=0;i<10;i++){
            data.add(Genaric.email());
        }

        System.out.println(data);

    }
}
