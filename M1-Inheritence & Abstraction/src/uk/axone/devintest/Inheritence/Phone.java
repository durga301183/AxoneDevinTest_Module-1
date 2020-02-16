package uk.axone.devintest.Inheritence;
//directly from java.lang.Object
public class Phone  extends java.lang.Object //not compulsary to extend
{

    private int num;
    private String make;
    private String model;
//default constructor
public Phone(){
    System.out.println("phone constructor");

}

public Phone(String make){
    System.out.println("make is ");
}
    void makeCall(int callNum){

        System.out.println("Phone is calling"+ callNum);

    }

    void receiveCall(){
        System.out.println("phone is receiving call");
    }
  private void hangUp(){


  }
 //methods with same name and different signatures in the same class is called over loading
  void receivecall(int x){

  }

  void receiveCall(int x, int y){

  }
}
