package basics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args){

        // Create a linked list
        LinkedList<Integer> list = new LinkedList<>();

        //Add elements to the list
        list.add(23);
        list.add(300);
        list.add(47632);

        System.out.println(list);

        System.out.println(list.get(1));

        list.addLast(231);
        list.addFirst(987654);

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(); // Removes the head.
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(300, 47632));
        list.removeAll(list2);
        System.out.println(list);

        list.removeIf(x -> x.toString().charAt(x.toString().length() - 1) == '1'); 
        System.out.println(list);
    }
}
