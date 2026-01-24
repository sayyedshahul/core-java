package basics.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
Vector is a legacy class introduced in Java 1.0. The most important feature of Vectors are thread-safety.
 */
public class VectorDemo {
    public static void main(String[] args){

        // Create a new vector.
        Vector<Integer> vctr = new Vector<>(5);

        Vector<Integer> vctr2 = new Vector<>(5, 3); // create a new vector with initial capacity of 5 and capacityIncrement of 3.

        vctr.add(1);
        vctr.add(2);
        vctr.add(3);
        vctr.add(4);
        vctr.add(5);
        vctr.add(6);

        System.out.println(vctr);

        System.out.println(vctr.capacity());

        vctr.add(7);
        vctr.add(8);
        vctr.add(9);

        vctr.add(9);
        vctr.add(9);
        System.out.println(vctr.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>(List.of(9, 10, 23, 33));

        Vector<Integer> vctr4 = new Vector<>(linkedList);
        System.out.println(vctr4);
    }
}
