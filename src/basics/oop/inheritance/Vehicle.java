package basics.oop.inheritance;

public class Vehicle {
    private int noOFWheels;
    private String color;
    private String engine;

    public int getNoOFWheels() {
        return noOFWheels;
    }

    public void setNoOFWheels(int noOFWheels) {
        this.noOFWheels = noOFWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void startVehicle(){
        System.out.println("Vehicle started...");
    }

    public void stopVehicle(){
        System.out.println("Vehicle Stopped.");
    }
}
