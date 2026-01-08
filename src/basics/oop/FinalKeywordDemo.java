package basics.oop;

class Vehicle{
    public final void startEngine(){
        System.out.println("Engine running.....");
    }
}

class Truck extends Vehicle{
   /*
    public void startEngine(){
        System.out.println("Engine running.....");
    }
    Not possbile due to final startEngine method in Vehicle class.
    */
}

final class Calc{ //This would prevent subclass creation.
    public void show(){
        System.out.println("In show");
    }
    public int add(int a, int b){
        return a + b;
    }
}

/*
class AdvCalc extends Calc{

}
Not possible as Calc is final
*/

public class FinalKeywordDemo {
    public static void main(String[] args){
        final int num = 9;
        //num = 4; This will throw an error.
        System.out.println(num);
    }
}
