package basics.collections.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LruCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args){
        LruCache<Integer, String> userDetails = new LruCache<>(3);

        userDetails.put(1, "Imran");
        userDetails.put(2, "Thomas");
        userDetails.put(3, "Tesla");
        userDetails.put(4, "Ford");
        userDetails.put(5, "General Motors");

        System.out.println(userDetails);
    }
}
