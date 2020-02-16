package uk.axone.devintest.AbstractClasses;

public class VehicleTest {
    public static void main(String[] args) {

        //Abstract classes cannot be instantiated
        //Vehicle myVh = new Vehicle();

        Car myCar = new Car();
        myCar.getFuelType();
        myCar.moveForward();//inherited method

    }
}

