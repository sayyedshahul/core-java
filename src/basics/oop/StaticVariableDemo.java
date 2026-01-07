package basics.oop;

class Building{
    static String developerName;
    int numberOfFloors;
    String buildingName;

    //Used to put one-time logic before the class is used.
    static{
        developerName = "RK Developers";
        System.out.println("Inside Static block");
    }

    public Building(){
        numberOfFloors = 40;
    }

    public void show(){
        System.out.println(developerName + " --> " + buildingName);
    }

    public static void show1(Building b){
        System.out.println(developerName + " --> " + b.buildingName);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Building b1 = new Building();
        //Building.developerName = "SK Developers";
        b1.buildingName = "Sai Excellency";

        Building b2 = new Building();
        //Building.developerName = "FS Developers";
        b2.buildingName = "Global Living";

        b1.show();
        b2.show();

        Building b3 = new Building();
        b3.buildingName = "Tulsi Heights";
        Building.show1(b3);

        Building b4 = new Building();
        System.out.println("Number of floors b4 --> " + b4.numberOfFloors);

        System.out.println("Number of floors b3 --> " + b3.numberOfFloors);
       // Class.forName("basics.oop.Building"); This is to just load a class.
    }
}
