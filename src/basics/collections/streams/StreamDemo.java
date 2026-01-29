package basics.collections.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // constructor, getters
}

public class StreamDemo {
    public static void main(String[] args){
        List<Integer> nums2 = List.of(22, 33, 31, 47, 64);
        System.out.println(nums2.stream().filter(x -> x % 2 == 0).count());

        //Infinite Stream
        int i = 0;
        AtomicInteger value = new AtomicInteger(1);
        Stream<Integer> naturalNumbers = Stream.generate(() -> value.getAndIncrement()).limit(100);
        System.out.println(naturalNumbers.toList());

        Stream<Integer> naturalNumber2 = Stream.iterate(101, x -> x + 1).limit(100);
        System.out.println(naturalNumber2.toList());

        ArrayList<String> names = new ArrayList<>(List.of("Mumbai", "Tokyo", "Indore"));
        List<String> ab = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());

        ArrayList<String> names2 = new ArrayList<>();
        Optional<String> str =  names.stream().reduce(String::concat);
        System.out.println(str);

        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(names.stream().filter(x -> x.length() > 5).toList());

        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Guava", "Banana"),
                Arrays.asList("Apple", "Orange"),
                Arrays.asList("Grape", "Lemon")
        );

        System.out.println(listOfList.stream()
                                    .flatMap(Collection::stream)
                                    .map(String::toUpperCase)
                                    .toList());

        List<String> sentences = Arrays.asList(
                "Java is powerful",
                "Streams are used for sequential data processing",
                "Collections framework is vast"
        );
        System.out.println(sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList());

        List<Book> books = List.of(
                new Book("Java Basics", 350, 150),
                new Book("Advanced Java", 500, 400),
                new Book("Spring Boot", 600, 300),
                new Book("Python Beginner", 350, 200)
        );

        System.out.println(books.stream()
                .filter(book -> book.getPrice() > 300 && book.getPages() >= 300 &&
                        book.getTitle().contains("Java")).map(Book::getTitle).toList());

        List<Employee> employees = List.of(
                new Employee("Ram", "IT", 23908),
                new Employee("Karim", "IT", 234908),
                new Employee("John", "IT", 434908),
                new Employee("Rahul", "SALES", 236627)
        );

        System.out.println(employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .map(x ->  x.getName() + ":" + (x.getSalary() * 1.10)).toList());

        //sorted()
        System.out.println(employees.stream().filter(x -> x.getDepartment().equals("IT"))
                .map(x ->  x.getName() + ":" + (x.getSalary() * 1.10)).sorted().toList());

        // Natural order sorting.
        System.out.println(sentences.stream().sorted().toList());

        // String length-based ascending sorting.
        System.out.println(sentences.stream().sorted((a, b) -> a.length() - b.length()).toList());

        // String length-based descending sorting.
        System.out.println(sentences.stream().sorted((a, b) -> b.length() - a.length()).toList());

        // Normal count
        System.out.println(employees.stream().map(x -> x.getDepartment()).count());

        // Distinct count
        System.out.println(employees.stream().map(x -> x.getDepartment()).distinct().count());

        // Limit and skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(20).limit(100).toList());

        boolean anyMatch = employees.stream().anyMatch(x -> x.getSalary() > 500000);
        System.out.println(anyMatch);

        boolean allMatch = employees.stream().allMatch(x -> x.getSalary() > 1000);
        System.out.println(allMatch);

        boolean noneMatch = employees.stream().noneMatch(x -> x.getSalary() > 1000);
        System.out.println(noneMatch);

        System.out.println(employees.stream().findFirst().get());

        List<Integer> nums3 = List.of(22, 4, 1, 7);
        System.out.println(nums3.stream().map(x -> x * x).sorted().toList());

        nums3.stream().reduce(Integer::sum).ifPresent(System.out::println);

        String name = "Republic of India";
        System.out.println(Arrays.stream(name.split("")).filter(x -> x.toLowerCase().equals("i")).count());
        System.out.println(name.chars().filter(x -> x == 'i').count());

        //Cumulative Sum
        AtomicInteger num = new AtomicInteger(0);
        System.out.println(nums3.stream().map(num::addAndGet).toList());

        nums3.stream().peek(System.out::println).count(); // Peek is not run here due to internal optimization
        nums3.stream().peek(System.out::println).toList(); // Peek is run here.

        System.out.println(nums3);
        System.out.println(nums3.stream().min(Comparator.<Integer>naturalOrder().reversed()).get());
    }
}
