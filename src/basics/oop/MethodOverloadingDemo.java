package basics.oop;

class Calculator2{
    public int add(int num1 , int num2){
        return num1 + num2;
    }

    public int add(int num1 , int num2, int num3){
        return num1 + num2;
    }

    public double add(int num1 , double num2){
        return num1 + num2;
    }

    public double add(double num1 , int num2){
        return num1 + num2;
    }

}

public class MethodOverloadingDemo {
    public static void main(String[] args){
        Calculator2 calc = new Calculator2();
        System.out.println(calc.add(4, 6));
    }
}
