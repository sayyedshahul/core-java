package basics.loops.whileloop.questions;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 6;

        if(num > 1){
            int i = 2;
            while (i * i <= num) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    break;
                }
                i++;
            }
            if (i * i > num) {
                System.out.println(num + " is a prime number.");
            }
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}
