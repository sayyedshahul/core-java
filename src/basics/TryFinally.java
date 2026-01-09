package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryFinally {
    public static void main(String[] args) throws IOException, NumberFormatException {
        int num = 0;
        BufferedReader reader = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            reader = new BufferedReader(in);
            num = Integer.parseInt(reader.readLine());
            System.out.println(num);
        }
        finally{
            System.out.println("Closing reader...");
            reader.close();
        }
    }
}
