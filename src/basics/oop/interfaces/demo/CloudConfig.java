package basics.oop.interfaces.demo;

public interface CloudConfig {
    int MAX_UPLOAD_SIZE_MB = 10000;
    String DEFAULT_REGION = "India";

    void showConfig();
}

interface AdvanceCloudConfig extends CloudConfig{

}
