import java.util.*;
public class searchMatrixElement {
    public static void largest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                max = Math.max(max,matrix[i][j]);
                min = Math.min(min,matrix[i][j]);
            }
        }
        System.out.println("Largest element is : " + max);
        System.out.println("Smallest element is : " + min);
    }
    public static boolean searchElement(int matrix[][],int key){
        boolean isFound = false;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){

                if(matrix[i][j] == key){
                    System.out.println("Key found at " + "(" + i +" , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("Matrix is : ");

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 2, m = 2;
        //initialise matrix
        int matrix[][] = new int[n][m];

        //input matrix
        System.out.println("Enter matrix elements : ");

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //calls
        printMatrix(matrix);

        //key
        System.out.println("Enter key to be searched");
        int key = sc.nextInt();
        searchElement(matrix,key);
        largest(matrix);
    }
}
