package basics.collections.arraylist.questions;

import java.util.*;

import static basics.collections.arraylist.questions.DuplicateRemover.removeDuplicates;

public class FrequencyCounter {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(21, 3, 4, 4, 6, 3, 1));
        System.out.println(getFrequency2(list));
    }

    public static Map<Integer, Integer> getFrequency(List<Integer> list){
        List<Integer> list2 = removeDuplicates(list);
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int i: list2){
            int count = Collections.frequency(list, i);
            frequency.put(i, count);
        }

        return frequency;
    }

    public static Map<Integer, Integer> getFrequency2(List<Integer> list){
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int i: list){
            int count = frequency.getOrDefault(i, 0);
            count++;
            frequency.put(i, count);
        }

        return frequency;
    }
}
