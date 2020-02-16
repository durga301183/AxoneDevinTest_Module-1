package uk.axone.devintest.classes;

public class constructorchain {


     String name;
    int salary;
    String address;

    public constructorchain(String durga){

    }


  public constructorchain(String name, int salary){
       this.name="durga";
       this.salary=1000;

  }

  public constructorchain(int salary)
  {
      this.salary= 1000;
  }

  void disp(){
      System.out.println("Employee Name: "+name);
      System.out.println("salary is " +salary);
  }

    public static void main(String[] args) {
        constructorchain obj= new constructorchain("durga");
        obj.disp();


      //  System.out.println("name is "+ name);
        //System.out.println("salary");


    }
}
