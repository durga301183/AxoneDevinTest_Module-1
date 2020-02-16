package uk.axone.devintest.AbstractClasses;

public class Byke extends Vehicle {
    @Override
    public int getNumWheels() {
        return 2;
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    boolean isElectric() {
        return true;
    }
}
