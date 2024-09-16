import java.util.*;
public class Factorial {
    public static int fact(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int fac = fact(n);
        System.out.println("Factorial of " + n + " is " + fac);
    }
}
