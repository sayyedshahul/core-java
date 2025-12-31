package basics.switchcase;

public class SwitchCase {
    public static void main(String[] args){
        int month = 7;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6, 7, 8:
                System.out.println("For multiple months between 6-8");
                break;
            default:
                System.out.println("Months after 8");
        }
    }
}
