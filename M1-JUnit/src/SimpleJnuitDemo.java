import org.junit.Ignore;
import org.junit.Test;

public class SimpleJnuitDemo {

    //junti framework runs on annotations
    //main method is not necessary to run the test thats beacause with the help of annotations

    /*
    Each time we ar eusing annotation, we are importing particular clas which has a code to make this clas run
    Jnuti is not included with jdk, shoudl be explicitly imported but its built in intelliJ

     */

    @Test
    public void test1()

    {
        supportTest();

        System.out.println("Executing Test1");

    }
    @Test
    public void test3(){

        System.out.println("Executing test 3");
    }


    public void test2(){

        System.out.println("Executing test 2");
    }


//these cannot be run but we can call these methods with in our test
    //we need it private as we cannot use this in a different class.However, this is a test class so keep iot private and it has to support my
    //with in my class
    private void supportTest()
    {
        System.out.println("Supporting test run..");
    }



















}









