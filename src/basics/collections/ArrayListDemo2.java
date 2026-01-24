package basics.collections;

import java.util.*;

public class ArrayListDemo2 {
    public static void main(String[] args){
        // Create an empty list with initial capacity of 10.
        ArrayList<Integer> list = new ArrayList<>();

        // Append elements to that list.
        list.add(2);
        list.add(34);
        list.add(489);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2)); // get value from index 2

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int i: list){
            System.out.println(i);
        }

        System.out.println(list.contains(212)); // check if 212 is present in the list.
        System.out.println(list.contains(23));

        System.out.println(list);
        list.remove(2); // remove object at index 2.
        list.remove(Integer.valueOf(2)); // remove Integer object which represents 2.

        list.add(1, 231); // Insert a value at a specific position.
        list.set(0, 543); // Replace a value at a specific position.
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(200); // 200 represents the initial capacity.
        list.trimToSize(); // Trims the list capacity to current size of the list as remove elements from the array don't automatically shrinks the capacity.

        List<String> list3 = new ArrayList<>();
        ArrayList<String> stringList = (ArrayList<String>) list3;

        System.out.println(stringList.size());

        list3.add("names");
        System.out.println(stringList.size());
        System.out.println(stringList.getClass().getName());

        List<String> list4 = Arrays.asList("A", "B", "C"); // Returns an immutable list.
        System.out.println(list4.getClass().getName());

        List<String> list5 = Arrays.asList("D", "E", "F");
        System.out.println(list5.getClass().getName());
       // list5.add("book");   This will throw an error as list5 is immutable.
        // list5.remove(1); same error as above.
        list5.set(1, "G"); // You can change existing positions, but you can't add or remove.

        List<String> list6 = new ArrayList<>(Arrays.asList("names", "books")); // This gives a normal modifiable list.
        System.out.println(list6.getClass().getName());
        list6.add("tables");

        List<String> list7 = List.of("red", "blue", "orange"); // This returns an unmodifiable list.
        //list7.set(1, "magenta"); error

        list6.addAll(list5); // This will append list5 contents to list6.
        System.out.println(list6);

        list6.addAll(1, list5); // This will insert list5 contents to list6 at index 1.
        System.out.println(list6);

        Object[] array1 = list6.toArray(); // This will convert the list and return an object array.
        String[] array2 = list6.toArray(new String[0]); // This will convert the list and return a String array.
        System.out.println(Arrays.toString(array1));

        Collections.sort(list6); // Sorts the list in place in ascending order.
        System.out.println(list6);

        list6.add("the");
        System.out.println(list6);

        list6.sort(null);// Sorts the list in place in ascending order.

        list6.add("four");
        list6.sort((a, b) -> Integer.compare(a.length(), b.length())); // Sorts the list in place according to the Comparator.
        System.out.println(list6);

        list6.sort((a, b) -> -1 * Integer.compare(a.length(), b.length())); // Sorts the list in place in reverse order.
        System.out.println(list6);

        list6.sort(Comparator.comparingInt(String::length)); // Sorts the list using method reference to create a comparator object.
        System.out.println(list6);

        list6.sort(Comparator.comparingInt(String::length).reversed()); // in reverse order.
        System.out.println(list6);

        list6.sort(Comparator.comparing(String::length)); // Use comparing when the comparing value is of non-primitive type.
        System.out.println(list6);

        list6.sort(Comparator.<String>naturalOrder().thenComparingInt(String::length)); // First sort in the natural order then sort on the basis of length.
        System.out.println(list6);
    }
}
