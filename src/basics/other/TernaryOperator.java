package basics.other;

public class TernaryOperator {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int result = num1 % num2 == 0 ? 1 : 0; //condition?true_value:false_value
        System.out.println(result);
    }
}
