public class Question1{
    public static boolean repeats(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4};
        if(repeats(array) == true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}