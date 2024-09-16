public class getIthbit{
    public static int getIthbit(int n, int i){
        int bitmask = 1;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println(getIthbit(11,2));
    }
}