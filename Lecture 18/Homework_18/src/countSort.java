public class countSort {
    public static void countsort(int arr[]){
        int largest = Integer .MIN_VALUE ;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            smallest = Math.min(smallest, arr[i]);
        }
        int count[] = new int[smallest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countsort(arr);
        printarr(arr);
    }
}
