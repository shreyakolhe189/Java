import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial : ");
        int n = sc.nextInt();

        int i = 1;
        int factorial = 1;
        while (i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is : " + factorial);
    }
}
