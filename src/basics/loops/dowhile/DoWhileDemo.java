package basics.loops.dowhile;

public class DoWhileDemo {
    public static void main(String[] args){
        int numberOfGamesLeft = 0;
        do{
            System.out.println("Current game " + numberOfGamesLeft);
            numberOfGamesLeft--;
        }while(numberOfGamesLeft > 0);
    }
}
