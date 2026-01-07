package basics.oop.inheritance;

class A{
    public A(){
        super(); //Here super() represents the constructor of the Object class.
        System.out.println("In A");
    }

    public A(int n){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        System.out.println("In B");
    }

    public B(int n){
        //super(n); // To call the parameterized constructor of the super class, we have to explicitly mention it. Otherwise, every constructor in java has it's first statement as super().
        this();
        System.out.println("In B int");
    }
}

public class ThisAndSuper {
    public static void main(String[] args){
        B b = new B(5);
    }
}
