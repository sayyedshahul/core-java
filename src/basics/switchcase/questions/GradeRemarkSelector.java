package basics.switchcase.questions;

//Write a program to print remark according to the grade obtained using switch statement.
public class GradeRemarkSelector {
    public static void main(String[] args){
        char grade = 'S';
        switch(grade){
            case 'A':
                System.out.println("Very Good");
                break;
            case 'B':
                System.out.println("OK");
                break;
            case 'C':
                System.out.println("Bad");
                break;
            case 'D':
                System.out.println("Just pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a valid grade");
                break;
        }
    }
}
