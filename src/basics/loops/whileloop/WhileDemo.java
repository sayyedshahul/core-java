package basics.loops.whileloop;

public class WhileDemo {
    public static void main(String[] args){
        int i = 1;
        while(i <= 5){
            System.out.println("Hi "+ i);
            i++;
            int j = 1;
            while(j <= 3){
                System.out.println("Hello " + j);
                j++;
            }
        }
    }
}
