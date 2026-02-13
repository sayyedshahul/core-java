package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(21, 3, 4, 4, 6, 3));
        Collections.reverse(list);
        System.out.println(list);
    }

    public static <T> List<T> reverseList(List<T> list){
        List<T> list2 = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            list2.add(list.get(i));
        }
        return list2;
    }

    public static <T> List<T> reverseList2(List<T> list){
        int first = 0;
        int last = list.size() - 1;

        while(first < last){
            T element = list.get(last);
            list.set(last, list.get(first));
            list.set(first, element);
            first++;
            last--;
        }
        return list;
    }
}
