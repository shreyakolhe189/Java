//method to compute the sum of the digits in an integer
//Take a variable sum = 0
//b.Find the last digit of the number
// c.Add it to the sum
// d.Repeat a & b until the number becomes 0
import java.util.*;
public class Sum {
    public static void sumIntegers(int n){
        int sum = 0;
        while(n > 0){
            //lastDigit
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();
        sumIntegers(n);
    }
}
