package basics.oop.interfaces.demo.cloud.services.infra;

public class CloudServiceController {
    public void runService(CloudService service){
        service.startService();
        service.stopService();
    }
}
