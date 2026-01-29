package basics.generics.animals;

public class Animal {
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal() {
    }

    public void speak(){
        System.out.println("Animal speaking.....");
    }
}
