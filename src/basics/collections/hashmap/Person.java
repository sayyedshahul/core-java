package basics.collections.hashmap;

import java.util.HashMap;
import java.util.Objects;

public class Person {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object person){
        if(this == person) return true;
        if(!(person instanceof Person other)) return false;
        return id == other.id && Objects.equals(name, other.name);
    }
}

class Student{
    private String name;
    private int rollno;
}

class Main{
    public static void main(String[] args){
        Person person1 = new Person("Henry", 1);
        Person person2 = new Person("Edison", 2);
        Person person3 = new Person("Henry", 1);

        HashMap<Person, String> persons = new HashMap<>();
        persons.put(person1, "Entrepreneur");
        persons.put(person2, "Inventor");
        persons.put(person3, "Founder");

        System.out.println("Size of Hashmap --> " + persons.size());
        System.out.println("Job of " + person1.getName() + " --> " + persons.get(person1));
        System.out.println("Job of " + person3.getName() + " --> " + persons.get(person3));
    }
}