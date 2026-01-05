package basics.loops.dowhile.questions;

public class CountDigits {
    public static void main(String[] args){
        int num = 0;
        int count = 0;

        do{
            num /= 10;
            count++;
        }while(num > 0);
        System.out.println(count);
    }
}
