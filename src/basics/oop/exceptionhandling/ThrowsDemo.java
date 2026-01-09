package basics.oop.exceptionhandling;

import static java.lang.Class.forName;

class Demo2{
    public void show() throws ClassNotFoundException{
            Class.forName("A");
    }
}

public class ThrowsDemo {
    public static void main(String[] args){
        Demo2 demo = new Demo2();
        try {
            demo.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found --> " + e);
            e.printStackTrace();
        }
    }
}
