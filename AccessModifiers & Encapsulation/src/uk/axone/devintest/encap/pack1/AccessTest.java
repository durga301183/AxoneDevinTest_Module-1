package uk.axone.devintest.encap.pack1;

public class AccessTest {


    public static void main(String[] args) {

        AccessModifiers accMod = new AccessModifiers();
        //private variables and methods cannot be accessed outside the class
        //accMod.privateMethod();
        //accMod.j=2;

        accMod.protectedMethod();
        accMod.defaultMethod();
        accMod.publicMethod();


    }
}


