package basics.generics.animals;

import java.util.ArrayList;
import java.util.List;

public class CovarianceDemo {
    public static void printArray(Animal[] animals){
        for(Animal animal: animals){
            System.out.println(animal);
        }
    }

//    public static void printList(List<Animal> animals){
//        for(Animal animal: animals){
//            System.out.println(animal);
//        }
//    }

    public static <T> void printList(List<T> animals){
        for(T animal: animals){
            System.out.println(animal);
        }
    }

    public static void printList2(List<?> animals){
        for(Object animal: animals){
            System.out.println(animal);
        }
    }

    public static void main(String[] args){
       // Tiger[] tigers = {new Tiger(10, "TigerA"), new Tiger(5, "TigerB")};
        //printArray(tigers); // Covariance in action here. As tiger is a subtype of Animal, in same-way Tiger[] is a subtype of Animal[].

        Lion lion1 = new Lion(23, "LionA");
        Lion lion2 = new Lion(20, "LionB");
        Tiger tiger1 = new Tiger(20, "TigerB");

        Animal[] animal = new Animal[2];
        animal[0] = lion1;
        animal[1] = lion2;

        Animal[] animal3 = new Animal[2];
        animal[0] = lion1;
        animal[1] = tiger1;

        Animal[] animal2 = new Lion[2];
        animal2[0] = lion1;
       // animal2[1] = new Tiger(20, "TigerB"); This will cause ArrayStoreException.

        //List<Animal> animalList = new ArrayList<Lion>(); So covariance doesn't apply directly in generics.
        List<Lion> lionList = new ArrayList<>();
        lionList.add(lion1);
        lionList.add(lion2);

       printList2(lionList); //This is a problem.

        Zoo zoo1 = new Zoo("ZooA");
        Zoo zoo2 = new Zoo("ZooB");

        List<Zoo> zooList = new ArrayList<>();
        zooList.add(zoo1);
        zooList.add(zoo2);
        //printList(zooList);
    }
}
