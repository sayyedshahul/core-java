package projects.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double num1;
    private double num2;
    private List<String> history = new ArrayList<>();
    private final int n = 5; // Max history entries.

    public List<String> getHistory(){
        return new ArrayList<>(history);
    }

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
        System.out.println("5. Show history");
        System.out.print("--> ");
    }

    public void showHistory(){
        for(String historyEntry: history){
            System.out.println(historyEntry);
        }
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
        if(num2 == 0){
            throw new IllegalArgumentException("Can't divide by zero");
        }
        double result = (double) num1 / num2;
        return Math.round(result * 100) / 100.0; // To round answer to two decimal places.
    }

    public double performOperation(int operation){
        char operand = '+';
        String historyEntry;

        double result = switch(operation){
            case 1 -> {
                operand = '+';
                yield add(num1, num2);
            }
            case 2 -> {
                operand = '-';
                yield subtract(num1, num2);
            }
            case 3 -> {
                operand = '*';
                yield multiply(num1, num2);
            }
            case 4 ->{
                operand = '/';
                yield div(num1, num2);
            }
            default -> 0;
        };

        historyEntry = num1 + " " + operand + " " + num2 + " = " +  result;

        if(history.size() == n){
            history.remove(0);
        }
        history.add(historyEntry);

        return result;
    }
}
