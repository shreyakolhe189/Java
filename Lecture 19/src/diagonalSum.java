public class diagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        for(int i=0; i<=n-1; i++){
            //primary diagonal sum
            sum += matrix[i][i];
            //secondary diagonal
            if(i != n-i-1){
                sum += matrix[i][n-i-1];
            }
        }

        return sum;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int sum = diagonalSum(matrix);
        System.out.println(sum);
    }
}
