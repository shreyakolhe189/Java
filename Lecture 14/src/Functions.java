import java.util.*;
public class Functions{
    public static int summ(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        summ(a,b);
    }
}