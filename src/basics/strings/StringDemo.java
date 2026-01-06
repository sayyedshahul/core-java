package basics.strings;

/* The String Constant Pool is a special area in the heap where JVM stores
   and reuses string literals to optimize memory usage.
 */
public class StringDemo {
    public static void main(String[] args){
        String name = "Imran"; //This creates a new string in SCP if already not available.
        System.out.println(name);
        String name2 = new String("Rahul"); //This creates a new String object in the heap.
        System.out.println(name2);

        System.out.println(name.hashCode()); //Prints the hashcode for given string.

        System.out.println(name2.charAt(4)); //Prints the character at a given index.
        
        System.out.println(name2.concat(" Pandey")); //Concatenates two strings.
    }
}
