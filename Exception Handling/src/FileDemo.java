import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

    public void readFileHandle() {

        /*
        fileinputstream needs to handle  and deal the exception which is trying to read the image file which is surrounded with try /catch
        these type are called checked exceptions
        fileinputstream reads the bytes of data from the image
         */

        //handling exception by surrounding the code with try catch
        try {
            FileInputStream fis = new FileInputStream("image.jpg");//method is opened now
            fis.read();
                //now we have to read the bytes from the image which we use read()
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        catch (IOException e)
            {
                e.printStackTrace();
            }

        }
//other way of dealing with exceptions called propogating of ecxeptions using keyword throws
    public void readFilePropogate() throws FileNotFoundException , IOException{

        FileInputStream fis = new FileInputStream("image.jpg");
//instead of handling this exception i'llpass it to whoevr is handling by keyword throws
                      fis.read();


        }
    }






