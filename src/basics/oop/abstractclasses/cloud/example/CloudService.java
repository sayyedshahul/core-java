package basics.oop.abstractclasses.cloud.example;

public abstract class CloudService {
    public void runJob(){
        startService();
        stopService();
    }
    abstract void startService();
    abstract void stopService();
}
