import java.util.*;
public class Printnumbersindecreasingorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursion(n);
    }
    public static void recursion(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }
}