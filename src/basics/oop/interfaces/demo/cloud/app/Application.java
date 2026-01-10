package basics.oop.interfaces.demo.cloud.app;

import basics.oop.interfaces.demo.cloud.services.infra.CloudService;
import basics.oop.interfaces.demo.cloud.services.infra.CloudServiceController;
import basics.oop.interfaces.demo.cloud.services.prod.AwsService;
import basics.oop.interfaces.demo.cloud.services.prod.AzureService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Application up....");
        System.out.println("Enter which service to run: ");
        System.out.println("1. AWS Service");
        System.out.println("2. Azure Service");

        int serviceOption = scn.nextInt();
        CloudService service;
        if(serviceOption == 1){
            service = new AwsService();
        }
        else{
            service = new AzureService();
        }

        CloudServiceController serviceController = new CloudServiceController();
        serviceController.runService(service);
    }
}
