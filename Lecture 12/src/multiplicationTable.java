import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int table = n;
        for(int i=1; i<=10; i++){
            table = n * i;
            System.out.println( n + " * " + i + " = " + table);
        }
    }

}
