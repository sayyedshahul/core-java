package basics.oop.accessmodifiers.questions.question3.p2;

import basics.oop.accessmodifiers.questions.question3.p1.A;

public class Test{
    public static void main(String[] args){
        A a = new B();
        /*a.show(); error - As show is a protected member of A and can only be accessed outside A's package from a subclass of A and with
        a reference of that subclass.
        */
    }
}
