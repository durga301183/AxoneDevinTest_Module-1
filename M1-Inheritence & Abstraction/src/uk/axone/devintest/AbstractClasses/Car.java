package uk.axone.devintest.AbstractClasses;

public class Car extends Vehicle {

    @Override
    public int getNumWheels() {
        return 4;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    @Override
    boolean isElectric() {
        return false;
    }


}
