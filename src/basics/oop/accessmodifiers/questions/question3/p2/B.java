package basics.oop.accessmodifiers.questions.question3.p2;

import basics.oop.accessmodifiers.questions.question3.p1.A;

public class B extends A {
    public static void main(String[] args){
        B b = new B();
        b.show(); // Here B is a subclass of A and we are using correct B reference variable.
    }
}
