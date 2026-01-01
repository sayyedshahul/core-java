package basics.switchcase.enhanced.questions;

public class WeekdaySwitchCase {
    public static void main(String[] args){
        int weekday = 7;
        String result = switch(weekday){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not a valid day";
        };
        System.out.println("The day is " + result);
    }
}
