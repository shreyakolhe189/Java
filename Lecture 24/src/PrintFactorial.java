import java.util.*;
public class PrintFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fac(n));
    }
    public static int fac(int n) {
        if(n==0){
            return 1;
        }
        int fnm1 = fac(n-1);
        int fn = n * fac(n-1);
        return fn;
    }
}