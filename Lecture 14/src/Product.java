import java.util.*;
public class Product {
    public static void multiply(int a, int b){
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        multiply(a,b);
    }
}
