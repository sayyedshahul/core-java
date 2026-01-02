package basics.loops.whileloop.questions;

//Given n print the n elements of Fibonacci series.
public class FibonacciNumber {
    public static void main(String[] args){
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        n -= 2;

        while(n != 0){
            int result = a + b;
            System.out.println(result);
            a = b;
            b = result;
            n--;
        }
    }
}
