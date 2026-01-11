package basics.threads;

class E{
    int count;
    public synchronized void increment(){
        count++;
    }
}

/*
A race condition happens when:
The result of a program depends on which thread runs first.
So the program becomes non-deterministic — sometimes correct, sometimes wrong —
depending on timing.

By using synchronized, only one thread can work with the method at a time.
*/

public class ThreadsRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        E e = new E();
        Runnable r1 = () -> {
            for(int i = 0; i < 10000; i++){
                e.increment();
            }
        };

        Runnable r2 = () -> {
            for(int i = 0; i < 10000; i++){
                e.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        t1.join();//Wait till the thread is completed.
        t2.join();

        System.out.println(e.count);
    }
}
