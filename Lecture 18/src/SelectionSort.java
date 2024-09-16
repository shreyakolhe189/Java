public class SelectionSort {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minpos = i;
            for(int j=i+1; j<n; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
}
