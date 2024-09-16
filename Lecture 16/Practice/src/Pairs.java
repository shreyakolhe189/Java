public class Pairs{
    public static void pairs(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int array[] = {2,3,4,5,6};
        pairs(array);
    }
}