package uk.axone.devintest.AbstractClasses;

public abstract class Vehicle {
    //Abstract Methods
    public abstract int getNumWheels();
    public abstract String getFuelType();
    abstract boolean isElectric();


    public Vehicle(){

    }

    //Non-abstract methods
    void moveForward(){
        System.out.println("Vehicle is moving forward");
    }

    void brake(){
        System.out.println("Vehicle is braking");
    }

    public void steer(){

    }

    public static void stop(){

    }

    public static void main(String[] args) {
        Vehicle.stop();
    }
}


