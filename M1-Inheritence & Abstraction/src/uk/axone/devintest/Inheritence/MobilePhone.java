package uk.axone.devintest.Inheritence;
//child class for Phone class
// indirectly from java.lang.Object
public class MobilePhone extends Phone {

//default constructor

    public MobilePhone(){
        System.out.println("mobile phone constructor");
    }

    public MobilePhone(String make)
    {
    System.out.println("make is of");
    }
    void sendSMS(){

        System.out.println("mobile phone is sending ans SMS");
    }
//override methods in base (parent) class, then it pick up from its own class when there are same methods for parent amd child class
   // child class method takes over
    //re writing a method that is already present in the parent class is called over-riding

    @Override
    //to make sure we get the correct signature and make others understand that there is already a method in base class as well
    void makeCall(int callNum){

      System.out.println("Mobile Phone is calling");

  }

  private void smartPhone(){
        //inherited methods can be called directly in the child class
      receiveCall();

  }
  //not over-riding as method names are different. to avoid these mistakes we use annotations

   // @Override //this annotation is to inform/warn the complier that mext method is going to be overridden
  void receivecall(){

  }

}
