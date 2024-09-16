import java.util.*;
public class Binomial_Coefficient {
    public static int factorial(int num){
        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        int x = n - r;

        int nn = factorial(n);
        int rr = factorial(r);
        int xx = factorial(x);

        int binomial = factorial(n)/ (factorial(r) * factorial(x)) ;

        System.out.println("Binomial coefficient is : " + binomial);
    }
}
