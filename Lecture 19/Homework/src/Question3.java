//public class Question3 {
//    //Question 3 :Write a program to Find Transpose of a Matrix.
//    // What is Transpose?
//    // Transpose of a matrix is the process ofswapping therows to columns.
//    // For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23
//
//    public static void transposeOfMatrix(int matrix[][]){
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        int[][] transposedMatrix = new int[cols][rows];
//
//        for(int i=0; i< matrix.length; i++){
//            for(int j=0; j< matrix[0].length; j++){
//                transposedMatrix[j][i] = matrix[i][j];
//            }
//        }
//        //print
//        for(int i=0; i< matrix[0].length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.print(transposedMatrix[i][j]);
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        int matrix[][] = {{1,2,3},{4,5,6}};
//        transposeOfMatrix(matrix);
//
//    }
//}

public class Question3{
    public static void transpose(int array[][]){
        int rows = array.length;
        int cols = array[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i=0; i<array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        printArray(transpose);

    }
    public static void printArray(int array[][]){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int array[][] = {{1,2,3},{4,5,6}};
        printArray(array);
        transpose(array);
    }
}