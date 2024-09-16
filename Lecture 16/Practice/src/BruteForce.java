public class BruteForce {
    public static void subarray(int array[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int n = array.length;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i+1; j<n; j++){
                int end = j;
                currentSum = 0;
                for(int k=start; k<=end; k++){
                    currentSum = currentSum + array[k];

                }
                System.out.print("Current = " + currentSum);
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
                System.out.println();
            }
        }
        System.out.print("Maxsum = " + maxSum);
    }
    public static void main(String args[]){
        int array[] = {2,3,4};
        subarray(array);
    }
}
