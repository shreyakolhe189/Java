import java.util.*;
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" " + " ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" " + " ");

                }
            }
            System.out.println();
        }
    }
}
