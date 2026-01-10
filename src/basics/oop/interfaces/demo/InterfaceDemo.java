package basics.oop.interfaces.demo;

interface Tv{
    void startTv();
    void stopTv();
}

class LgTv implements Tv{
     public void startTv(){
        System.out.println("Starting LG TV....");
    }

    public void stopTv(){
        System.out.println("Stopping LG TV....");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Tv lgTv = new LgTv();
        lgTv.startTv();
        try {
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
        lgTv.stopTv();
    }
}
