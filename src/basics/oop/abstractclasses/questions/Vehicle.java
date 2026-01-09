package basics.oop.abstractclasses.questions;

public abstract class Vehicle {
    public abstract String fuelType();

    public void startEngine(){
        System.out.println("Starting engine....");
    }
}

class Car extends Vehicle{
    public String fuelType(){
        return "Car fuel";
    }
}

class Bike extends Vehicle{
    public String fuelType(){
        return "Bike fuel";
    }
}
