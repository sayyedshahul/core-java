package basics.oop;

class Building{
    static String developerName = "RK Developers";
    int numberOfFloors;
    String buildingName;

    public void show(){
        System.out.println(developerName + " --> " + buildingName);
    }

    public static void show1(Building b){
        System.out.println(developerName + " --> " + b.buildingName);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args){
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
    }
}
