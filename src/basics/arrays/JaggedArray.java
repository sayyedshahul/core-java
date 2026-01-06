package basics.arrays;

public class JaggedArray {
    public static void main(String[] args){
        int[][] nums = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[4];
        nums[2] = new int[3];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 100);//Math.random generates random value between 0.0 and 1.0 excluding 1.0.
            }
        }

        for(int[] arr: nums){
            for(int n: arr){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
