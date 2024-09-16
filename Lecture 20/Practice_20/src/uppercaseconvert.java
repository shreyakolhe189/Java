public class uppercaseconvert {
    public static String convert(String str){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == ' '){
                sb.append(str.charAt(i-1));
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "hi i am shreya";
        System.out.println(convert(str));
    }
}
