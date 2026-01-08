package basics.oop.accessmodifiers.sub;

public class A {
    public int marks; //This should be public to be visible outside the same package.
    private int rollno;
    String name;
    protected char division = 'A';

    public void show(){
        System.out.println("In A show");
    }
}
