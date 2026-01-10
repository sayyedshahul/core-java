package basics.oop.interfaces.demo.cloud.services.prod;

import basics.oop.interfaces.demo.cloud.services.infra.CloudService;

public class AzureService implements CloudService {
    public void startService(){
        System.out.println("Starting Azure Kubernetes Service....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Service interrupted");
        }
        System.out.println("Azure Kubernetes Service running on port 1089....");
    }

    public void stopService(){
        System.out.println("Stopping Azure Kubernetes Service....");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Service interrupted");
        }
        System.out.println("Azure Kubernetes Service stopped....");
    }
}
