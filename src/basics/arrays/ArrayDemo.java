package basics.arrays;

public class ArrayDemo {
    public static void main(String[] args){
        int[] nums = {3, 62, 12, 45, 89};
        System.out.println(nums[3]);
        int[] num2 = new int[4];
        num2[0] = 1;
        num2[1] = 2;
        num2[2] = 95;
        num2[3] = 32;

        for(int i=0; i<4; i++){
            System.out.println(num2[i]);
        }
    }
}
