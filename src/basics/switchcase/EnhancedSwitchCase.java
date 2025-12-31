package basics.switchcase;

public class EnhancedSwitchCase {
    public static void main(String[] args){
        char ch = 'f';
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            switch(ch){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' ->
                    System.out.println("This a vowel");
                default ->
                    System.out.println("This is a consonant");
            }
        }
        else{
            System.out.println("Not a valid alphabet.");
        }
    }
}
