package basics.oop.inheritance;

public class InheritanceDemo {
    public static void main(String[] args){
        Vehicle veh = new Vehicle();
        veh.startVehicle();
        veh.stopVehicle();

        Truck truck = new Truck();
        truck.startVehicle(); //Truck object has Vehicle methods.
        truck.loadCargo();
        truck.stopVehicle();

        truck.setEngine("V8");
    }
}
