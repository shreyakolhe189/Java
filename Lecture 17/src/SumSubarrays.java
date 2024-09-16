public class SumSubarrays {
    //sum of each sub array
    public static void subarray(int array[]){
        int n = array.length;
        int maxSubarray = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i+1; j<n; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++){
                    //System.out.print(array[k] + " ");
                    currentSum += array[k];
                }
                System.out.print("current : " + currentSum);
                if(currentSum > maxSubarray) {
                    maxSubarray = currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        //max sub arra
        System.out.println("MAx sum subarray : " + maxSubarray);
    }
    public static void main(String[] args){
        int array[] = {2,3,4};
        subarray(array);
    }
}
