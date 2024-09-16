public class Q1 {
    public static boolean valueRepeat(int array[]){
        int n = array.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int array[] = {1,2,3,1};
        if(valueRepeat(array) == true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
