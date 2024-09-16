public class updateIthBit {
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearithbit(int n, int i){
        int bitmask = 1 << i;
        return n & ~bitmask;
    }
    public static int updateithbit(int n, int i, int newbit){
        if(newbit == 0){
            clearithbit(10,2);
        }else{
            setIthBit(10,2);
        }
        return;
    }
    public static void main(String[] args){
        System.out.println(updateithbit(10,2,1));
    }
}
