package basics.switchcase.enhanced.questions;

public class GradeRemarkSelector {
    public static void main(String[] args){
        char grade = 'A';
        String remarks = switch(grade){
            case 'A' -> "Excellent";
            case 'B' -> "Good";
            case 'C' -> "Average";
            case 'D' -> "Poor";
            case 'F' -> "Fail";
            default -> "Invalid grade";
        };
        System.out.println(remarks);
    }
}
