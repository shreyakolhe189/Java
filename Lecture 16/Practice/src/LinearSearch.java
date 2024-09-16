import java.util.*;
public class LinearSearch{
    public static int index(int array[], int key){
        for(int i=0; i<array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Enter key to find");
        int key = sc.nextInt();
        int index = index(array,key);
        if(index == -1){
            System.out.println("Enter valid key");
        }else{
            System.out.println(key + " is at index " + index);
        }
    }
}