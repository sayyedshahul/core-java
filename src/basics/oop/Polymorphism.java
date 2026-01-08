package basics.oop;

class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        int n = 2; //This can be from user or depending on some external source.
        A a;
        if(n == 1){ //Depending on this, either A show or B show will be called, and that will be decide only at runtime.(Runtime polymorphism)
            a = new B();
        }
        else{
            a = new A();
        }
        a.show();
    }
}
