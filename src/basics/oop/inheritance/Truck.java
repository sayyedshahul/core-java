package basics.oop.inheritance;

public class Truck extends Vehicle{
    public void loadCargo(){
        System.out.println("Loading cargo...");
        System.out.println("Cargo loaded sucessfully");
    }

    public void unloadCargo(){
        System.out.println("Unloading cargo...");
        System.out.println("Cargo unloaded sucessfully");
    }

    public void startVehicle(){
        System.out.println("Starting truck engine..");
    }
}
