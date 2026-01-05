package basics.other;

/**
 * Type Conversion:
 * Automatic widening conversion with no data loss.
 *
 * Type Casting:
 * Explicit narrowing conversion that may cause data loss.
 *
 * Type Promotion:
 * Automatic widening of operands during expression evaluation.
 */

public class TypeConversion {
    public static void main(String[] args){
        //assigning byte to integer type.
        byte a = -128;
        int num = a;
        System.out.println(num);

        //assigning integer to byte type, doesn't work without explicit casting.
        int num2 = -123;
        byte b2 = (byte) num2;
        System.out.println(b2);

        //assigning float to integer, doesn't work without explicit casting.
        float k = 34.2f;
        int num3 = (int) k;
        System.out.println(num3);

        /*
        In Java, smaller numeric types like byte, short, and char are
        automatically promoted to int during arithmetic expressions.
        If operands are of different types, Java
        promotes them to the largest type involved to prevent data loss.
         */
        byte b3 = 15;
        byte b4 = 42;
        int result = b3 + b4;
    }

}
