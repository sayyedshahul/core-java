package basics.oop.innerclasses.anonymous.questions;

class Animal{
    void speak(){
        System.out.println("Animal speaks");
    }
}

public class Question1 {
    public static void main(String[] args){
        Animal dog = new Animal(){
            void speak(){
                System.out.println("Dog barks");
            }
        };

        Animal cat = new Animal(){
            void speak(){
                System.out.println("Cat meows");
            }
        };

        dog.speak();
        cat.speak();
    }
}
