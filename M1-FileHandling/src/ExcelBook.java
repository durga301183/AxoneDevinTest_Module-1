import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelBook {

    public static void main(String[] args) throws Exception {

//to specify where the excel file is located we needa class file
        File src = new File("C:\\Users\\G S Sastry\\IdeaProjects\\Developer in Test-Dec 2019\\M1-FileHandling\\src\\Test Data.xlsx");

        //loaded the excel sheet

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis); //excel sheet or work book. loading the book

        //used for .xlsx
        //specifying the correct work sheet

        XSSFSheet sheet1 = wb.getSheetAt(0);
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
            System.out.println(data0);
        //    int rowcount = sheet1.getLastRowNum();
        //  System.out.println("total rows"+ rowcount);

        //   for(int i= 0; i<rowcount;i++){
        //      sheet1.getRow(i).getCell(0).getStringCellValue();
        //     System.out.println(data0);
        //  }

        //all values in the row and column

            wb.close();
        }
    }










