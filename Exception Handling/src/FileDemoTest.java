import java.io.IOException;

public class FileDemoTest {


    public static void main(String[] args) throws IOException {

        FileDemo fdemo = new FileDemo();

        //fdemo.readFileHandle(); //no issues

        fdemo.readFilePropogate (); // this is also checked exception as signature of the method hasd throws class

    }
}
