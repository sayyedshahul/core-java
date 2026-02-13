package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    public static <T> List<T> removeDuplicates(List<T> list){
        List<T> list2 = new ArrayList<>();
        for(T element: list){
            if(!list2.contains(element)){
                list2.add(element);
            }
        }
        return list2;
    }

    // Using LinkedHashSet
    public static <T> Set<T> removeDuplicates2(List<T> list){
        return new LinkedHashSet<>(list);
    }

    public static <T> List<T> removeDuplicates3(List<T> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    //Using streams
    public static <T> List<T> removeDuplicates4(List<T> list){
        return list.stream().distinct().toList();
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(21, 3, 4, 4, 6, 3));
        System.out.println(removeDuplicates(list));
    }
}
