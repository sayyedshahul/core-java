package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        try(BufferedReader br = new BufferedReader(in)){
            System.out.println("Enter something: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
