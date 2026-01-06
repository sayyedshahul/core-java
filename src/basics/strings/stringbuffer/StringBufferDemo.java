package basics.strings.stringbuffer;

public class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Kareem");

        System.out.println(sb.capacity()); //Gives the capacity by default it is 5 bytes.
        System.out.println(sb.length());

        sb.append(" Shaikh");
        System.out.println(sb);

        String str = sb.toString();

        sb.deleteCharAt(12);
        System.out.println(sb);

        sb.insert(7, "Ismail ");
        System.out.println("After insertion --> " + sb);

        System.out.println("Surname --> " + sb.substring(14));
        System.out.println("Middlename --> " + sb.substring(7, 13));

        char[] ch = {'a', 'e', 'i'};
        System.out.println("Before append --> " + sb);
        sb.append(ch, 1, 2); //Takes characters from given character array starting at offset index and until the len is met.
        System.out.println("After append --> " + sb);

        sb.appendCodePoint(128522); //Appends the string representation of unicode codepoints.
        System.out.println(sb);

        System.out.println(sb.codePointBefore(3));

        System.out.println(sb.codePointCount(2, 5));

        System.out.println(sb.compareTo(new StringBuffer("Rahul")));//compare lexicographically.

        sb.delete(7, 14); // delete substring from  7 to 13.
        System.out.println("After delete --> " + sb);

        System.out.println(sb.lastIndexOf(""));
        sb.setLength(34);
        System.out.println(sb);
        System.out.println(sb.length());

        StringBuffer sb2 = new StringBuffer("Java Course");
        sb2.replace(5, sb2.length(),"Study");
        System.out.println(sb2);
        System.out.println(sb2.reverse());

        System.out.println("New value after reverse --> " + sb2);
        StringBuffer sb3 =  new StringBuffer(sb2.toString());
        System.out.println(sb3);
        System.out.println(sb3 == sb2);
        System.out.println(sb3.equals(sb2)); //StringBuffer doesn't override equals, so this equals check object reference not content.
    }
}
