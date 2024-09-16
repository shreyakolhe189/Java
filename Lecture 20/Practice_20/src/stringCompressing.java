public class stringCompressing {
    public static String compressing(String str){
        String nString = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            nString += str.charAt(i);
            if(count > 1){
                nString += count.toString();
            }
        }
        return nString;
    }
    public static void main(String[] args){
        String str = "aaaabbbccd";
        System.out.println(compressing(str));
    }
}
