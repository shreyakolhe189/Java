import java.util.*;
public class Printnumbersinincreasingorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recInt(n);
    }
    public static void recInt(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        recInt(n-1);
        System.out.println(n);
    }
}