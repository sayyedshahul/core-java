package basics.oop.accessmodifiers;

import basics.oop.accessmodifiers.sub.A;

public class AccessModifiersDemo extends A {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.marks);
        //System.out.println(a.rollno); rollno has private access, so can't be accessed from here.
        //System.out.println(a.name); name has default access, so it is not accessible outside package.
        //System.out.println(a.division); This is not possible, we have to create object of AccessModifiersDemo first.
        AccessModifiersDemo ac = new AccessModifiersDemo();
        System.out.println("Division --> " + ac.division);
        a.show(); //a.show() is only accessible here when it is made public.

        B b = new B();
        System.out.println(b.marks);
    }
}
