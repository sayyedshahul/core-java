package basics.oop.abstractclasses.cloud.example.app;

import basics.oop.abstractclasses.cloud.example.AwsService;
import basics.oop.abstractclasses.cloud.example.CloudService;

public class Application {
    public static void main(String[] args){
        CloudService service = new AwsService();
        service.runJob();
    }
}
