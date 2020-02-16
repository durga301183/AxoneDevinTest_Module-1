import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelRead {


    public static void main(String[] args) throws IOException {

        File obj = new File("C:\\Users\\G S Sastry\\IdeaProjects\\Developer in Test-Dec 2019\\M1-FileHandling\\src\\Test Data.xlsx");

        FileInputStream fis = new FileInputStream(obj);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sht = wb.getSheet("TestData");

        XSSFRow objr = sht.getRow(0);
        XSSFCell objc = objr.getCell(1);

        System.out.println(objc.getStringCellValue());

        Iterator<Row> ritr = sht.iterator();

        while (ritr.hasNext()) {
            Row row = ritr.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                //Check the cell type and format accordingly
                //    switch (cell.getCellType())
                //  {
                //    case Cell.CELL_TYPE_NUMERIC:
                //      System.out.print(cell.getNumericCellValue() + "t");
                //    break;
                //case Cell.CELL_TYPE_STRING:
                //  System.out.print(cell.getStringCellValue() + "t");
                //break;
                //     }
                //}
             //   System.out.println("");
            }

        }


    }
}







