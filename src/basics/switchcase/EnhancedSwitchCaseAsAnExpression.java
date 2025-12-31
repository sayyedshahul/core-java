package basics.switchcase;

public class EnhancedSwitchCaseAsAnExpression {
    public static void main(String[] args){
        String day = "Friday";
        //switch returns a value here.
        String result = switch(day){
            case "Monday", "Sunday" -> "6am";
            default -> "9am";
        };
        System.out.println("Alarm time -> " + result);

        //using the yield keyword.
        String drink = switch(day){
            case "Monday", "Sunday" ->  {
                yield "Tea";
            }
            default -> {
               yield "Coffee";
            }
        };
        System.out.println("Today's drink is " + drink);
    }
}
