public class Subarray {
    public static void printSubarray(int array[]){
        int sumSubarray = 0;
        int n = array.length;
        for(int i=0; i<n; i++){
            //int start = i;
            for(int j=i; j<n; j++){
                //int end = j;
                for(int k=i; k<j; k++){
                    System.out.print(array[k] + " ");
                    // = m + array[k];
                }
                System.out.println();
            }
            System.out.println();
        }
        //System.out.println(m);
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        printSubarray(array);
    }
}
//homework max subarray