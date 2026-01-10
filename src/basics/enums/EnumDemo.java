package basics.enums;

import java.util.Arrays;

enum Status{
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumDemo {
    public static void main(String[] args){
        Status s = Status.FAILED;
        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println("name method output --> " + s.name());

        Status[] statuses = Status.values();// To get all the values.
        System.out.println(Arrays.toString(statuses));

        if(s == Status.RUNNING){
            System.out.println("No issues encountered till now.");
        }
        else if(s == Status.FAILED){
            System.out.println("Batch job failed");
        }
        else if(s == Status.PENDING){
            System.out.println("Batch job not yet started");
        }
        else{
            System.out.println("Batch job executed successfully");
        }

        s = Status.PENDING;
        switch(s){
            case RUNNING:
                System.out.println("No issues encountered till now.");
                break;
            case FAILED:
                System.out.println("Batch job failed");
                break;
            case PENDING:
                System.out.println("Batch job not yet started");
                break;
            case SUCCESS:
                System.out.println("Batch job executed successfully");
                break;
        }

        s = Status.RUNNING;
        switch(s){
            case RUNNING ->
                System.out.println("No issues encountered till now.");
            case FAILED ->
                System.out.println("Batch job failed");
            case PENDING ->
                System.out.println("Batch job not yet started");
            case SUCCESS ->
                System.out.println("Batch job executed successfully");
        }

        s = Status.SUCCESS;
        String currstatusdesc = switch(s){
            case RUNNING ->{
                   yield  "No issues encountered till now.";
            }
            case FAILED ->{
                    yield "Batch job failed";
            }
            case PENDING ->{
                    yield "Batch job not yet started";
            }
            case SUCCESS ->{
                    yield "Batch job executed successfully";
            }
        };
        System.out.println("FINAL STATUS --> " + currstatusdesc);
    }
}
