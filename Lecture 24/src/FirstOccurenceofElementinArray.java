import java.util.*;
public class FirstOccurenceofElementinArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(index(arr,n,0));
    }
    public static int index(int arr[],int n,int i) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }
        return index(arr,n,i+1);
    }
}
