package basics.oop.interfaces.demo;

@FunctionalInterface
interface RetryPolicy{
    void showPolicy(String i, int j);
}

interface Calculator{
    int add(int i, int j);
}

public class LambdaExpression {
    public static void main(String[] args){
        RetryPolicy retryPolicy = (i, j) -> System.out.println("Showing policy......." + i + " " + j);
        RetryPolicy retryPolicy2 = (i, j) -> {
            System.out.println("Showing policy2......." + i + " " + j);
        };

        retryPolicy.showPolicy("New", 23);
        retryPolicy2.showPolicy("New2", 45);

        Calculator calc = new Calculator(){
            public int add(int i, int j){
                return i + j;
            }
        };
        System.out.println(calc.add(3, 4));

        Calculator calc2 = (i, j) -> {
                return i + j;
        };
        System.out.println(calc.add(3, 4));

        Calculator calc3 = (i, j) -> i + j;
        System.out.println(calc3.add(3, 4));
    }
}
