package uk.axone.devintest.Inheritence;

public class PhoneTest {

    public static void main(String[] args) {
       // Phone myphone = new Phone();
       // myphone.makeCall(234);
      //  myphone.receiveCall();

//imstance of mobilephone  class can inherit properties from phone class even with out implemnting th emobile phone class
      //  as all capabilities of partent class can be inherited in child class
      //  MobilePhone mob = new MobilePhone();
     //   mob.makeCall(345);
      //  mob.receiveCall();

      //  mob.sendSMS();

      //  mob.hashCode();// refer java API spec. java.lang package, ie java.lang.Object which is root class for phone class by default

        SmartPhone smt = new SmartPhone("apple");
        smt.receiveCall(3,5); //can run all the metrhods in the mobile phone and Phone class
        smt.startGPSreceiver();

    }

}


