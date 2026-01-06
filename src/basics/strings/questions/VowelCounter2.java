package basics.strings.questions;

public class VowelCounter2 {
    public static void main(String[] args){
        String name = "Raheem";

        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        name = name.toLowerCase();

        for(int i = 0; i < name.length(); i++){
            for(char c : vowels){
                if(name.charAt(i) == c)
                    count++;
            }
        }

        System.out.println(count);
    }
}
