import java.util.*;
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // for loop
//        int sum = 0;
//        for(int i=1; i<=n; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

        //while loop
//        int i = 1;
//        int sum = 0;
//        while(i <= n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

        //do while loop
        int i = 1;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        }while(i <= n);
        System.out.println(sum);
    }
}
