package projects.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double num1;
        double num2;

        int operation = 0;
        char isContinue = 'y';

        Scanner scn = new Scanner(System.in);
        Calculator calc = new Calculator();

        while(isContinue == 'y') {
            System.out.print("Input number 1: ");
            num1 = scn.nextDouble();
            System.out.print("Input number 2: ");
            num2 = scn.nextDouble();

            calc.setNum1(num1);
            calc.setNum2(num2);

            calc.showMenu();
            operation = scn.nextInt();
            while(operation < 1 || operation > 4){
                System.out.println("Invalid operation.");
                calc.showMenu();
                operation = scn.nextInt();
            }

            if (operation == 4 && num2 == 0) {
                System.out.println("result = Undefined(Divide by zero)");
            } else {
                System.out.println("result = " + calc.performOperation(operation));
            }

            System.out.print("Do you want to continue(y/n): ");
            isContinue = scn.next().charAt(0);
        }

    }
}
