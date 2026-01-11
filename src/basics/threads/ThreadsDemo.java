package basics.threads;

class A extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());
        System.out.println(b.getPriority());

        a.setPriority(5);
        b.setPriority(Thread.NORM_PRIORITY);
        a.start();
        b.start();
    }
}
