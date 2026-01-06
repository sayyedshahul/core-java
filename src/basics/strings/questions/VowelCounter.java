package basics.strings.questions;

public class VowelCounter {
    public static void main(String[] args){
        String name = "Suresh";

        name = name.toLowerCase();
        int count = 0;
        String vowels = "aeiou";

        for(int i = 0; i < name.length(); i++){
            if(vowels.indexOf(name.charAt(i)) != -1)
                count++;
        }

        System.out.println(count);
    }
}
