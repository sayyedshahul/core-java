package basics.oop.exceptionhandling;

class InappropriateValueException extends Exception{
    public InappropriateValueException(String errorMessage){
        super(errorMessage);
    }
}

public class CustomException {
    public static void main(String[] args){
        int i = 98;
        int j = 0;

        try{
            j = 76 / i;
            if(j == 0)
                throw new InappropriateValueException("Inappropriate value received");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception --> " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception --> " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong..... " + e);
        }
        System.out.println("Program completed");
    }
}
