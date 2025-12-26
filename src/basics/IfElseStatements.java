package basics;

public class IfElseStatements {
    public static void main(String[] args){
        int time = 17;

        if(time < 12){
            System.out.println("Good Morning");
        }
        else if(time >= 12 && time <= 16){
            System.out.println("Good Afternoon");
        }
        else{
            System.out.println("Good Night");
        }
    }
}
