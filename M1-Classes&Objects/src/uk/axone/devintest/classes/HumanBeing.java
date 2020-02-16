package uk.axone.devintest.classes;

public class HumanBeing {
    //variables describe the state
    //nonstatic variables and no non static attached to the variables
    //also called instance variables
    String name;
    String gender;
    int height;
    int dob;
    String eyeColour;
    String bloodGroup;
  //few more variables relevant but these variables are static or class variables
    // a unique copy stored for entire class and do not store for each instance of the class
    //final keyword helps not to change the value at all
   static  final int numEyes=2;
   static  int numFingers=2;

    //methods are verbs indicationg actions

    //constructors ar enot mandatory but of not written compiler adds the default cconstructor and able to initialise
    //created own constructor

    public HumanBeing(String hname, String hgender) {
/*
 what ever values are assigned to the variables they will be used in the class
 if the parameters assigned in the constructor is the sdme as the class variables then compiler gets confused and
  gives null so at this time we have to use an operator called"this" and refers to the current class
 */

//capturing info through a constructor when  an object ios created
        name = hname;
        gender = hgender;
//calling the method with in the constructor
        breathe();
         }

        // if we do not create a constructor, compiler by default creates a constructor ie why we are able to initialise a class
//like so
        // public HumanBeing(){

        // }//creating constructor by passing string variable

//methods to describe a behaviour i.e verbs action words

        public void eat()
    {
            //to run the method
        System.out.println(name + " is eating !  ");
        }
        //methods to describe a behaviour i.e verbs action words
        public void sleep () {
            System.out.println(name + " is sleeping !");
        }
        //methods to describe a behaviour i.e verbs action words
       //nonstatic method
        public void breathe () {
            System.out.println(name + " is breathing !");


            //can also have static methods, should not create an instance and should call directly
            //

    }
    /*
     static methods can only use static variables

     */



  public static void walk(){

      System.out.println(numFingers);
  }

    }








