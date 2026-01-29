package basics.generics.animals;

import java.io.Serializable;

/*
Interfaces can also be used here but with 'extends' keyword. You can also use one class and many interfaces for T simultaneously.

Like public class AnimalPrinter <T extends Animal & Serializable>
*/
public class AnimalPrinter <T extends Animal>{
    T animalToPrint;

    public AnimalPrinter(T animalToPrint){
        this.animalToPrint = animalToPrint;
    }

    public void print(){
        animalToPrint.speak();
    }
}
