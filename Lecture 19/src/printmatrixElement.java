import java.util.*;
public class printmatrixElement {
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int n = matrix.length;
        int m = matrix[0].length;
        //input matrix
        System.out.println("Enter matrix elements : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output matrix
        System.out.println("Matrix is :");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
