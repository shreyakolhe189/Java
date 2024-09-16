import java.util.*;
public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
    public static int printSum(int n) {
        if(n==1){
            return 1;
        }
        int sumNM1 = printSum(n-1);
        int sum = n + printSum(n-1);
        return sum;
    }
}
