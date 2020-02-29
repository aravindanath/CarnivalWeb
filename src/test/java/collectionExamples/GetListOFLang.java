package collectionExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;
public class GetListOFLang {
    WebDriver driver;

    @Test
    public void lang(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        List<WebElement> ele =driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

        System.out.println("Total no of Lang "+ ele.size());
        ArrayList<String> lang =  new ArrayList<String>();
        for(WebElement element : ele){
//            System.out.println("Unsorted values : " +element.getText());
            lang.add(element.getText());
        }


        System.out.println("UnSorted values : "+lang);
        Collections.sort(lang);
        System.err.println("Sorted values : "+lang);
        driver.quit();



    }

}
