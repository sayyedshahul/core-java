package basics.oop;

public class FinalKeywordDemo {
    public static void main(String[] args){
        final int num = 9;
        //num = 4; This will throw an error.
        System.out.println(num);
    }
}
