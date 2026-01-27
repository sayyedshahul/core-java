package basics.collections.streams;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args){
        Function<Integer, Integer> doubleInt = x -> x * 2;
        System.out.println(doubleInt.apply(34));

        Function<Integer, Integer> tripleInt = x -> x * 3;
        System.out.println(doubleInt.andThen(tripleInt).apply(40));
        System.out.println(doubleInt.compose(tripleInt).apply(40)); //  First execute tripleInt then doubleInt.
        Function<Integer, Integer> identity =  Function.identity();
        System.out.println(identity.apply(352));

        Function<String, Integer> length = String::length;
        Function<Integer, Integer> square = x -> x * x;
        Function<String, String> toUpperCase = String::toUpperCase;

        Function<Integer, Boolean> isEven = x -> x  % 2 == 0;
        Function<String, String> isEmpty = x -> {if(x.isEmpty()) return "EMPTY"; else return x;};
        Function<Integer, String> categorize = x -> {if( x < 10) return "SMALL";
                                                    else if(x <= 50) return "MEDIUM";
                                                    else return "LARGE";};

    }
}
