package basics.collections.hashmap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] main){
        HashMap<Integer, String> map = new HashMap<>();

        /*
        You can specify initial capacity and the load factor which is 0.75 by default. Default initial
        capacity is 16 and then doubles every time the size is reached.
         */
        HashMap<Integer, String> map2 = new HashMap<>(55, 0.9f);

        map.put(1, "Mumbai");
        map.put(2, "Tokyo");
        map.put(3, "London");
        map.put(4, "London");
       // map.put(null, "Indore"); keys can also be null.
       // map.put(null, "Berlin");
        map.put(3, "Moscow"); // Old key will be mapped with new value.
       // map.put(6, null); Values can be null multiple times.
        System.out.println(map);

        System.out.println(map.remove(3));
        System.out.println(map);

        map.put(5, "Michigan");
        System.out.println(map);
        System.out.println(map.remove(5, "Michigan"));

        System.out.println(map.get(1) + " city");

        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("London"));

        Set<Integer> keys = map.keySet();
        for(int i: keys){
            System.out.println(i + " --> " +map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry: entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        for(Map.Entry<Integer, String> entry: entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        Collection<String> mapValues = map.values();
        for(String value: mapValues){
            System.out.println(value);
        }

        mapValues.remove("LONDON"); // Remove first occurrence.
        System.out.println(map);
    }
}
