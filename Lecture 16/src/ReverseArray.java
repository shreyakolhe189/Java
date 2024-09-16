public class ReverseArray{
    public static void arrayReverse(int array[]){
        int start = 0, end = array.length-1;
        while(start < end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        arrayReverse(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}