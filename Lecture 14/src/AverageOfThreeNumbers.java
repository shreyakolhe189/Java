import java.util.*;
public class AverageOfThreeNumbers {
    public static void Average(int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("Average is : " + average);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average(a,b,c);
    }
}
