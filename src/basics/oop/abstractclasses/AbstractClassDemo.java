package basics.oop.abstractclasses;

abstract class TV{
    public abstract void start();

    public void changeChannel(int channelNumber){
        System.out.println("Channel changed to " + channelNumber + " .............");
    }
}

class Panasonic extends TV{

    @Override
    public void start() {
        System.out.println("Starting Panasonic TV.....");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Panasonic tv = new Panasonic();
        tv.start();
        tv.changeChannel(90);
    }
}
