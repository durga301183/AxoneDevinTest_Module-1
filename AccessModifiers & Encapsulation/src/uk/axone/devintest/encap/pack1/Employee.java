package uk.axone.devintest.encap.pack1;

public class Employee {

  private  String empID;
   private  String empName;
  private  int age;
    private int salary;
// keep variables as private and declare default level as its package level for encapsulation
     String getEmpID() {
        return empID;
    }

   // public void setEmpID(String empID) {
        //this.empID = empID; no need as constructor is usd to pass the empID
   // }

    String getEmpName() {
        return empName;
    }

     void setEmpName(String empName) {
         this.empName = empName;
    }

     int getAge()
     {
        return age;
    }
    void setAge(int age)
     {
        this.age = age;
    }

    int getSalary() {

         return salary;
    }
    void setSalary(int salary) {
        this.salary = salary;
    }

     Employee(String empID) {
        this.empID = empID;
        load(); }

     Employee(){
        // for creating an employee and called this constructor as we dont have any info yet
    }

    private void load() {

    //    this is private because if somebody , front end dev is using the class and wants to use this class,
        //    to take this form to push it to DB


        // this will retrieve the information foe employee id from the table
       // like select * from table etc and set all the fields of my class
    }

    void save()
    {
        // insert the row into the employee table

        }

//    public void setEmpID(String empID) {
      //  this.empID = empID;
    //} no need as the construvtor is passing the value
    /*if in real application if these values are added and saved then  method is called and
        it inserts a rown into the employee table

         */
    }
    /*retrieve the info for empID from the table ,  like select* from employee table where
          when class is called , the values will be set up and emp id<>empName= <values from DB
           age = <value from db>

           the method is made private because we dont want people outside the class to use load method.say for front end dev who has written the fron
           end using th eclass to take th edata and push it to the data base , they need not know the load method
 */








