package basics.collections.streams;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args){
        Consumer<Integer> printInteger = System.out::println;
        printInteger.accept(34);

        List<Book> books = List.of(
                new Book("Java Programming", 234, 175),
                new Book("Spring in Action", 550, 420)
        );

        Consumer<Book> printBooks = book -> {
            System.out.printf("%s, %d INR, %d pages%n",
            book.getTitle(), book.getPrice(), book.getPages());
        };

        books.forEach(printBooks);

    }
}
