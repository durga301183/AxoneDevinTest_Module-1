package uk.axone.devintest.classes;

import java.io.File;

public class Variables {

    /*
    Global variables are outside the methods and constructors and can be used through out the class

    can be either static or non static variables

    1. instance variables are non static
    2.class variables are static
     */

    String str; // instance variable/non static
    HumanBeing ram; //instance variable
    Employee karthik;// instance variable
    int i;// primitive data type or noin static or instance variable

   //class variables or static
    //should ve declared at the class level
    static String name;
    static Employee sridevi;
    static int A;
    static File readme;


    /*
    local variables
    1. methods local variable
   2.method arguments
    3.scope is limited to that method only.
   */

    public int doSomething(int num){
        i=10;
        str ="axone";
        String print ="do something";

        return num;

    }

}

