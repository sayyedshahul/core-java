package projects.calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double num1;
        double num2 = 0;
        double result;

        int operation = 0; // Menu option number for selected operation.
        boolean continueCalculating = true; // Choice to continue next calculation.
        boolean useFreshOperands = true; // Take fresh operands.

        Scanner scn = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(continueCalculating) {
            calc.showMenu();
            operation = scn.nextInt();
            while (operation < 1 || operation > 5) {
                System.out.println("Invalid operation.");
                calc.showMenu();
                operation = scn.nextInt();
            }

            if (operation == 5) {
                calc.showHistory();
            } else {
                if (!calc.getHistory().isEmpty()) {
                    System.out.print("Do you want to enter new operands(y/n): ");
                    useFreshOperands = scn.next().toLowerCase().startsWith("y");
                }

                if (useFreshOperands) {
                    System.out.print("Input number 1: ");
                    num1 = scn.nextDouble();
                    System.out.print("Input number 2: ");
                    num2 = scn.nextDouble();

                    calc.setNum1(num1);
                    calc.setNum2(num2);
                }

                try {
                    result = calc.performOperation(operation);
                    System.out.println("result = " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("result = " + e);
                }
            }

            System.out.print("Do you want to continue(y/n): ");
            continueCalculating = scn.next().toLowerCase().startsWith("y");
        }
        scn.close();
    }
}
