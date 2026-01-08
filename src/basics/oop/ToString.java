package basics.oop;

class Country{
    String name;
    int gdp;

    public String toString(){
        return name + " " + gdp;
    }
}

public class ToString {
    public static void main(String[] args){
        Country india = new Country();
        india.name = "India";
        india.gdp = 2_000_000_00;
        System.out.println(india); // Before toString method, this output was basics.oop.Country@1b28cdfa.
    }
}
