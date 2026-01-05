package basics.loops.forloop.questions;

public class EvenNumbers {
    public static void main(String[] args){
        int n = 10; //Print all even numbers till n.
        for(int i=2; i<=n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
