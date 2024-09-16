public class SelectionSort {
    //Question : Use the following sorting algorithms to sort an array in DESCENDING order :
    // Selection Sort
    // eg - [3,6,2,1,8,7,4,5,3,1]
    public static void selectionsort(int arr[], int n){

        for(int i=0; i<n-1; i++){
            int maxpos = i;
            for(int j=i+1; j<n-i-1; j++){
                if(arr[maxpos] < arr[j]){
                    arr[maxpos] = arr[j];
                }
            }
            if(arr[maxpos] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[maxpos];
                arr[maxpos] = temp;
            }
        }
    }
    public static void printarray(int arr[], int n){
        System.out.println("Sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;

        selectionsort(arr,n);
        printarray(arr,n);
    }
}
