package basics.oop.abstractclasses.cloud.example;

public class AwsService extends CloudService{
    @Override
    void startService() {
        System.out.println("Starting Lambda Service....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Service interrupted");
        }
        System.out.println("Lambda Service running on port 1089....");
    }

    @Override
    protected void stopService() {
        System.out.println("Stopping Lambda Service....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Service interrupted");
        }
        System.out.println("Lambda Service stopped....");
    }
}
