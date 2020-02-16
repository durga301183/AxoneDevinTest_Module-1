package uk.axone.devintest.classes;

import uk.axone.devintest.classes.Employee;

// create main method and invoke the class or called as driver class

public class EmployeeTest {


    public static void main(String[] args) {


        Employee ram= new Employee();
   //ram is the instance variable
        ram.empID= 123;
        ram.empName= "Durga";
        ram.gender= "female";

        System.out.println(ram.gender);


       Employee karthik= new Employee();

       karthik.gender= "male";

    }
}
