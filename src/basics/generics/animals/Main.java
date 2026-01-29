package basics.generics.animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Animal animal = new Animal();

        AnimalPrinter<Lion> lionPrinter = new AnimalPrinter<>(lion);
        lionPrinter.print();

        AnimalPrinter<Tiger> tigerPrinter = new AnimalPrinter<>(tiger);
        tigerPrinter.print();

        AnimalPrinter<Animal> animalPrinter = new AnimalPrinter<>(animal);
        animalPrinter.print();

        shoutAnimal(lion);
        meetAnimal(lion, tiger);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        printList(nums);

        List<Lion> lions = new ArrayList<>();
        lions.add(lion);
        printList(lions);

    }

    // Generic methods
    private static <T> void shoutAnimal(T animalToShout){
        System.out.println(animalToShout + "!!!!!");
    }

    // Generic methods
    private static <T extends Animal, V extends Animal> void meetAnimal(T firstAnimal, V secondAnimal){
        System.out.println(firstAnimal + " meeting " + secondAnimal);
    }

    // Generic methods
    private static <T extends Animal, V extends Animal> V returnAnimal(T firstAnimal, V secondAnimal){
        System.out.println(firstAnimal + " meeting " + secondAnimal);
        return secondAnimal;
    }

    // Generic methods
    private static <T> void printList(List<T> things){
       System.out.println(things);
    }
}
