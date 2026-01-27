package basics.collections.streams;

import java.util.function.Supplier;

/* Supplier takes no input, but supplies one output. */
public class SupplierDemo {
    public static void main(String[] args){
        Supplier<String> currentTime = () -> "Session started at " + java.time.LocalDateTime.now();
        System.out.println(currentTime.get());
        System.out.println(currentTime.get());
    }
}
