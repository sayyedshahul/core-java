package basics.oop;

class Country{
    String name;
    int gdp;

    public String toString(){
        return name + " " + gdp;
    }

    public Boolean equals(Country country){
        return this.name.equals(country.name) && this.gdp == country.gdp;
    }
}

public class ToString {
    public static void main(String[] args){
        Country india = new Country();
        india.name = "India";
        india.gdp = 2_000_000_00;
        System.out.println(india); // Before toString method, this output was basics.oop.Country@1b28cdfa.

        Country india2 = new Country();
        india2.name = "India";
        india2.gdp = 2_000_000_00;

        System.out.println(india.equals(india2)); //Successful after equals method is implemented in country class.
    }
}
