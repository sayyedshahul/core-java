package basics.oop;

public class WrapperClasses {
    public static void main(String[] args){
        Integer num = new Integer(4); //Boxing
        System.out.println(num);

        Integer num1 = 9; // Auto-boxing
        System.out.println(num1);

        int num3 = num1.intValue(); // Un-boxing
        System.out.println(num3);

        int num4 = num1; // Un-boxing
        System.out.println(num4);

        Double d = 23.45;
        Character c = 'A';

        String str = "12";
        int result = Integer.parseInt(str) * 2;
        System.out.println(result);
    }
}
