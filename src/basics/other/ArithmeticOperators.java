package basics.other;

public class ArithmeticOperators {
    public static void main(String[] args){
        System.out.println("----With longform operator----");
        int num1 = 7;
        int num2 = 3;
        int result;

        result =  num1 + num2;
        System.out.println("Addition --> " + result);

        result =  num1 - num2;
        System.out.println("Subtraction --> " + result);

        result =  num1 * num2;
        System.out.println("Multiplication --> " + result);

        result =  num1 / num2;
        System.out.println("Division --> " + result);

        result =  num1 % num2;
        System.out.println("Modulo --> " + result);

        System.out.println("----With shorthand operator----");
        int a = 8;
        int b = 4;

        a += b;
        System.out.println("Addition --> " + a);

        a -= b;
        System.out.println("Subtraction --> " + a);

        a *= b;
        System.out.println("Multiplication --> " + a);

        a /= b;
        System.out.println("Division --> " + a);

        a %= b;
        System.out.println("Modulo --> " + a);

        result = num1--;
        System.out.println("Post Decrement --> " + result);

        result = --num1;
        System.out.println("Pre Decrement --> " + result);
    }
}
