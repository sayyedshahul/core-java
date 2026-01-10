package basics.oop.innerclasses.anonymous;

class A{
    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){
        A a = new A(){
            public void show(){
                System.out.println("In B show");
            }
        };
        a.show();
    }
}
