//public class staircaseSearch {
//    public static boolean staircasesearch(int matrix[][],int key){
//
//        int row = 0;
//        int col = matrix[0].length-1;
//
//        while(row < matrix.length && col >= 0){
//            if(matrix[row][col] == key){
//                System.out.print("Key found at (" + row + " , " + col + ")");
//                return true;
//            } else if(matrix[row][col] > key){
//                col--;
//            } else{
//                row++;
//            }
//        }
//        System.out.println("Key not found.");
//        return false;
//    }
//    public static void main(String[] args){
//        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//        int key = 33;
//        staircasesearch(matrix,key);
//    }
//}

public class staircaseSearch{
    public static boolean stairSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.print("Key found at (" + row + " , " + col + ")");
                return true;
            }else if(matrix[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found.");
        return false;

    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 20;
        stairSearch(matrix,key);
    }
}