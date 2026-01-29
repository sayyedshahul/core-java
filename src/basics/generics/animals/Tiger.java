package basics.generics.animals;

public class Tiger extends Animal{
    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Tiger(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tiger(){
    }

    @Override
    public void speak(){
        System.out.println("Tiger roaring.....");
    }
}
