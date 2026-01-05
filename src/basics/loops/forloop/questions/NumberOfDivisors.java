package basics.loops.forloop.questions;

//Print the divisor count for n.
public class NumberOfDivisors {
    public static void main(String[] args){
        int n = 47;
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
