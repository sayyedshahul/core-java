package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.List;

public class SortedListMerge {
    public static void main(String[] args){
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(4, 5, 6);
        System.out.println(mergeSortedList3(list1, list2));
    }

    public static <T> List<T> mergeSortedList(List<T> list1, List<T> list2){
        List<T> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        mergedList.sort(null);
        return mergedList;
    }

    public static List<Integer> mergeSortedList2(List<Integer> list1, List<Integer> list2){
        List<Integer> mergedList = new ArrayList<>(list1);
        
        for(int element: list2){
            boolean isAtEnd = true;

            for(int i = 0; i < mergedList.size(); i++){
                if(element < mergedList.get(i)){
                    mergedList.add(i, element);
                    isAtEnd = false;
                    break;
                }
            }
            if(isAtEnd) mergedList.add(element);
        }
        return mergedList;
    }

    public static List<Integer> mergeSortedList3(List<Integer> list1, List<Integer> list2){
        List<Integer> mergedList = new ArrayList<>();

        int a = 0;
        int b = 0;

        while(a < list1.size() || b < list2.size()){
            if(a == list1.size()){
                mergedList.add(list2.get(b));
                b++;
            }
            else if(b == list2.size()){
                mergedList.add(list1.get(a));
                a++;
            }
            else if(list1.get(a) <= list2.get(b)){
                mergedList.add(list1.get(a));
                a++;
            }
            else{
                mergedList.add(list2.get(b));
                b++;
            }
        }
        return mergedList;
    }
}
