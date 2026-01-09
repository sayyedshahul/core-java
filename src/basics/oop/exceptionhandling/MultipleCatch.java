package basics.oop.exceptionhandling;

public class MultipleCatch {
    public static void main(String[] args){
        int i = 6;
        int j = 0;
        int[] nums = new int[4];
        String name = null;

        try{
            System.out.println(name.length());
            j = 76 / i;
            System.out.println(nums[4]);
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
