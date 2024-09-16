public class ReverseArray{
    public static void reverse(int array[]){
        int first = 0;
        int last = array.length - 1;
        while(first < last){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int array[] = {2,4,5,6,7,8,9};
        reverse(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
