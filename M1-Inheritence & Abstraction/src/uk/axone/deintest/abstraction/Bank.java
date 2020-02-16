package uk.axone.deintest.abstraction;

public interface Bank extends Company, UKSecStandards{

    public abstract  void depositCash(int amount);
//if curly braces are provided compiler will throw error so this is abstract method
    //all methods in interface are public and abstract
    //variables in interface are constants - public, static, final

   public static final  int FIN_INST_TYPE= 1; //not in purple colour as its understood

   public abstract  boolean withdrawCash(int amount);

   int checkBalance(); // in interface there is no implementation of classes

   int getSortcode();

}



