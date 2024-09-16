public class Kadane {
    public static void subarray(int array[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int n = array.length;
        for(int i=0; i<n; i++){
            cs += n;
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Sum : " + ms);
    }
    public static void main(String[] args) {
        int array[] = {2,3,4};
        subarray(array);
    }
}
