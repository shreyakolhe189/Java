import java.util.*;
public class PrimesRange{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static int PrimesinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        return 2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range : ");
        int n = sc.nextInt();
        PrimesinRange(n);
    }
}