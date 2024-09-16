

public class BubbleSort {
    //Question : Use the following sorting algorithms to sort an array in DESCENDING order :
    // Bubble Sort
    // Selection Sort
    // Insertion Sort
    // Counting Sort
    // eg - [3,6,2,1,8,7,4,5,3,1]
    public static void bubblesort(int arr[],int n){

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;

        bubblesort(arr,n);
        printArray(arr,n);
    }
}
