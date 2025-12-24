package basics;

public class Literals {
    public static void main(String[] args){
        int binaryNum = 0b101; // 0 followed 'b' means it is a binary literal.
        int hexNum = 0xFF; // x is for hexadecimal literal.
        int accountingNum = 1_000_000_000; // for better readability
        float stockPrice = 1_00_000.34f;
        double d = 10e23;
        char c = 'r';
        c--;

        System.out.println(binaryNum);
        System.out.println(hexNum);
        System.out.println(accountingNum);
        System.out.println(stockPrice);
        System.out.println(d);
        System.out.println(c);
    }
}
