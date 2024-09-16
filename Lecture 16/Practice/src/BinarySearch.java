import java.util.*;
public class BinarySearch{
    public static int binary(int array[],int key){
        int start = 0;
        int end = array.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        //int array[] = {2,4,6,8,10,12,14};
        System.out.println("Enter key to find : ");
        int key = sc.nextInt();
        //int key = 8;
        System.out.println(key + " is at index " + binary(array,key));
    }
}