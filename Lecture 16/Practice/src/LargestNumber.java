import java.util.*;
public class LargestNumber {
    public static int largestNum(int array[]){
        int max = -1;
        for(int i=0; i<array.length; i++){
            if(array[i] >= max){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxNum = largestNum(array);
        System.out.println("Largest number is : " + maxNum);
    }
}
