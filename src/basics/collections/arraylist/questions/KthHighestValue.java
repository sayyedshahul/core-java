package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.List;

public class KthHighestValue {

    //Returns the kth highest, otherwise returns the minimum value.
    public static int getkthHighest(List<Integer> list, int k){
        List<Integer> uniqueList = new ArrayList<>(DuplicateRemover.removeDuplicates4(list));
        uniqueList.sort(null);
        int index = uniqueList.size() - k;
        return index < 0 ? uniqueList.get(0) : uniqueList.get(index);
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(21, 3, 4, 4, 6, 3, 41));
        System.out.println(getkthHighest(list, 3));
    }
}
