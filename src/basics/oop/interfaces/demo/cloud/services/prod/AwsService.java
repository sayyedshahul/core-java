package basics.oop.interfaces.demo.cloud.services.prod;

import basics.oop.interfaces.demo.cloud.services.infra.CloudService;

public class AwsService implements CloudService {
    public void startService(){
        System.out.println("Starting Lambda Service....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Service interrupted");
        }
        System.out.println("Lambda Service running on port 1089....");
    }

    public void stopService(){
        System.out.println("Stopping Lambda Service....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Service interrupted");
        }
        System.out.println("Lambda Service stopped....");
    }
}

