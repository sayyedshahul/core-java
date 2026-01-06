package basics.strings.questions;

public class StringReverser {
    public static void main(String[] args){
        String name = "Simla";

        String reversedName = "";
        for(int i = name.length() - 1; i >= 0; i--){
            reversedName += name.charAt(i);
        }

        System.out.println(reversedName);
    }
}
