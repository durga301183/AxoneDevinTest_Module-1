package uk.axone.devintest.Inheritence;

public class SmartPhone extends MobilePhone{

    //default constructor
    /*
    if smart phone constructor is called and other phone and mobile are disabled still it prints out all others as well, which means
    when chidl class is initilased , all direct and indirect classes will be initilaed ans ble to run those as well including java.lang.obj as well
     */
    public SmartPhone(){
        System.out.println("smart phone constructor");

    }
    public SmartPhone(String make){
        super(make);
        System.out.println("the make is ");
    }
       void installApp(){

       }
   void startGPSreceiver(){

       System.out.println("this is GPS");
   }
}

