package basics.collections.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args){
        List<String> names = List.of("Mumbai", "Pune", "Chennai", "Kolkata", "Indore", "Surat");
        System.out.println(names.stream().collect(Collectors.counting()));
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> collect = names.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collect);

        System.out.println(names.stream().collect(Collectors.partitioningBy(x -> x.length() > 4)));

        System.out.println(names.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));

        //count occurrence of each word in the sentence
        String sentence = "hello world hello java world";
        Stream<String> sentenceStream =  Arrays.stream(sentence.split(" "));
        System.out.println(sentenceStream.collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        //Partitioning even and odd numbers
        List<Integer> l2 = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(l2.stream().collect(Collectors.groupingBy(x -> x % 2 == 0 ? "even" : "odd")));

        Map<Integer, List<String>> map =
                names.stream()
                        .collect(Collectors.groupingBy(
                                String::length,
                                Collectors.mapping(String::toUpperCase, Collectors.toList())
                        ));

        System.out.println(map);

        System.out.println(names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(String::length, Collectors.toSet())
        )));

       System.out.println(names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(
                        s -> s.charAt(0),
                        Collectors.counting()
                )
        )));

    }
}
