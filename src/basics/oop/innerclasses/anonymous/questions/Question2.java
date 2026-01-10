package basics.oop.innerclasses.anonymous.questions;

public class Question2 {
    public static void main(String[] args) {
        int x = 10;   // ← THIS is the local variable

        Runnable r = new Runnable() {
            public void run() {
                System.out.println(x);
            }
        };

       // x = 20;
        r.run();
    }

}
