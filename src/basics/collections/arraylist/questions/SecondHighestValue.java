package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.List;

public class SecondHighestValue {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(21, 3, 4, 6, 4, 3));
        List<Integer> list2 = DuplicateRemover.removeDuplicates(list);
        list2.sort(null);
        System.out.println(list2.get(list2.size() - 2));
    }
}
