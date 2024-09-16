public class Substring {
    public static String substring(String str, int startInd, int endInd){
        String substring = "";
        for(int i=startInd; i<endInd; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args){
        String str = "Hello World";
        //String strsub = substring(str,0,7);
        //System.out.println(strsub);
        System.out.println(str.substring(0,5));
    }
}
