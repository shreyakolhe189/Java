public class subarrays{
    public static void subarray(int array[]){
        int count = 0; //total no. of pairs
         //sum of each subarray
        int currentSum= 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<array.length+1; i++) {
            int start = i;
            for (int j = i + 1; j < array.length+1; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    currentSum += array[k];
                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
                System.out.println();
               // count = count + 1;
            }
            System.out.println();

        }
        //System.out.println("Pairs = " + count);
        System.out.println("MAx sum = " + maxSum);
    }
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6};
        subarray(array);
    }
}