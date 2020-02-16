package uk.axone.devintest.datatypes;

import java.io.File;

public class DataTypes {
//other than these 8 data types are called reference data type
    //primitive data types
    byte mByte= 127;
  short myShort= 32767;//max value it can hold and can use for arithmetic operations
    int myInt= 9746834;//most commonly used
    long myLong= 949734973489L;//always attach "L" at th end of the number

    //larger the number ,more capacity needed to store the number

  float myFloat= 10.956465f;
  //always attach "f" at th end of the number, 32bit number and store up to 7 decimal places on left side

double myDouble= 8564567.79548693859498569;//64bit-16 decimal places
    //for currency calculations

    char myChar= 's';//single quotes

    boolean b1= true;
    boolean b2= false;

    //reference dta types-are all classes
    String str= new String("dev in test");
    File f1= new File("readme.txt");//File class
    //any class from api spec to use, create an instance and initialise with new keyword


   //still employee is a reference datatype
    employee ram = new employee();
    employee karhtik = new employee();


}
