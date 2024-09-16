import java.util.*;
public class CheckPrime{
    public static void isPrime(int n){
//        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println("Not Prime");
                break;
            }else{
                System.out.println("Prime");
                break;
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        isPrime(n);
    }
}