package basics.loops.dowhile.questions;

public class SumOfDigits {
    public static void main(String[] args){
        int num = 7845;
        int sum = 0;
        do{
            sum += num % 10;
            num /= 10;
        }while(num > 0);
        System.out.println(sum);
    }
}
