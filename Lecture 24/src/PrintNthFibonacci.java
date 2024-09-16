import java.util.*;
public class PrintNthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }
    public static int Fibo(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = Fibo(n-1);
        int fibnm2 = Fibo(n-2);

        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
}