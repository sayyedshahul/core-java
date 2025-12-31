package basics.switchcase.questions;

public class VowelConsonant {
    public static void main(String[] args){
        char ch = 'E';
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            switch(ch){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    System.out.println("This a vowel");
                    break;
                default:
                    System.out.println("This is a consonant");
                    break;
            }
        }
        else{
            System.out.println("Not a valid alphabet.");
        }
    }
}
