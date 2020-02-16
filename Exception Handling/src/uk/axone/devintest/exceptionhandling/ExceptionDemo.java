package uk.axone.devintest.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("----- START ------");

        try {
//unchecked excceptions or runtime exception as we are not forced to handle exceptions
            int x = 10;   //in this piece iof code 2 exceptions happening, if i run this only first one will happen
            // as if it catches the first one ,control goes to catc block
            int y = 0;
            int z = x / y;
//below exceptions never happen until JVM executes as above already caught
           String[] strArr = new String[3];
            String str = strArr[4]; //index out of bound exception
        }

        //multiple catch blocks ,whtever goes wrong it goes to that catch block
        catch(ArithmeticException arthEx)//we should never have a catch block with nothing in it. atleast print stack trace
        {
         System.out.println("Division by zero not allowed");
        }

        catch(ArrayIndexOutOfBoundsException arrEx){
          System.out.println("Please check the array index passed");
        }

    catch (Exception ex) {
            System.out.println("something went wrong");
            System.out.println(ex); //prints name of the exception
            ex.printStackTrace();
        }
        finally{
            System.out.println("Inside finally block");
        }

        System.out.println("------ END -------");

    }

}


