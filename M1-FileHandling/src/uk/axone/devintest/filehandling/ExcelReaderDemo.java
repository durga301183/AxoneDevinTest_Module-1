
package uk.axone.devintest.filehandling;

public class ExcelReaderDemo {
    //https://howtodoinjava.com/library/readingwriting-excel-files-in-java-poi-tutorial/


        public static void main(String[] args) {
ExcelReader myReader = new ExcelReader("C:\\Users\\G S Sastry\\Desktop\\TestData.xls", "testdata");//constructor
            int rows = myReader.getRowCount();
            int cols = myReader.getColumnCount();

            System.out.println(rows + "    "+ cols);
          System.out.println(myReader.getCellValue(1,1));
//all values in the row and column
           for(int i=0; i < rows ; i++){
             for(int j=0; j < cols ; j++){

                 System.out.print(myReader.getCellValue(i ,j) + "     ");

               }
                System.out.println();

           }

        }
    }





