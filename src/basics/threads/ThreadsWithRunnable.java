package basics.threads;

class C implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsWithRunnable {
    public static void main(String[] args){
        C c = new C();
        D d = new D();

       Thread t1 = new Thread(c);
       Thread t2 = new Thread(d);

       t1.start();
       t2.start();

       Runnable thread = new Runnable(){
           public void run() {
               for (int i = 0; i < 5; i++) {
                   System.out.println("Bye");
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       };

       Thread t3 = new Thread(thread);
       t3.start();

        Runnable thread2 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Bye2");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };

        Thread t4 = new Thread(thread2);
        t4.start();

        Runnable thread3 = () -> {
          for(int i = 0; i < 5; i++){
              System.out.println("Good Morning");
              try{
                  Thread.sleep(10);
              }
              catch(InterruptedException e){
                  e.printStackTrace();
              }
          }
        };
        Thread t5 = new Thread(thread3);
        t5.start();
    }
}
