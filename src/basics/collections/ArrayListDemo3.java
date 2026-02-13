package basics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(33);
        list.add(4);
        list.add(51);
        System.out.println(list);
        System.out.println(list.size());

        list.set(4, 9); // Existing indexes only

        list.add(1, 10); // This is for inserting new elements. You can also insert in middle.
        System.out.println(list);

        list.add(1, 10);
        System.out.println(list);

        list.remove(Integer.valueOf(10)); // Will remove the first occurrence

        System.out.println(list);
        //Collections.sort(list);
        list.sort(null);
        System.out.println(list);
    }
}
