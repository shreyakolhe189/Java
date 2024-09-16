import java.util.*;
public class Palindrome{
    public static void palindromeOrNot(int n){

        for(int i=1; i<=n/2; i++){
            int lastDigit = n % 10;
            if(i == lastDigit){
                System.out.println("Palindrome");
                break;
            }else{
                System.out.println("Not Palindrome");

            }
            n = n / 10;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome : ");
        int n = sc.nextInt();
        palindromeOrNot(n);
    }
}
