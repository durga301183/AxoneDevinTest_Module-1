package uk.axone.devintest.classes;
//driver class
public class HumanBeingTest {

    public static void main(String[] args) {

        //ram is instance for Human being class using new keyword
        //able to initialise with out passing any parameters
        //forced to use the constrcutor with in the class and no longer abe to iniliase the default constructor
        //we can have multiple constructors also called as overloaded constructors
        //using constructor we are forcing a class at the time of initilasation.
       HumanBeing ram = new HumanBeing("","female");
//to run the method
                ram.eat();
                //ram.breathe();

        System.out.println(HumanBeing.numFingers);
        HumanBeing.walk();


                 //If we dont want to initialsie a constructor can follow the below method to give a similar result

        //but the variables will not be initialsied and takes value as null.SO we are forcing all the methods of the class to take in the
        //constructor values


               //   HumanBeing Tom = new HumanBeing();
                  //Tom.name= "T";
                 // Tom.gender= "male";
                 // Tom.eat();


    }
}
