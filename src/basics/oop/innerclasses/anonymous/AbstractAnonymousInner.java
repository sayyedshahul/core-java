package basics.oop.innerclasses.anonymous;

abstract class Refrigerator{
    public abstract void startRefrigerator();
}

public class AbstractAnonymousInner {
    public static void main(String[] args){
        Refrigerator Lgfridge = new Refrigerator(){
            public void startRefrigerator(){
                System.out.println("LG fridge starting...");
            }
        };

        Lgfridge.startRefrigerator();
    }
}
