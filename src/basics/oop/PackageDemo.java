package basics.oop;

import basics.oop.miscellaneous.*;

public class PackageDemo {
    public static void main(String[] args){
        Calc calc = new Calc(); // class from another package must be imported first.
        AdvCalc advCalc = new AdvCalc();
        Calculator calc2 = new Calculator();// class inside the same package can be called directly.
        System.out.println(calc.add(3, 5));
        System.out.println(advCalc.power(2, 2));
        calc2.add(4, 9);
    }
}
