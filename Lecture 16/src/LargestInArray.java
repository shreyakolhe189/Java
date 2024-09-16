public class LargestInArray {
    public static int LargestNum(int array[]) {
        int largestNum = -1;
        for(int i=0; i<array.length; i++) {
            if(array[i] >= largestNum){
                largestNum = array[i];
            }
        }
        return largestNum;
    }
    public static void main(String[] args) {
        int array[] = {2,5,8,9,4,1,100};
        System.out.println("Largest number in array is : " + LargestNum(array));
    }
}