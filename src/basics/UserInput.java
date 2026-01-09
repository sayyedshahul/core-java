package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter something: ");

        //Method Number 1
        int num = System.in.read();
        System.out.println("Using System.in --> " + num);

        //Method Number 2
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputReader);
        System.out.print("Enter something: ");
        reader.readLine(); // To discard previous left over input.
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Using BufferedReader --> " + num2);

        //Method Number 3
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter something: ");
        System.out.println("Using Scanner --> " + scn.nextInt());
    }
}
