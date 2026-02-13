package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.List;

public class ZeroesToLast {
    public static List<Integer> moveZeroesToLast(List<Integer> list){
        List<Integer> result  =  new ArrayList<>();
        int count = 0;

        for(int num: list){
            if(num == 0) count++;
            else{
                result.add(num);
            }
        }

        for(int i = 0; i < count; i++){
            result.add(0);
        }

        return result;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(List.of(0, 3, 0, 1, 0, 5, 9));
        System.out.println(moveZeroesToLast(list));
    }
}
