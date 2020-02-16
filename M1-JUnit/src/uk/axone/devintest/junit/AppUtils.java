package uk.axone.devintest.junit;

import org.junit.Test;

public class AppUtils {

    @Test
    public int add(int x, int y){
        System.out.println("Adding "+x+" and "+ y);
        return x - y;
    }
@Test
    public int multiply(int x, int y){
        System.out.println("Multiplying "+x+" and "+ y);
        return x * y;
    }

}
