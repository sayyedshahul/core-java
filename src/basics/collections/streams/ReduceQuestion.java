package basics.collections.streams;

import java.util.List;
import java.util.Optional;

/*
You have a List<Book>:

class Book {
    private String title;
    private double price;
    private int pages;

    // constructor + getters
}


Example list:

List<Book> books = List.of(
    new Book("Java Basics", 250, 150),
    new Book("Advanced Java", 500, 400),
    new Book("Spring Boot", 600, 300),
    new Book("Python Beginner", 350, 200)
);

Task

Using streams + reduce() (not sum(), collect(), or loops):

Find the most expensive book

Return its title only
 */
public class ReduceQuestion {
    public static void main(String[] args){
        List<Book> books = List.of(
                new Book("Java Basics", 250, 150),
                new Book("Advanced Java", 500, 400),
                new Book("Spring Boot", 600, 300),
                new Book("Python Beginner", 350, 200)
        );

        books.stream().reduce((x, y) ->
                x.getPrice() < y.getPrice() ? y : x).ifPresent(b -> {System.out.println(b.getTitle());});
    }
}
