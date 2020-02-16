package uk.axone.devintest.encap.pack1;

public class EmployeeTest {


    public static void main(String[] args) {

        //scenario1- create new employee
        Employee emp = new Employee("xyz"); // creating a new employee so since we dont know yet , when info to the form submitted
//consumer of the class creating an instance of the class and setting up all the variables
        //data submitted from the form
       /*
        emp.empName = "ram";
        emp.age = 25;
        emp.salary = 243545;
        */
       //to save all this information we are creating a method called save
        emp.save();

        /*scenario 2 -load details for existing employee.so if somebody asking me the data or retrieve the details
    some info is given to access. Say for example, to retrieve the data give us the empID.Lets say the user enters the data
    and clicks on the load button. Constructor we are using is below as  we know as we have set the arguments
    public
                   Employee(String empID){
this.empID=empID;{

        to  execute a  non static method you need an instance and to get that you need a  constructor

        /* suppose th consumer ( anyone using the class ) of the class was cheeky and changed the values like this with out any protection and misused the class
        emp.empName = "866547808709";
        emp.age = -86567;
        emp.salary = -243545;
          set variables  in the class as private.

           if the variables are set up private then they cannot access the method so to so that we use getter and setter methods

           private String empName, in this scenario to set up the variables as private
           but still can access using getter and setter methods

         */
//TO EXECUTE A  NON STATIC METHOD YOU NEED AN INSTANCE AND TO GET AN INSTANCE YOU NEED AN CONSTRUCTOR
        Employee emp1 = new Employee("123"); {
            // empName= value from DB;
            //  age = value from DB;  // we are retrieving the information from the DB ans assigning it to all variables in the class

            //  emp1.name;
        }
             emp.setEmpName("Ram");
        emp.setAge(25);
        emp.setSalary(25000); //if invalid data is passed it will throw an exception and laways good to uise at package level access

        emp1.getAge();
        emp1.getEmpID();

    }
}








