

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class AppUtils_Test {

    AppUtils appUtil = new AppUtils();

  //  @DynamicTest
    public void add_t1(){
        int actResult = appUtil.add(10,10);
        int expResult = 20;
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    public void add_t2(){
        int actResult = appUtil.add(100,-10);
        int expResult = 90;
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_t1(){
        int actResult = appUtil.multiply(0,20);
        int expResult = 0;
        Assertions.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_t2(){
        int actResult = appUtil.multiply(6,-8);
        int expResult = -48;
        Assertions.assertEquals(expResult, actResult);
    }
}

