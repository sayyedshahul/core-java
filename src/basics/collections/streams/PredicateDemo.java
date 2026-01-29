package basics.collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Book{
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }

    public Book(String title, int price, int pages) {
        this.title = title;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    String title;
    int price;
    int pages;
}

public class PredicateDemo {
    public static void main(String[] args){
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(2));

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(2));

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test("Name"));

        Predicate<String> isLengthGreaterThan5 = x -> x.length() > 5;
        System.out.println(isLengthGreaterThan5.test("Name"));

        Predicate<Integer> isBetween10And50 = x -> x >= 10 && x <= 50;
        System.out.println(isBetween10And50.test(9887));

        Predicate<String> startsWithJava = x -> x.startsWith("Java");
        System.out.println(startsWithJava.test("Java Program"));

        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);
        System.out.println(isPositiveAndEven.test(-9));

        Predicate<Integer> isOddOrNegative = isEven.negate().or(isPositive.negate());
        System.out.println(isOddOrNegative.test(-9));

        Book book1 = new Book("Java Programming", 234, 175);
        Predicate<Book> isPriceGreaterThan500 = x -> x.getPrice() > 500;
        Predicate<Book> isPriceAndPagesGreater = x -> x.getPrice() > 500 && x.getPages() > 300;
        Predicate<Book> isTitleContains = x -> x.getTitle().contains("Java") && !x.getTitle().contains("Beginner");

        List<Integer> nums = new ArrayList<>(List.of(23, 12, 37627, 8893, 762));
        System.out.println(nums);
        nums.removeIf(isEven.negate());
        System.out.println(nums);
        checkPredicateOn1To10(isPositiveAndEven);
    }

    private static void checkPredicateOn1To10(Predicate<Integer> filter){
        for(int i = 1; i <= 10; i++){
            System.out.println(filter.test(i));
        }
    }
}
