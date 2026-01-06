package basics.oop;

class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }
}
public class OOPDemo {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 7;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
