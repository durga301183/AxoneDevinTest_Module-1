
package uk.axone.devintest.chapter1;

public class MyClass {
    //These are variables in my program
    int i = 10;
    int j = 20;
    String str = "durga";

    //This is a method which adds two variables
    void add() {
        int c;
        c = i + j;
        System.out.println(c);
    }


/*public void divide(){
    int quotient= i/j;
}*/

//constructor

  /* similar to  method and  same name as class ,invoked when we initialise a class with new keyword
  Does not have return type ie we don't write void
  not mandatory-if no constructors are written , compiler adds the default one

   */
public static void main(String[] args) {
    System.out.println("hello");
   //creating instance for the class to call the methods
    MyClass mclass = new MyClass();//compiler is invoking a constructor
    mclass.add();
}
}

/**
 * for java docs
 *
 *
 *
 *
 *
 *
 */