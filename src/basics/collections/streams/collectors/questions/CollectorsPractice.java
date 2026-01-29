package basics.collections.streams.collectors.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsPractice {
    public static void main(String[] args){
        List<String> names = List.of("ram","raj","shyam","om");

        // Group by length
        System.out.println(names.stream().collect(Collectors.groupingBy(
                String::length
        )));

        // Group by length but store uppercase versions
        System.out.println(names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(String::toUpperCase, Collectors.toList())
        )));

        // Count how many strings exist for each length.
        System.out.println(names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
        )));

        // Group strings by first character.
        System.out.println(names.stream().collect(Collectors.groupingBy(
                x -> x.charAt(0)
        )));

        // Group strings by length, but instead of the strings, store the first character of each string.
        System.out.println(names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(x -> x.charAt(0), Collectors.toList())
        )));

        List<String> things = List.of("apple","ape","bat","ball","egg");
        //Group strings by length and count how many strings start with a vowel in each group.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.filtering(x -> {List<String> vowels = List.of("a", "e", "i", "o", "u");
                return vowels.contains(x.substring(0, 1));}, Collectors.counting())
        )));

        //Group by length, then store the length of each string in the group.
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length,
                Collectors.mapping(String::length, Collectors.toList()))));

        /* Given a list of names, group by name length, but for each group,
        store a set of first letters (unique).
         */
        System.out.println(names.stream().collect(Collectors.groupingBy(String::length,
                Collectors.mapping(x -> x.substring(0, 1), Collectors.toSet()))));

        //Group by string length and count strings where the first character is a consonant.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.filtering(x -> {List<String> vowels = List.of("a", "e", "i", "o", "u");
                    return !vowels.contains(x.substring(0, 1));}, Collectors.counting())
        )));

        //Given a list of words, group by first letter and concatenate all words in each group into a single string.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                x -> x.substring(0, 1),
                Collectors.joining(", "))
        ));

        //Group by word length, but in each group, store the sum of ASCII values of the first character of the words.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(x -> x.charAt(0), Collectors.summingInt(x -> x)))
        ));

        //Given a list of strings, group by length, then for each group, store the longest string only.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.collectingAndThen(Collectors.maxBy((x, y) -> x.length() - y.length()), Optional::get))
        ));

        //Group by length, but use counting() inside mapping.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(x -> x, Collectors.counting()))));

        //Group by length and store only distinct uppercase letters of the first character.
        System.out.println(things.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(x -> x.substring(0, 1).toUpperCase(), Collectors.toSet())
        )));

        // Counting Word Occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
    }
}
