package Mukesh_Demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by SAYEM009 on 10/11/2016.
 */
public class log4Demo {
    @Test
    public void Test(){


    Logger logger=Logger.getLogger("LogDemo");
    PropertyConfigurator.configure("Log4j.Properties");

        WebDriver driver=new FirefoxDriver();
        logger.info("Firefox opened");
        driver.manage().window().maximize();
        logger.info("window Maximized");
        driver.get("https://www.amazon.com/");
        logger.info("amazon site opened");
        driver.quit();
        logger.info("Firefox closed");


}}
