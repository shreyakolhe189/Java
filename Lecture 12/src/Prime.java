import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
