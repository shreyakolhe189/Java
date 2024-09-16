import java.util.*;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //print even numbers
        int evenSum = 0;
        System.out.print("Even numbers : ");
        for(int i=2; i<=n; i=i+2){
            System.out.print(i + " ");
            evenSum = evenSum + i;
        }
        System.out.println();
        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println();

        //odd numbers
        int oddSum = 0;
        System.out.print("Odd numbers : ");
        for(int i=1; i<=n; i=i+2){
            System.out.print(i + " ");
            oddSum = oddSum + i;
        }
        System.out.println();
        System.out.println("Sum of odd numbers : " + oddSum);
        System.out.println();
    }
}
