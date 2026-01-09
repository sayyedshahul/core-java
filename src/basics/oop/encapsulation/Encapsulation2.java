package basics.oop.encapsulation;

class Car{
    private String engine;
    private int modelNo;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }
}

public class Encapsulation2 {
    public static void main(String[] args){
        Car mercedes = new Car();
        mercedes.setEngine("V8");
        mercedes.setModelNo(234);
    }
}
