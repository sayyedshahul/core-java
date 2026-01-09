package basics.oop.accessmodifiers.questions.question2.p2;

import basics.oop.accessmodifiers.questions.question2.p1.A;
import basics.oop.accessmodifiers.questions.question2.p2.B;

public class Test{
    public static void main(String[] args) {
        A a = new B();
        /*System.out.println(a.marks); error - As marks is a protected member of A and can only be accessed outside A's package from a subclass of A and with
        a reference of that subclass.
        */
    }
}
