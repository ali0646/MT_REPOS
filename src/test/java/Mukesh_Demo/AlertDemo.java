package Mukesh_Demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by SAYEM009 on 10/11/2016.
 */
public class AlertDemo {
    @Test
    public void Test() throws InterruptedException {
        Logger logger=Logger.getLogger("AlertDemo");
        PropertyConfigurator.configure("Log4j.Properties");

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
        Thread.sleep(2000);
        Alert alt=driver.switchTo().alert();
        String actualaltmsg=alt.getText();
        logger.info(actualaltmsg);
        String expectedmsg="Please select start place.";
        Assert.assertEquals(actualaltmsg,expectedmsg);
        alt.accept();
        logger.info("alert Accepted");
        driver.quit();

    }
}
