package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListRotated {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 34, 12, 31));
        List<Integer> list2 = new ArrayList<>();
        System.out.println(rotateKtimes2(list2, 0));
    }

    public static <T> List<T> rotateKtimes(List<T> list, int k){
        k = k % list.size(); // Normalize rotations
        List<T> result = new ArrayList<>(list);

        while(k > 0){
            T last = result.remove(result.size() - 1);
            result.add(0, last);
            k--;
        }
        return result;
    }

    public static <T> List<T> rotateKtimes2(List<T> list, int k){
        if(list.isEmpty()) return new ArrayList<>();

        int n = list.size();
        k = k % n;

        List<T> result = new ArrayList<>(Stream.concat(list.subList(n - k, n).stream(),
                list.subList(0, n - k).stream()).toList());

         return result;
    }
}
