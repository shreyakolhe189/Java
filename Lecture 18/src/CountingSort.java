//public class CountingSort {
//    //counts frequency of a number
//    public static void countSort(int arr[]){
//        int largest = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            largest = Math.max(largest,arr[i]);
//        }
//
//        int count[] = new int[largest+1];
//        for(int i=0; i<arr.length; i++){
//            count[arr[i]]++;
//        }
//
//        int j=0;
//        for(int i=0; i<count.length; i++){
//            while(count[i] > 0){
//                arr[j] = i;
//                j++;
//                count[i]--;
//            }
//        }
//    }
//    public static void printarray(int arr[]){
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String args[]){
//        int arr[] ={1,4,3,2,1,5,7};
//        countSort(arr);
//        printarray(arr);
//    }
//}
public class InsertionSort{
    public static void insertionSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int i=0; i<arr.length; i++){
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,4,3,1,2,5,7,4};

        printarr(arr);
    }
}