package basics.oop;

import java.util.Objects;

class Country{
    String name;
    int gdp;

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", gdp=" + gdp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return gdp == country.gdp && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gdp);
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
