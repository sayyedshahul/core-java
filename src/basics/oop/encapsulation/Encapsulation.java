package basics.oop.encapsulation;

class Hotel{
    private double earnings;
    private String name;

    public double getEarnings(){
        return earnings;
    }

    public String getName(){
        return name;
    }

    public void setEarnings(double earnings){
        this.earnings = earnings;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Hotel h1 = new Hotel();
        h1.setEarnings(323_244_243.21);
        h1.setName("Taj Hotel");
        System.out.println(h1.getName() + " --> " + h1.getEarnings());
    }
}
