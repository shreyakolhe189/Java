public class ArrayPairs{
    public static void arrayPairs(int array[]){
        int n = array.length;
        for(int i=0; i<n; i++){
            int current = array[i];
            for(int j=i+1; j<n; j++){
                System.out.print("(" + current + "," + array[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        arrayPairs(array);
    }
}