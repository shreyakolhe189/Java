import java.util.*;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=n; j>=i; j--){
                System.out.print(" " + " ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
