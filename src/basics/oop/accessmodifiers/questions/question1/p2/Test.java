package basics.oop.accessmodifiers.questions.question1.p2;

import basics.oop.accessmodifiers.questions.question1.p1.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.x); error - x is private.
//        System.out.println(a.y); error - y is default.
//        System.out.println(a.z); error - z is protected.
        System.out.println(a.w);
    }
}
