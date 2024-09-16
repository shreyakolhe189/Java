public class Question1 {
    //Question 1 :Print the number of 7’s that are in the 2d array.
    // Example :Input - int[][] array = { {4,7,8},{8,8,7} };
    // Output - 2
    public static int numberOfSeven(int array[][], int key){
        int count = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == key){
                    count++;
                }
            }
        }
        return count;
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
        int[][] array = { {4,7,8},{8,8,7} };
        int key = 7;

        printArray(array);

        int count = numberOfSeven(array,key);
        System.out.println("Count of 7 is : " + count);
    }
}
