import java.util.*;
public class PrimesInRange {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void PrimesRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range : ");
        int n = sc.nextInt();
        PrimesRange(n);

    }

}
