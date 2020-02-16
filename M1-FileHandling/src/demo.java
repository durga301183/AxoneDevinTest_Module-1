

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo {

    public static void main(String[] args) throws IOException {

       FileInputStream file = new FileInputStream(new File("C:\\Users\\G S Sastry\\IdeaProjects\\Developer in Test-Dec 2019\\M1-FileHandling\\src\\Test Data.xlsx"));

        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheet("TestData");

        int rowstart = sheet.getFirstRowNum();

        int rowend = sheet.getLastRowNum();

        for (int i= rowstart;i< rowend ;i++) {

            Row row = sheet.getRow(i);

            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {

                Cell cell = row.getCell(j);

                System.out.println(cell.getStringCellValue());


            }

            System.out.println("------------------------");
        }

    }

}
