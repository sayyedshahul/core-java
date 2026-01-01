package basics.switchcase.enhanced.questions;

public class VowelConsonant {
    public static void main(String[] args){
        char ch = 'B';
        String result = "";
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                result = switch(ch){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' ->
                     "vowel";
                default -> "consonant";
            };
        }
        else{
            System.out.println("This is not a valid letter");
        }
        System.out.println(result);
    }
}
