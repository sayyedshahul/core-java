package basics.loops.whileloop.questions;

public class MultiplicationTable {
    public static void main(String[] args){
        int num = 23;
        int i = 1;
        int result;
        while(i <= 10){
            result = num * i;
            System.out.println(num + " X " + i + " = " + result);
            i++;
        }
    }
}
