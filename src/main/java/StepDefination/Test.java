package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SAYEM009 on 10/6/2016.
 */

public class Test {
    @org.testng.annotations.Test
    public void test()
    {
        WebDriver driver=new FirefoxDriver();
        System.out.print("Hello");
    }
}
