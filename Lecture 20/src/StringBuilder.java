public class StringBuilder {
    public static void main(String args[]){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        //add letters
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
