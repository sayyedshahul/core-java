package basics.switchcase.questions;

public class VowelConsonant {
    public static void main(String[] args){
        char ch = '7';
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            switch(ch){
                case 'a', 'A':
                case 'e', 'E':
                case 'i', 'I':
                case 'o', 'O':
                case 'u', 'U':
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
