package basics.loops.forloop.questions;

public class FactorialOfANumber {
    public static void main(String[] args){
        int n = 9;
        int result = 1;
        for(int i=2; i<=n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
