package projects.calculator;

public class Calculator {
    private double num1;
    private double num2;

    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public void showMenu(){
        System.out.println("Please select your operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("--> ");
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double div(double num1, double num2){
        double result = (double) num1 / num2;
        return Math.round(result * 100) / 100.0;
    }

    public double performOperation(int operation){
        return switch(operation){
            case 1 -> add(num1, num2);
            case 2 -> subtract(num1, num2);
            case 3 -> multiply(num1, num2);
            case 4 -> div(num1, num2);
            default -> 0;
        };
    }
}
