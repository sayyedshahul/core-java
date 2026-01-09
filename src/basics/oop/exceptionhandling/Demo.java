package basics.oop.exceptionhandling;

public class Demo {
    public static void main(String[] args){
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            System.out.println("Statement ran successfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
