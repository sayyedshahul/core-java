package basics.arrays;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args){
        int[][] nums = new int[3][3];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 1000);
            }
        }

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
