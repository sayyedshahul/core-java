package basics.oop.accessmodifiers.questions.question2.p2;

import basics.oop.accessmodifiers.questions.question2.p1.A;

public class B extends A{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.marks); // Here B is a subclass of A and we are using correct B reference variable.
    }
}
