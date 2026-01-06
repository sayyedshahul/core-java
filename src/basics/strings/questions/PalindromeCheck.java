package basics.strings.questions;

public class PalindromeCheck {
    public static void main(String[] args){
        String word = "madame";

        int a = 0;
        int b = word.length() - 1;
        boolean isPalindrome = true;

        while(a < b){
            if (word.charAt(a) != word.charAt(b)) {
                isPalindrome = false;
                break;
            }
            a++;
            b--;
        }

        if(isPalindrome) {
            System.out.println(word + " is a palindrome.");
        }
        else{
            System.out.println(word + " is not a palindrome.");
        }
    }
}
