package basics.generics.animals;

import java.io.Serializable;

public class Lion extends Animal{

    @Override
    public String toString() {
        return "Lion{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Lion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Lion(){
    }

    @Override
    public void speak(){
        System.out.println("Lion roaring......");
    }
}
