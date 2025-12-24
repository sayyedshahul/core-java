package basics;

public class LogicalOperators {
    public static void main(String[] args){
        int a = 3;
        int b = 7;
        int m = 4;
        int n = 0;

        boolean result;
        result = m > n && a < b; // logical AND with short-circuit.
        System.out.println(result);

        result = m > n || a < b; // logical OR with short-circuit.
        System.out.println(result);

        result = m > n & a < b; // logical AND without short-circuit.
        System.out.println(result);

        result = m > n | a < b; // logical OR without short-circuit.
        System.out.println(result);

        result = !result; // logical NOT.
        System.out.println(result);

        result = n != 0 && m / n == 2; // this would raise an exception if we were to use single &.
    }
}
