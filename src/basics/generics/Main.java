package basics.generics;

public class Main {
    public static void main(String[] args){
        // Without generics
        System.out.println("Without generics");
        IntegerPrinter integerPrinter = new IntegerPrinter(3);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(41.23);
        doublePrinter.print();

        // With generics
        System.out.println("With generics");
        Printer<Integer> integerPrinter2 = new Printer<>(3);
        integerPrinter2.print();

        Printer<Double> doublePrinter2 = new Printer<>(41.23);
        doublePrinter2.print();
    }
}
