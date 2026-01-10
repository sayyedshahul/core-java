package basics.oop.interfaces.demo;

class RunCloudConfig implements CloudConfig{
    @Override
    public void showConfig() {
        System.out.println(CloudConfig.MAX_UPLOAD_SIZE_MB);
    }
}

public class Application {
    public static void main(String[] args){
        System.out.println(AdvanceCloudConfig.MAX_UPLOAD_SIZE_MB);
        RunCloudConfig cc = new RunCloudConfig();
        cc.showConfig();
    }
}
