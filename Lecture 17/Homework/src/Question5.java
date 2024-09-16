public class Question5 {
    public static int triplet(int num[]){
        int n = num.length;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                for(int k=2; k<n; k++){
                    if((num[i] + num[j] + num[k]) == 0){

                    }
                    return j;
                }
                return i;
            }
        }
    }
    public static void main(String[] args){
        int num[] = {-1,0,1,2,-1,4};
        System.out.println(triplet(num));
    }
}
