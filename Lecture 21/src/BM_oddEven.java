public class BM_oddEven{
    public static void oddEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args){
        oddEven(7);
    }
}