package basics.arrays;

public class EnhancedForLoop {
    public static void main(String[] args){
        int[][] nums = new int[3][4];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        //Enhanced for loop.
        for(int[] num: nums){
            for(int n: num){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
