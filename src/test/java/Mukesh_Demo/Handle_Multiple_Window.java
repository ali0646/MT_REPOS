package Mukesh_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by SAYEM009 on 10/12/2016.
 */
public class Handle_Multiple_Window {
    @Test
    public void test()
    {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hdfcbank.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();//click the pop up

        String parent_window=driver.getWindowHandle();
        //System.out.println(parent_window);

        driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
        Set<String> s1= driver.getWindowHandles();
        System.out.println(s1);
        System.out.println(s1.size());
        Iterator iterator=s1.iterator();
        while (iterator.hasNext())//Comment
        {

        String currentwindow_id=iterator.next().toString();
        System.out.println(currentwindow_id);

        if(!currentwindow_id.equals(parent_window))
        {
            driver.switchTo().window(currentwindow_id);
            System.out.println(driver.getCurrentUrl());
            driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div[1]/ul/li[1]/a")).click();
            //driver.close();
        }
    }




        driver.quit();



    }
}
