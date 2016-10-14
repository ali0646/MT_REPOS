package Mukesh_Demo;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by SAYEM009 on 10/10/2016.
 */
public class DemoforMaven  {
    @Test
    public void Test() throws IOException, BiffException {
     System.out.println("Hello Maven");
        File src=new File("C:/Users/sayem009/desktop/Copy of DRMA Pricing Cleanup v3 FINAL.xls");
        System.out.println("Excel Loaded");

        Workbook wb=Workbook.getWorkbook(src);
        System.out.println("Workbook loaded");
        String s=wb.getSheet(0).getCell(0,1).getContents();
        System.out.println("Data is:"+s);
        int rows=wb.getSheet(0).getRows();
        int clmn=wb.getSheet(0).getColumns();
        System.out.println("Number of rows:"+"  "+ rows);
        System.out.println("Number of column:"+"  "+ clmn);

    }
}
