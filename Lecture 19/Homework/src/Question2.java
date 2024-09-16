public class Question2 {
    //Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
    // Example :
    // Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    // Output - 18
    public static int sumSecondRow(int nums[][]){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(i == 1){
                    sum += nums[i][j];
                }
            }
        }
        return sum;
    }
    public static void printnums(int nums[][]){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };

        printnums(nums);
        int sum = sumSecondRow(nums);
        System.out.println("Sum of Second row elements is : " + sum);
    }
}
