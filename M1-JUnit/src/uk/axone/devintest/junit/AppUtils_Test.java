package uk.axone.devintest.junit;

import org.junit.Assert;
import org.junit.Test;

public class AppUtils_Test {

   AppUtils appUtil = new AppUtils();

   @Test
   public void add_t1(){
      int actResult = appUtil.add(10,10);
      int expResult = 20;
      Assert.assertEquals(expResult, actResult);
   }

   @Test
   public void add_t2(){
      int actResult = appUtil.add(100,-10);
      int expResult = 90;
      Assert.assertEquals(expResult, actResult);
   }

   @Test
   public void multiply_t1(){
      int actResult = appUtil.multiply(0,20);
      int expResult = 0;
      Assert.assertEquals(expResult, actResult);
   }

   @Test
   public void multiply_t2(){
      int actResult = appUtil.multiply(6,-8);
      int expResult = -48;
      Assert.assertEquals(expResult, actResult);
   }
}
