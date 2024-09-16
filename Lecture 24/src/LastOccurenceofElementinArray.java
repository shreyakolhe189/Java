import java.util.*;
public class LastOccurenceofElementinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int arr[] = {2,3,5,6,9,6,4,3,5};
        System.out.println(ind(arr,n,0));
    }
    public static int ind(int arr[], int n, int i) {
        if(i == arr.length){
            return -1;
        }
        
    }
}
