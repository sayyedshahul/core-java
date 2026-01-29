package basics.generics.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

    public static <T> List<T> convertArrayToList(T[] array, List<T> list){
        list.addAll(Arrays.asList(array));
        return list;
    }



    public static void main(String[] args){
        String[] cities1 = {"Mumbai", "Tokyo", "Jaipur"};
        List<String> cities2 = new ArrayList<>();
        cities2.add("Indore");
        cities2.add("Nagpur");
        cities2.add("Satara");

       // System.out.println(convertArrayToList(cities1, cities2));
        Object num = 3;
        String str = "India";
        num = str;
        System.out.println();
    }
}
