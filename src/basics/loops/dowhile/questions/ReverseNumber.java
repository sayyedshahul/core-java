package basics.loops.dowhile.questions;

public class ReverseNumber {
    public static void main(String[] args){
        int num = 113;
        do{
            System.out.print(num % 10);
            num /= 10;
        }while(num > 0);
    }
}
