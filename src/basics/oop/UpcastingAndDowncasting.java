package basics.oop;

class Ab{
    public void show(){
        System.out.println("In Ab show");
    }
}

class Bc extends Ab{
    public void show1(){
        System.out.println("In Bc show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args){
        Ab ab = new Bc(); // This is upcasting, needed to support runtime polymorphism.
        ab.show();

        Bc bc = (Bc) ab; // This is downcasting, needed to use specific functionality from the subclass like 'show1'.
        bc.show1();
    }
}
