import java.util.*;
public class BinarySearch{
    public static int binarySearch(int array[], int key){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] < key){ //right
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12,14,16};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key : ");
        int key = sc.nextInt();

        System.out.println(key + " is at index " + binarySearch(array,key));
    }
}