package basics.oop.innerclasses.anonymous.questions;

class Vehicle{
    public void startVehicle(){
        System.out.println("Vehicle Started....");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            public void startVehicle() {
                System.out.println("Car Started....");
            }
        };

        Vehicle truck = new Vehicle() {
            public void startVehicle() {
                System.out.println("Truck Started....");
            }
        };

        car.startVehicle();
        truck.startVehicle();
    }
}
