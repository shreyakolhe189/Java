public class Subarray {
    public static void subarray(int array[]){
        int n = array.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i+1; j<n; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            count++;
        }
        System.out.println("Total pairs = " + count);
    }
    public static void main(String[] args){
        int array[] = {2,3,4};
        subarray(array);
    }
}
