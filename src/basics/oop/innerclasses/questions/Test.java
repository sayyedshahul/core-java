package basics.oop.innerclasses.questions;

class Outer{
    int x = 67;

    class Inner{
        void show(){
            System.out.println("x = " + x);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
